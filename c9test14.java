// 第9章练习14
// @author 晴和羽织
import static lyprint.Print.*;
interface c914Interface1{
    void f1();
    void g1();
}
interface c914Interface2{
    void f2();
    void g2();
}
interface c914Interface3{
    void f3();
    void g3();
}
interface c914MultiInterface extends c914Interface1,c914Interface2,c914Interface3{
    void h();
}
class Something{
    String s;
    public Something(String s){
        this.s = s;
    }
}
class c914Multi extends Something implements c914MultiInterface{
    c914Multi(){
        super("c914Multi");
    }
    public void h() {printl("c914Multi.h");}
    public void f1() {printl("c914Multi.f1");}
    public void g1() {printl("c914Multi.g1");}
    public void f2() {printl("c914Multi.f2");}
    public void g2() {printl("c914Multi.g2");}
    public void f3() {printl("c914Multi.f3");}
    public void g3() {printl("c914Multi.g3");}
}
public class c9test14 {
    static void takes1(c914Interface1 i) {
        i.f1();
        i.g1();
    }
    static void takes2(c914Interface2 i) {
        i.f2();
        i.g2();
    }
    static void takes3(c914Interface3 i) {
        i.f3();
        i.g3();
    }
    static void takesMulti(c914Multi a) {
        a.f1();
        a.g1();
        a.f2();
        a.g2();
        a.f3();
        a.g3();
        a.h();
    }
    public static void main(String args[]) {
        c914Multi a = new c914Multi();
        takes1(a);
        takes2(a);
        takes3(a);
        takesMulti(a);
    }
}
