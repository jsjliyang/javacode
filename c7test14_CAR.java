// 第7章练习14
// @author 晴和羽织
class Engine{
    public void start(){}
    public void stop(){}
    public void rev(){}
    public void service(){}
}
class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollup(){}
    public void rolldown(){}
}
class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}
public class c7test14_CAR {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door();
    public c7test14_CAR() {
        for(int i = 0; i < 4; i++){
            wheel[i] = new Wheel();
        }
    }
    public static void main(String[] args){
        c7test14_CAR car = new c7test14_CAR();
        car.left.window.rolldown();
        car.engine.service();
        car.wheel[1].inflate(88);
    }
}
