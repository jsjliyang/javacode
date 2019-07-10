// 第10章控制框架
// @author 晴和羽织
package controller;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }
}
