// 练习10：按位操作符
// @author 晴和羽织
public class test10 {
    public static void main(String args[]){
        int n1 = 0xAAA;
        int n2 = 0xAAB;
        System.out.println("n1:" + Integer.toBinaryString(n1) + "   n2:" + Integer.toBinaryString(n2));
        System.out.println("n1 & n2:" + Integer.toBinaryString(n1 & n2));
        System.out.println("n1 | n2:" + Integer.toBinaryString(n1 | n2));
        System.out.println("n1 ^ n2:" + Integer.toBinaryString(n1 ^ n2));
        System.out.println("~n1:" + Integer.toBinaryString(~n1) + "   ~n2:" + Integer.toBinaryString(~n2));
        System.out.println("~n1 ^ n2:" + Integer.toBinaryString(~n1 ^ n2));
    }
} /* Output:
n1:101010101010   n2:101010101011
n1 & n2:101010101010
n1 | n2:101010101011
n1 ^ n2:1
~n1:11111111111111111111010101010101   ~n2:11111111111111111111010101010100
~n1 ^ n2:11111111111111111111111111111110
*///:~
