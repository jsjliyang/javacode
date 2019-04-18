// 练习14
// @author 晴和羽织
public class c3test14 {
    public static void pl(String s, boolean b) {
        System.out.println(s + ": " + b);
    }
    public static void compare(String str1, String str2) {
        System.out.println("str1: " + str1 + "  str2: " + str2);
        pl("str1 == str2", str1 == str2);
        pl("str1 != str2", str1 != str2);
        pl("str1.equals(str2)", str1.equals(str2));
    }
    public static void main(String[] args) {
        compare("Hello", "Hello");
        String s = new String();
        s = "hello";
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }
}
