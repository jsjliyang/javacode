// 第10章控制框架-温室
// @author 晴和羽织
package controller;

public class GreenhouseControls extends Controller{
    //灯光
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = true;
        }
        public String toString(){
            return "Greenhouse's light is on";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            light = false;
        }
        public String toString(){
            return "Greenhouse's light is off";
        }
    }
    //水
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = true;
        }
        public String toString(){
            return "Greenhouse's water is on";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            water = false;
        }
        public String toString(){
            return "Greenhouse's water is off";
        }
    }
    //恒温器
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Night";
        }
        public String toString(){
            return "Greenhouse's thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            thermostat = "Day";
        }
        public String toString(){
            return "Greenhouse's thermostat on day setting";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "Bing!";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList)
                addEvent(e);
        }
        @Override
        public void action() {
            for(Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Restarting Greenhouse system";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            System.exit(0);
        }
        public String toString() {
            return "System terminating！";
        }
    }
}
