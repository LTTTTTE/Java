package designPattern.builderPattern.test;

public class Person {

    private String name;
    private Integer height;
    private Integer money;
    private boolean hungry;

    public static class Builder{

        private String name = "";
        private Integer height = 0;
        private Integer money = 0;
        private boolean hungry = false;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder height(Integer height){
            this.height = height;
            return this;
        }

        public Builder money(Integer money){
            this.money = money;
            return this;
        }

        public Builder hungry(boolean hungry){
            this.hungry = hungry;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public Person(Builder builder){
        this.height = builder.height;
        this.money = builder.money;
        this.name = builder.name;
        this.hungry = builder.hungry;
    }

    public void showSpec(){
        System.out.println("키: "+height);
        System.out.println("이름: "+name);
        System.out.println("돈: "+money);
        System.out.println("배고픔: "+hungry);
    }
}
