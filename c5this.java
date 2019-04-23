// this关键字
// @author 晴和羽织
class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }
    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 47); // 使用this不能调用两个构造器，且必须将构造器置于最起始处。
        System.out.println("default constructor (no args)");
    }
    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
}
public class c5this {
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
