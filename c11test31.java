// 第11章 练习31
// @author 晴和羽织
import java.util.*;
class RandomShapeGenerator1 implements Iterable<Shape> {
    private Random rand = new Random();
    private final int quantity;
    RandomShapeGenerator1(int quantity) {
        this.quantity = quantity;
    }
    public Iterator<Shape> iterator() {
        System.out.println("Here is iterator");
        return new Iterator<Shape>() {
            private int count;
            @Override
            public boolean hasNext() {
                return count < quantity;
            }

            @Override
            public Shape next() {
                count++;
                return nextShape();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    private Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
                return new Triangle();
            case 0:
                return new Circle();
            case 1:
                return new Square();
        }
    }
}
public class c11test31 {
    public static void main(String[] args) {
        RandomShapeGenerator1 rsg = new RandomShapeGenerator1(10);
        for(Shape shape : rsg)
            System.out.println(shape.getClass().getSimpleName());
    }
}
