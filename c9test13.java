// 第9章练习13
// @author 晴和羽织
import static lyprint.Print.*;
interface BaseInterface{
    void SSR();
}
interface Interface1 extends BaseInterface{
    void SSR();
}
interface Interface2 extends BaseInterface{
    void SSR();
}
interface MultiInterface extends Interface1,Interface2{
    void SSR();
}
class Multi implements MultiInterface{
    public void SSR(){
        printl("Here is Multi.SSR!");
    }
}
public class c9test13 {
    public static void f(BaseInterface x) {x.SSR();}
    public static void main(String[] args){
        Multi m = new Multi();
        f(m);
        m.SSR();;
    }
}
