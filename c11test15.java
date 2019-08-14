// 第11章 练习15
// @author 晴和羽织
import lyutil.Stack;
import static lyprint.Print.*;
import java.util.Scanner;

public class c11test15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        char a;
        printl("请输入栈表达式");
        String cal = sc.nextLine();
        //char[] cal = in.toCharArray();
        for(int i = 0; i < cal.length(); i++) {
            a =  cal.charAt(i);
            if(a == '+') {
                i++;
                a = cal.charAt(i);
                stack.push(a);
                printl("[入栈]：" + a);
            }
            else if (a == '-') {
                a = stack.pop();
                printl("[出栈]：" + a);
            }
            else{
                printl("读取错误：" + a);
            }
        }
    }
}///:+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u---+l+e+s---