// 4种初始化引用方法
// @author 晴和羽织
import static lyprint.Print.*;
class Soap {
    private String s;
    Soap() {
        printl("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}
public class FourInitial {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public FourInitial() {
        printl("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    { i = 47; }
    public String toString() {
        if(s4 == null)
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + "i = " + i + "\n" + "toy = " + toy + "\n" + "castille = " + castille;
    }
    public static void main(String[] args) {
        FourInitial b = new FourInitial();
        printl(b);
    }
}