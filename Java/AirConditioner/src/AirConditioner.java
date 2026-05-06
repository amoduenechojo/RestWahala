
public class AirConditioner{


    private boolean isOn = false;
    private int temperature = 26;


    public void turnOnAC(){
        isOn = true;

    }

    public void turnOffAC(){
        isOn = false;
    }


    public boolean isOff(){
        return !isOn;
    }


    public int getTemperature(){
        return temperature;
    }


    public void decreaseTemperature() {

        if (!isOff() && temperature > 16){
            temperature -= 1;
        }

    }

     public void increaseTemperature() {
        
        if(!isOn) return;
        if(temperature == 30) return;

        temperature +=1;
        
    }


}








