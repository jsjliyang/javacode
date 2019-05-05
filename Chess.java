// 使用super关键字显式地编写调用基类构造器的语句
// @author 晴和羽织
class Superonmyoji extends onmyoji{
    Superonmyoji(float i) {
        super(i);
        System.out.println("Superonmyoji has be created with a float i");
    }
}
public class Chess {
    public static void main(String[] args) {
        Superonmyoji me = new Superonmyoji(0);
    }
}
