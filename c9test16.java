// 第9章练习16
// @author 晴和羽织
import java.nio.*;
import java.util.*;
class CharSequence{
    private static Random rand = new Random();
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    char[] generate(){
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[rand.nextInt(capitals.length)];
        for(int i = 0; i < 4; i++){
            buffer[idx++] = vowels[rand.nextInt(vowels.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}
public class c9test16 extends CharSequence implements Readable{
    private int count;
    public c9test16(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count-- == 0)    return -1;
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new c9test16(10));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
