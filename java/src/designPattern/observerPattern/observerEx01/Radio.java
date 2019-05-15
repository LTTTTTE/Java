package designPattern.observerPattern.observerEx01;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radio implements Transmission {

    private BroadCastStation station;
    private String radioName;
    private JFrame frame;
    private JTextArea broadCastedText;
    private JTextArea broadCastingText;
    private JButton buttonSend;

    public Radio(BroadCastStation station){

        this.radioName = "Anonymous";

        this.station = station;
        station.addReceiver(this);

        frame = new JFrame("Radio");
        frame.setSize(480,800);
        frame.setVisible(true);

        broadCastedText = new JTextArea();
        broadCastingText = new JTextArea();
        buttonSend = new JButton();
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!broadCastingText.getText().equals(""))
                    station.broadCasting("\n [" +getRadioName()+ "] : " +broadCastingText.getText());
                broadCastingText.setText("");
            }
        });
        Container panel = frame.getContentPane();
        panel.setLayout(null);

        broadCastedText.setBounds(0,0,478,696);
        broadCastingText.setBounds(0,698,296,96);
        buttonSend.setBounds(298,698,178,98);

        broadCastedText.setEditable(false);
        broadCastedText.setBorder(new LineBorder(Color.RED,2));

        broadCastingText.setBorder(new LineBorder(Color.BLUE,2));

        buttonSend.setBorder(new LineBorder(Color.GREEN,2));
        panel.add(broadCastedText);
        panel.add(broadCastingText);
        panel.add(buttonSend);

    }


    @Override
    public void broadCast(String msg) {
        broadCastedText.setText(broadCastedText.getText() + msg);
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String getRadioName() {
        return radioName;
    }
}
