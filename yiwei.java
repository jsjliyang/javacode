// 练习11、12、13
// @author 晴和羽织
// 有符号移位操作符<< & >>，无符号移位操作符<<< & >>>
public class yiwei {
    public static void main(String[] args) {
        int n1 = 0x80000000;
        System.out.println("<---------test 11--------->");
        System.out.println(Integer.toBinaryString(n1));
        for(int i = 0 ; i < 31; i++) {
            n1 >>= 1;
            System.out.println(Integer.toBinaryString(n1));
        }

        int n2 = -1;
        System.out.println("<---------test 12--------->");
        System.out.println(Integer.toBinaryString(n2));
        n2 <<= 1;
        System.out.println(Integer.toBinaryString(n2));
        for(int i = 0 ; i < 31; i++){
            n2 >>>= 1;
            System.out.println(Integer.toBinaryString(n2));
        }

        System.out.println("<---------test 13--------->");
        System.out.println("A: " + Integer.toBinaryString('A'));
        System.out.println("a: " + Integer.toBinaryString('a'));
        System.out.println("#: " + Integer.toBinaryString('#'));
        System.out.println("x: " + Integer.toBinaryString('x'));
        System.out.println("7: " + Integer.toBinaryString('7'));
    }
}
