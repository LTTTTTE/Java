package designPattern.singletonPattern.singletonEx01;

public class SingletonEx01 {

    public static void main(String[] args) {

        User user = User.getInstance();

        user.showInfo();


    }
}
