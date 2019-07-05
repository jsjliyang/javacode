// 第10章练习13
// @author 晴和羽织
public class c10test13 {
    public SimpleInterface get(){
        return new SimpleInterface() {
            @Override
            public void f() {
                System.out.println("This is SimpleInterface.f");
            }
        };
    }
    public static void main(String[] args) {
        SimpleInterface q = new c10test13().get();
        q.f();
    }
}
