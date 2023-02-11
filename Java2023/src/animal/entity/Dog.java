package animal.entity;

public class Dog {
    public String name;
    public int health;
    public int love;
    public String sex;
    public void print(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫："+ name + health + love + sex );
    }
}
