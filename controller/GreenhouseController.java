// 第10章控制框架-温室控制系统
// @author 晴和羽织
package controller;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc_ly = new GreenhouseControls();
        gc_ly.addEvent(gc_ly.new Bell(300));
        Event[] eventList = {
                gc_ly.new ThermostatNight(0),
                gc_ly.new LightOn(200),
                gc_ly.new LightOff(300),
                gc_ly.new WaterOn(400),
                gc_ly.new WaterOff(500),
                gc_ly.new ThermostatDay(1000),
        };
        gc_ly.addEvent(gc_ly.new Restart(2000,eventList));
        if(args.length == 1){
            gc_ly.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
        gc_ly.run();
    }
}