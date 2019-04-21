// 第4章练习9 & 10
// @author 晴和羽织
public class c4test9_10 {
    static int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void fibonacci(int a){
        if(a < 0) {
            System.out.println("Cannot use negative numbers");
            return;
        }
        for(int i = 1; i <= a; i++) {
            System.out.print(fib(i));
            if (i < a)
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }
    public static void test10(){
        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for(int num1 = 10; num1 <= 99; num1++)
            for(int num2 = num1; num2 <= 99; num2++) {
                if((num1 * num2) % 9 != (num1 + num2) % 9)
                    continue;
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for(int x = 0; x < 4; x++)
                    for(int y = 0; y < 4; y++) {
                        if(productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if(count == 4)
                                System.out.println(product + " = " + num1 + " * " + num2);
                        }
                    }
            }
    }

    public static void main(String[] args){
        System.out.println("<-----斐波那契数列----->");
        //int n = Integer.parseInt(args[0]);
        int n = 15;
        fibonacci(n);
        System.out.println("<-----吸血鬼数字----->");
        test10();
    }
}
