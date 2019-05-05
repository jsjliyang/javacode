// 第7章练习2
// @author 晴和羽织

class Newonmyoji extends onmyoji{
    String SSR;
    public void Name(){
        System.out.println("The name of onmyoji is 晴和");
    }
    public void NewMethod(){
        System.out.println("append a new method");
        System.out.println("The name of SSR is " + this.SSR);
    }
}
public class c7test2 {
    public static void main(String args[]) {
        Newonmyoji nd = new Newonmyoji();
        nd.SSR = "snake";
        nd.Name();
        nd.NewMethod();
        System.out.println(nd);
    }
}
