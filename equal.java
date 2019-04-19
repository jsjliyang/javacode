// 练习5&6 输出名字和叫声，新建一个spot与之前的用==和eauals()分别比较
import java.util.*;

class Pet {
    String name;
    String says;
}

public class equal {
    public static void main(String[] args){
        Pet p1 = new Pet();
        p1.name = "Pikachu";
        p1.says = "Pikapi";
        Pet p2 = new Pet();
        p2.name = "spot";
        p2.says = "Ruff!";
        System.out.println("name: " + p1.name + "   says:" + p1.says);
        System.out.println("name: " + p2.name + "   says:" + p2.says);

        Pet p3 = new Pet();
        p3.name = p2.name;
        p3.says = p2.says;
        System.out.println("p2.name == p3.name:" + (p2.name == p3.name));
        System.out.println("p2.says == p3.says:" + (p2.says == p3.says));
        System.out.println("p2.equals(p3):" + p2.equals(p3));
    }
}
