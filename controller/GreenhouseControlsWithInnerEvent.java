// 第10章控制框架-带有内部事件的温室
// @author 晴和羽织
package controller;

class GreenhouseControlsWithFan extends GreenhouseControls{
    private boolean fan = false;
    public class FanOn extends Event {
        public FanOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            fan = true;
        }
        public String toString() {
            return "Greenhouse's fan is on";
        }
    }
    public class FanOff extends Event {
        public FanOff(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            fan = false;
        }
        public String toString() {
            return "Greenhouse's fan is off";
        }
    }
}
public class GreenhouseControlsWithInnerEvent {
    public static void main(String[] args) {
        GreenhouseControlsWithFan gc1_ly = new GreenhouseControlsWithFan();
        gc1_ly.addEvent(gc1_ly.new Bell(300));
        Event[] eventList = {
                gc1_ly.new ThermostatNight(0),
                gc1_ly.new LightOn(200),
                gc1_ly.new LightOff(300),
                gc1_ly.new WaterOn(400),
                gc1_ly.new WaterOff(500),
                gc1_ly.new FanOn(600),
                gc1_ly.new FanOff(700),
                gc1_ly.new ThermostatDay(1000),
        };
        gc1_ly.addEvent(gc1_ly.new Restart(2000,eventList));
        if(args.length == 1){
            gc1_ly.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }
        gc1_ly.run();
    }
}
