// 多重继承
// @author 晴和羽织
import static lyprint.Print.*;
interface CanFight{
    void fight();
}
interface CanRun{
    void run();
}
interface CanShield{
    void shield();
}
interface Canclimb{
    void climb();
}
class ActionCharacter{
    public void fight(){
        printl("I can fight!");
    }
}
class Cap extends ActionCharacter implements CanFight,CanRun,CanShield,Canclimb{
    public void run(){
        printl("Cap run!");
    }
    public void shield(){
        printl("Cap shield!");
    }
    public void climb(){
        printl("Cap climb!");
    }
}
public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void y(CanRun x) {x.run();}
    public static void u(CanShield x) {x.shield();}
    public static void h(Canclimb x) {x.climb();}
    public static void g(ActionCharacter x) {x.fight();}
    public static void main(String[] args){
        Cap q = new Cap();
        t(q);
        y(q);
        u(q);
        h(q);
        g(q);
    }
}
