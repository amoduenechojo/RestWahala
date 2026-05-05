
public class Bike{

    private boolean bikeIsOn;
    private int speed = 0;

    public static boolean validateThatRiderHasBike(){
        return true;
    }


    public void turnOnBike(){
        this.bikeIsOn = true;
    }


    public boolean turnOffBike(){
        this.bikeIsOn = false;
        this.speed = 0;

        return false;
    }

    public boolean bikeIsOn(){
            return bikeIsOn;
    }

    public int getBikeSpeed(){
            return speed;
    }

    public int getBikeGear(){
        if(speed <= 20){
            return 1;
        }
        else if(speed <= 30){
            return 2;
        }

        else if(speed <= 40){
            return 3;
        }

        else{
            return 4;
        }
    }

    public void accelerate(){
        if(bikeIsOn){
            speed += getBikeGear();
        }
    }

    public void decelerate(){
        if(bikeIsOn && speed > 0){
            speed -= getBikeGear();
        }
            if(speed < 0){
                speed = 0;
            }
    }
}

