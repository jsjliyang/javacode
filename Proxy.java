// 代理
// @author 晴和羽织
class F1{
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forward(int velocity){}
    void back(int velocity){}
    void turboBoost(){}
}
public class Proxy {
    private String name;
    private F1 someone = new F1();
    public Proxy(String name){
        this.name = name;
        System.out.println("name: " + name);
    }
    public void up(int velocity){
        someone.up(velocity);
        System.out.println("up: " + velocity);
    }
    public void down(int velocity){
        someone.down(velocity);
        System.out.println("down: " + velocity);
    }
    public void left(int velocity){
        someone.left(velocity);
        System.out.println("left: " + velocity);
    }
    public void right(int velocity){
        someone.right(velocity);
        System.out.println("right: " + velocity);
    }
    public void forward(int velocity){
        someone.forward(velocity);
        System.out.println("forward: " + velocity);
    }
    public void back(int velocity){
        someone.back(velocity);
        System.out.println("back: " + velocity);
    }
    public void turboBoost(){
        someone.turboBoost();
        System.out.println("turboBoost!!");
    }
    public static void main(String[] args){
        Proxy gx = new Proxy("GX");
        gx.turboBoost();
        gx.forward(30);
        gx.back(10);
        gx.left(12);
        gx.right(13);
        gx.up(5);
        gx.down(4);
        gx.turboBoost();
    }
}
