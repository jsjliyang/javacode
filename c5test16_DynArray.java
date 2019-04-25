// 第5章练习16 & 动态替换参数
// @author 晴和羽织
public class c5test16_DynArray {
    public static void main(String args[]) {
        String sa1[] = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        System.out.println("String sa1");
        for (int i = 0; i < sa1.length; i++)
            System.out.println(sa1[i]);

        String sa2[] = {"These", "are", "some", "strings"};
        System.out.println("String sa2");
        for (int i = 0; i < sa2.length; i++)
            System.out.println(sa2[i]);
        System.out.println("other.main");
        Other.main(new String[]{ "fiddle", "de", "dum" });
        //Other.main(new String[]{ "366s", "de", "ha" });
    }
}
class Other {
    public static void main(String[] args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}
