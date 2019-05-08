// 第8章 多态 shapes & 练习3
// @author 晴和羽织
import java.util.Random;

import static lyprint.Print.printl;
class Shape{
    public void draw(){}
    public void erase(){}
    public void msg(){printl("Here is Shape!");}
}
class Circle extends Shape{
    public void draw(){printl("Circle.draw");}
    public void erase(){printl("Circle.erase");}
}
class Square extends Shape{
    public void draw(){printl("Square.draw");}
    public void erase(){printl("Square.erase");}
}
class Triangle extends Shape{
    public void draw(){printl("Triangle.draw");}
    public void erase(){printl("Triangle.erase");}
}
class RandomShapeGenerator{
    private Random rand = new Random();
    public Shape next(){
        switch(rand.nextInt(3)){
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            default: return new Shape();
        }
    }
}
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }
        for(Shape shp:s){
            shp.draw();
            //shp.erase();
            shp.msg();
        }
    }
}
