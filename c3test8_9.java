// 练习8：使用了十六进制和八进制计数法操作long值，并使用Long.toBinaryString()显示结果
// 练习9：使用float和double指数计数法
// @author 晴和羽织
public class c3test8_9 {
    public static void main(String[] args){
        long n1 = 0200L;
        long n2 = 200;
        System.out.println("n1 = " + Long.toBinaryString(n1));
        System.out.println("n2 = " + Long.toBinaryString(n2));
        long  n3 = n1 + n2;
        System.out.println("n1 + n2 = " + Long.toBinaryString(n3));

        float n4 = 1.39e38f;
        double n5 = 1.39e43;
        System.out.println("float:" + n4);
        System.out.println("double:" + n5);
    }
}
