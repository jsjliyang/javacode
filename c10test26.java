// 第10章练习26
// @author 晴和羽织
class WithInner {
    class Inner{
        int ssr;
        Inner(int ssr){
            this.ssr = ssr;
        }
    }
}
public class c10test26 extends WithInner.Inner{
    c10test26(WithInner withInner){
        withInner.super(6);
    }
    public void main(String[] args) {
        WithInner wi = new WithInner();
        c10test26 ii = new c10test26(wi);
    }
}
