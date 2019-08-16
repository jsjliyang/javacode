// 第11章 练习20
// @author 晴和羽织
import java.util.*;
import lyutil.*;
import static lyprint.Print.*;
public class c11test20 {
    private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    static void updateStat(Map<Character, Integer> stat, char letter) {
        Character ch = Character.toLowerCase(letter);
        Integer freq = stat.get(ch);
        stat.put(ch, freq == null ? 1 : freq + 1);
    }
    public static void main(String[] args) {
        HashMap<Character, Integer> fileStat = new HashMap<Character, Integer>();
        HashSet<String> processWords = new HashSet<String>();
        HashMap<Character, Integer> wordStat = new HashMap<Character, Integer>();
        for(String word: new TextFile("javacoding\\AbstractInstrument.java","\\W+")) {
            wordStat.clear();
            for(char letter: word.toCharArray()){
                if(vowels.contains(letter)){
                    updateStat(wordStat,letter);
                    updateStat(fileStat,letter);
                }
            }
            if(!processWords.contains(word)) {
                processWords.add(word);
                printl("Vowels in [" + word + "]: " + wordStat);
            }
        }
        printl("文件中所有元音字母:" + fileStat);
    }
}