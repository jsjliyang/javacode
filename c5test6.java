// 第5章练习6 重载
// @author 晴和羽织

class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }
    public void bark(int i) {
        System.out.println("int bark = " + i);
    }
    public void bark(double d) {
        System.out.println("double bark = " + d);
    }
    public void bark(int i, double d) {
        System.out.println("int, double bark = " + i + ", " + d);
    }
    public void bark(double d, int i) {
        System.out.println("double, int bark = " + d + ", " + i);
    }
}
public class c5test6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
        dog.bark(1.1,1);
        dog.bark(1,1.1);
    }

}
