package designPattern.singletonPattern.singletonEx01;

public class User {

    private static User user;

    private String name;
    private Long hp;
    private Long mp;
    private Long gold;

    private User(){
        name = "noName";
        hp = 100L;
        mp = 50L;
        gold = 1000L;
    }

    public static User getInstance(){
        if(user == null)
            user = new User();
        return user;
    }

    public String getName() {
        return name;
    }

    public Long getHp() {
        return hp;
    }

    public Long getMp() {
        return mp;
    }

    public Long getGold() {
        return gold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHp(Long arg){
        this.hp += arg;
    }

    public void subHp(Long arg){
        this.hp -= arg;
    }

    public void addMp(Long arg){
        this.mp += arg;
    }

    public void subMp(Long arg){
        this.mp -= arg;
    }

    public void addGold(Long arg){
        this.gold += arg;
    }

    public void subGold(Long arg){
        this.gold -= arg;
    }

    public void showInfo(){
        System.out.println(String.format("이름 : %s\nHP  : %d\nMP  : %d\n돈  : %dG\n",getName(),getHp(),getMp(),getGold()));
    }
}
