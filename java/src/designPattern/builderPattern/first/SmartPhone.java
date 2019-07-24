package designPattern.builderPattern.first;

public class SmartPhone {

    private boolean body;
    private boolean screen;
    private boolean battery;
    private boolean speaker;
    private boolean camera;

    public static class Builder implements designPattern.builderPattern.first.Builder<SmartPhone> {

        private boolean body = false;
        private boolean screen = false;
        private boolean battery = false;
        private boolean speaker = false;
        private boolean camera = false;

        public Builder body(boolean body){
            this.body = body;
            return this;
        }

        public Builder screen(boolean screen){
            this.screen = screen;
            return this;
        }

        public Builder battery(boolean battery){
            this.battery = battery;
            return this;
        }

        public Builder speaker(boolean speaker){
            this.speaker = speaker;
            return this;
        }

        public Builder camera(boolean camera){
            this.camera = camera;
            return this;
        }

        @Override
        public SmartPhone build(){
            return new SmartPhone(this);
        }

    }

    public SmartPhone(Builder builder) {
        this.body = builder.body;
        this.screen = builder.screen;
        this.battery = builder.battery;
        this.speaker = builder.speaker;
        this.camera = builder.camera;
    }

    public void showSpec(){
        System.out.println("본체: "+body
                +"\n화면: "+screen
                +"\n배터리: "+battery
                +"\n스피커: "+speaker
                +"\n카메라: "+camera
        );
    }


}
