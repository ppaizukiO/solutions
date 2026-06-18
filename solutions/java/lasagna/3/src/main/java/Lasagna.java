public class Lasagna {
    private static int minutes = 40;
    private static int timePerLayer = 2;
    
    public int expectedMinutesInOven(){
        return minutes;
    }
    
    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven()-minutes;
    }
    
    public int preparationTimeInMinutes(int layers){
        return layers*timePerLayer;
    }
    
    public int totalTimeInMinutes(int layers, int minutes){
        return preparationTimeInMinutes(layers)+minutes;
    }
}
