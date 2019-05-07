// 第7章练习19 & 21 & 22
// @author 晴和羽织
class WithBlankFinalField {
    private final Integer i;
    public WithBlankFinalField(int ii) {
        i = new Integer(ii);
    }
    public Integer geti() {
        return i;
    }
}
class WithFinalMethod {
    final void f() {}
}
final class FinalClass {}
//public class c7test19_21_22 extends WithFinalMethod{
//public class c7test19_21_22 extends FinalClass{
public class c7test19_21_22{
    void f() {}
    public static void main(String args[]) {
        WithBlankFinalField wbff = new WithBlankFinalField(10);
        System.out.println(wbff.geti());
    }
}
