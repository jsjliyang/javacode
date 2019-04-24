// 非静态实例初始化
// @author 晴和羽织
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
public class MugsInit {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    MugsInit() {
        System.out.println("Mugs()");
    }
    MugsInit(int i) {
        System.out.println("Mugs(int)");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new MugsInit();
        System.out.println("new Mugs() completed");
        new MugsInit(1);
        System.out.println("new Mugs(1) completed");
    }
}
