// 第7章练习15
// @author 晴和羽织
class Father{
    private String name;
    public Father(){
        System.out.println("Father类无参数构造器");
    }
    public Father(String name){
        this.name = name;
        System.out.println("Father类构造器初始化name: " + this.name);
    }
    protected void SetName(String name){
        this.name = name;
        System.out.println("Father类SetName函数设置name: " + this.name);
    }
}
public class c7test15 extends Father{
    public c7test15(String name){
        super(name);
    }
    public static void main(String[] args){
        c7test15 attacker = new c7test15("茨木童子");
        attacker.SetName("鬼切");
    }
}
