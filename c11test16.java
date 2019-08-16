// 第11章 练习15
// @author 晴和羽织
import java.util.*;
import lyutil.*;
import static lyprint.Print.*;
public class c11test16 {
    private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','o','u','i','A','E','O','U','I'));
    public static void main(String[] args) {
        HashSet<String> processWords = new HashSet<String>();
        int filevowels = 0;
        int wordVowels;
        for(String word: new TextFile("javacoding\\AbstractInstrument.java","\\W+")) {
            wordVowels = 0;
            for(char letter: word.toCharArray()){
                if(vowels.contains(letter)){
                    wordVowels++;
                }
            }
            if(!processWords.contains(word)) {
                processWords.add(word);
                printl("[" + word + "]:has " + wordVowels + " vowel(s)");
            }
            filevowels += wordVowels;
        }
        printl("文件中所有元音字母出现的总次数为" + filevowels + "次");
    }
}
