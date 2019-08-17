// 第11章 练习24
// @author 晴和羽织
import java.util.*;
import lyutil.*;
import static lyprint.Print.*;
public class c11test24 {
    private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    static void updateStat(Map<Character, Integer> stat, char letter) {
        Character ch = Character.toLowerCase(letter);
        Integer freq = stat.get(ch);
        stat.put(ch, freq == null ? 1 : freq + 1);
    }
    public static void main(String[] args) {
        //Map<String, String> m1 = new LinkedHashMap<String, String>((Map<String, String>) new TextFile("javacoding\\AbstractInstrument.java","\\W+"));
        Map<String, String> m1 = new LinkedHashMap<String, String>(Countries.capitals(25));
        printl("MAP1: " + m1);
        String[] keys = m1.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String, String> m2 = new LinkedHashMap<String, String>();
        for(String key : keys) {
            m2.put(key, m1.get(key));
        }
        printl("MAP2: " + m2);

        HashMap<Character, Integer> m3 = new HashMap<Character, Integer>();
        for(String word: new TextFile("javacoding\\lyutil\\Countries.java","\\W+")) {
            for(char letter: word.toCharArray()){
                if(vowels.contains(letter)) {
                    updateStat(m3,letter);
                }
            }
        }
        printl("MAP3: " + m3);
        Character[] keys1 = m3.keySet().toArray(new Character[0]);
        Arrays.sort(keys);
        Map<Character, Integer> m4 = new LinkedHashMap<Character, Integer>();
        for(Character key : keys1) {
            m4.put(key, m3.get(key));
        }
        printl("MAP4: " + m4);
    }
}

