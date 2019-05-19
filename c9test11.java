// 第9章练习11
// @author 晴和羽织
import interfaces.Apply;
import interfaces.Processor;

class CharShift{
    static String swap(String s){
        StringBuilder s1 = new StringBuilder(s);
        for(int i = 0; i < s1.length() - 1; i+=2){
            char temp1 = s1.charAt(i);
            char temp2 = s1.charAt(i + 1);
            s1.setCharAt(i + 1,temp1);
            s1.setCharAt(i,temp2);
        }
        return s1.toString();
    }
}
class CharShiftAdapter implements Processor{
    public String name(){
        return CharShift.class.getSimpleName();
    }
    public String process(Object input) {
        return CharShift.swap((String)input);
    }
}
public class c9test11 {
    public static void main(String[] args){
        Apply.process(new CharShiftAdapter(), "java 666");
        Apply.process(new CharShiftAdapter(), "onmyoji");
    }
}
