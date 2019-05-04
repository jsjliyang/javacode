// 第7章练习1
// @author 晴和羽织
import static lyprint.Print.*;
class Simple {
    String s;
    public Simple(String si) { s = si; }
    public String toString() { return s; }
    public void setString(String sNew) { s = sNew; }
}
class Second {
    Simple simple;
    String s;
    public Second(String si) {
        s = si;
    }
    public void check() {
        if(simple == null)
            printl("not initialized");
        else
            printl("initialized");
    }
    private Simple lazy() {
        if(simple == null) {
            printl("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }
    public Simple getSimple() { return lazy(); }
    public String toString() {
        return lazy().toString();
    }
    public void setSimple(String sNew) {
        lazy().setString(sNew);
    }
}
public class c7test1 {
    public static void main(String args[]) {
        Second second = new Second("Init String");
        second.check();
        printl(second.getSimple());
        second.check();
        printl(second); // toString() call
        second.setSimple("New String");
        printl(second);
    }
}