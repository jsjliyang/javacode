// 第10章练习18
// @author 晴和羽织
public class c10test18 {
    static class Nested{
        void f(){
            System.out.println("This is Inner.f");
        }
    }

    public static void main(String[] args) {
        Nested t = new Nested();
        t.f();
        aMoreone y = new aMoreone();
        y.g();
    }
}

class aMoreone{
    void g(){
        c10test18.Nested t = new c10test18.Nested();
        System.out.println("This is aMoreOne.g.Inner.f");
    }
}
