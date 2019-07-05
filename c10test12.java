// 第10章练习12
// @author 晴和羽织
public class c10test12 {
    private int i = 10;
    private void f(){
        System.out.println("c10test12.f was running");
    }
    public void h(){
        new Object(){
            void g(){
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        c10test12 q = new c10test12();
        q.h();
    }
}
