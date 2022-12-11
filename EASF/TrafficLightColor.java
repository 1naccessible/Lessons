package EASF;

public enum TrafficLightColor {
    RED(10000), YELLOW(3000), GREEN(10000);
    TrafficLightColor(int delayOb){
        delay = delayOb;
    }
    private int delay;

    int getDelay(){
        return delay;
    }
}
