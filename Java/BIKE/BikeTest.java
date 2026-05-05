import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest{

    @Test
        public void testThatRiderHasABike(){
        Bike myBike = new Bike();

        boolean hasBike = true;
        boolean actual = Bike.validateThatRiderHasBike();
        assertTrue(actual);
    }


    @Test
        public void testThatBikeCanBeTurnedOn_whenParked_speedIsZero(){

        Bike myBike = new Bike();

        myBike.turnOnBike();
        assertTrue(myBike.bikeIsOn());
    }


    @Test
        public void testThatBikeIsTurnedOff_whenBikeIsOff_bikeIsOff(){

        Bike myBike = new Bike();

        myBike.turnOnBike();
        myBike.turnOffBike();

        boolean actual = myBike.turnOffBike();
        assertFalse(actual);
    }

    @Test
        public void testThatBikeAccelerates_onGearOne(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        myBike.accelerate();

        int expected = 1;
        int actual = myBike.getBikeSpeed();

        assertEquals(expected, actual);

    }

    @Test
    public void testThatBikeAccelerates_onGearTwo(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

            while(myBike.getBikeSpeed() < 21) {
                myBike.accelerate();
            }

            myBike.accelerate();

            int expected = 23;
            int actual = myBike.getBikeSpeed();
            assertEquals(expected, actual);
    }

    @Test
    public void testThatBikeAccelerates_onGearThree(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        while(myBike.getBikeSpeed() < 31) {
            myBike.accelerate();
        }

        myBike.accelerate();

        int expected = 34;
        int actual = myBike.getBikeSpeed();
        assertEquals(expected, actual);
    }


    @Test
    public void testThatBikeAccelerates_onGearFour(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        while(myBike.getBikeSpeed() < 40) {
            myBike.accelerate();
        }

        myBike.accelerate();

        int expected = 43;
        int actual = myBike.getBikeSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void testThatBikeDecelerates_onGearTwo(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        while(myBike.getBikeSpeed() < 23){
                myBike.accelerate();
            }

        myBike.decelerate();

        int expected = 21;
        int actual = myBike.getBikeSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void testThatBikeAccelerates25Times_decelerates15Times_speedIs10(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        for(int speed = 15; speed < 26; speed++){
            myBike.accelerate();
        }

        myBike.decelerate();

        int expected = 10;
        int actual = myBike.getBikeSpeed();
        assertEquals(expected, actual);
    }


    @Test
    public void testThatBikeDecelerates25Times_accelerates35Times_speedIs10After35Accelerations(){

        Bike myBike = new Bike();
        myBike.turnOnBike();

        for(int speed = 1; speed <= 35; speed++){
            myBike.accelerate();
        }

        for(int count = 0; count < 24; count++){
            myBike.decelerate();
        }

        int expected = 10;
        int actual = myBike.getBikeSpeed();

        assertEquals(expected, actual);
    }
}


