// 第12章 练习9
// @author 晴和羽织
import static lyprint.Print.*;
import java.util.*;
class ExBase extends Exception {}
class Ex1 extends ExBase {}
class Ex2 extends ExBase {}
class Ex3 extends ExBase {}

class Thrower {
    private int  i;
    public Thrower(int i) {
        this.i = i;
    }
    void f() throws Ex1,Ex2,Ex3 {
        if(i == 0)
            throw new Ex1();
        else if(i == 1)
            throw new Ex2();
        else if(i == 2)
            throw new Ex3();
    }
}
public class c12test9 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Thrower t = new Thrower(rand.nextInt(3));
            try {
                t.f();
            } catch (ExBase e) {
                printl("caught " + e);
            }
        }
    }
}
