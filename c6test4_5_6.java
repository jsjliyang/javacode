// 第6章练习4 & 5 & 6
// @author 晴和羽织
import lyprint.*;

class WithProtected {
    protected int i;
}
public class c6test4_5_6 extends Debug {
    public int a;
    private int b;
    protected int c;
    int d;
    public void f1() {}
    private void f2() {}
    protected void f3() {}
    void f4() {}
    public static void main(String[] args){
        bug();
        WithProtected wp = new WithProtected();
        wp.i = 47;
        System.out.println("wp.i = " + wp.i);
        c6test4_5_6 test = new c6test4_5_6();
        test.a = 1;
        test.b = 2;
        test.c = 3;
        test.d = 4;
        test.f1();
        test.f2();
        test.f3();
        test.f4();
    }
}
