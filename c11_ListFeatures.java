import typeinfo.pets.*;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import java.util.*;
import static lyprint.Print.*;
// 第11章 ListFeatures
// @author 晴和羽织
public class c11_ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Pet> pets = Pets.arrayList(7);
        printl("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        printl("2: " + pets);
        printl("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        printl("4: " + p + " " + pets.indexOf(p));
        Pet cymic = new Cymric();
        printl("5: " + pets.indexOf(cymic));
        printl("6: " + pets.remove(cymic));

        printl("7: " + pets.remove(p));
        printl("8: " + pets);
        pets.add(3, new Mouse());
        printl("9: " + pets);
        List<Pet> sub = pets.subList(1,4);
        printl("subList: " + sub);
        printl("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        printl("sorted subList: " + sub);
        printl("11: " + pets.containsAll(sub));
        Collections.shuffle(sub,rand);
        printl("shuffled subList: " + sub);
        printl("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        printl("sub: " + sub);
        copy.retainAll(sub);
        printl("13: " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        printl("14: " + copy);
        copy.removeAll(sub);
        printl("15: " + copy);
        copy.set(1,new Mouse());
        printl("16: " + copy);
        copy.addAll(2,sub);
        printl("17: " + copy);
        printl("18: " + pets.isEmpty());
        pets.clear();
        printl("19: " + pets);
        printl("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        printl("21: " + pets);
        Object[] o = pets.toArray();
        printl("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        printl("23: " + pa[3].id());
    }
}
