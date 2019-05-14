// 第8章练习9
// @author 晴和羽织
import static lyprint.Print.*;
class Rodent {
    public void hop() { printl("Rodent hopping"); }
    public void scurry() { printl("Rodent scurrying"); }
    public void reproduce() { printl("Making more Rodents"); }
    public String toString() { return "Rodent"; }
}
class Mouse extends Rodent {
    public void hop() { printl("Mouse hopping"); }
    public void scurry() { printl("Mouse scurrying"); }
    public void reproduce() { printl("Making more Mice"); }
    public String toString() { return "Mouse"; }
}
class Gerbil extends Rodent {
    public void hop() { printl("Gerbil hopping"); }
    public void scurry() { printl("Gerbil scurrying"); }
    public void reproduce() { printl("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }
}
class Hamster extends Rodent {
    public void hop() { printl("Hamster hopping"); }
    public void scurry() { printl("Hamster scurrying"); }
    public void reproduce() { printl("Making more Hamsters"); }
    public String toString() { return "Hamster"; }
}
public class c8test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for(Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}
