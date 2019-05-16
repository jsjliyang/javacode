// 第9章练习7
// @author 晴和羽织
import static lyprint.Print.*;
interface Rodent2 {
    void hop();
    void scurry();
    void reproduce();
}
class Mouse2 implements Rodent2 {
    public void hop() { printl("Mouse hopping"); }
    public void scurry() { printl("Mouse scurrying"); }
    public void reproduce() { printl("Making more Mice"); }
    public String toString() { return "Mouse"; }
}
class Gerbil2 implements Rodent2 {
    public void hop() { printl("Gerbil hopping"); }
    public void scurry() { printl("Gerbil scurrying"); }
    public void reproduce() { printl("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }
}
class Hamster2 implements Rodent2 {
    public void hop() { printl("Hamster hopping"); }
    public void scurry() { printl("Hamster scurrying"); }
    public void reproduce() { printl("Making more Hamsters"); }
    public String toString() { return "Hamster"; }
}
public class c9test7 {
    public static void main(String args[]) {
        Rodent2[] rodents = {
                new Mouse2(),
                new Gerbil2(),
                new Hamster2(),
        };
        for (Rodent2 r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            printl(r);
        }
    }
}
