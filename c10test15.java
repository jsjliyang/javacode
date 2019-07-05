// 第10章练习15
// @author 晴和羽织
class NoDefault{
    private int i;
    public NoDefault(int i){
        this.i = i;
        System.out.println("i = " + i);
    }
    public void f(){
        System.out.println("This is NoDefault.f");
    }
}
class MoreOne{
    public NoDefault get1(int i){
        return new NoDefault(i){};
    }
    public NoDefault get2(int i){
        return new NoDefault(i){
            public void f(){
                System.out.println("This is MoreOne.get2.f");
            }
        };
    }
}
public class c10test15 {
    public static void main(String[] args) {
        MoreOne w = new MoreOne();
        NoDefault e = w.get1(55);
        e.f();
        e = w.get2(66);
        e.f();
    }
}
