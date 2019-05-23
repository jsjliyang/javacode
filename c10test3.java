// 第10章练习3
// @author 晴和羽织
class Outer {
    private final String data;
    class Inner {
        public String toString() { return data; }
    }
    Outer(String data) { this.data = data; }
    Inner getInner() { return new Inner(); }
}
public class c10test3 {
    public static void main(String[] args) {
        Outer o = new Outer("Inner accessing outer!");
        Outer.Inner i = o.getInner();
        System.out.println(i.toString());
    }
}
