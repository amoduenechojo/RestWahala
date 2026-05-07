import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

        @Test
            public void testThatUserHasAirConditioner(){

                AirConditioner myAC = new AirConditioner();
                assertNotNull(myAC);
        }


        @Test
            public void testThatAC_canTurnOn(){

            AirConditioner myAC = new AirConditioner();

            myAC.turnOnAC();
            assertFalse(myAC.isOff());
        }


        @Test
        public void testThatAC_canTurnOff(){

            AirConditioner myAC = new AirConditioner();
            assertTrue(myAC.isOff());

            myAC.turnOnAC();
            assertFalse(myAC.isOff());
        }


        @Test
        public void testThatAC_IsOff(){

            AirConditioner myAC = new AirConditioner();
            myAC.turnOffAC();

            assertTrue(myAC.isOff());
        }


        @Test
        public void testThatACIsOff_whenTurnedOn_ACIs0n(){


            AirConditioner myAC = new AirConditioner();
            myAC.turnOffAC();

            myAC.turnOnAC();
            assertFalse(myAC.isOff());

        }

        @Test
        public void testThatACIsOn_whenTurnedOff_ACIsOff(){

            AirConditioner myAC = new AirConditioner();
            myAC.turnOnAC();

            myAC.turnOffAC();
            assertTrue(myAC.isOff());

        }

        @Test
        public void testThatWhenAC_IsTurnedOn_TemperatureIs26(){

            final int TEMPERATURE = 26;

            AirConditioner myAC = new AirConditioner();
            assertTrue(myAC.isOff());
            myAC.turnOnAC();

            assertEquals(TEMPERATURE, myAC.getTemperature());

        }


        @Test
        public void testThatTemperatureIs26Degrees_reduceTemperature_temperatureReducesBy1_degree(){

            AirConditioner myAC = new AirConditioner();
            myAC.turnOnAC();

            myAC.decreaseTemperature();
            assertEquals(25, myAC.getTemperature());
        }




         @Test
        public void testThatTemperatureIs26Degrees_reduceTemperature7Times_temperatureShouldNotGoBelow16(){

            AirConditioner myAC = new AirConditioner();
            myAC.turnOnAC();

           for(int count = 0; count <7; count++) myAC.decreaseTemperature();
           assertEquals(16, myAC.getTemperature);
        }





















        @Test
        public void testThatTemperatureCanBeIncreased_by1(){

            AirConditioner myAC = new AirConditioner();
            myAC.turnOnAC();

            myAC.increaseTemperature();

            assertEquals(27, myAC.getTemperature();

        }



        @Test
        public void testThatTemperatureIs26Degrees_increaseTemperature_temperatureIncreasesBy1_degree() {

            AirConditioner myAC = new AirConditioner();
            myAC.turnOnAC();

            myAC.increaseTemperature();
            assertEquals(27, myAC.getTemperature());
        }

<<<<<<< HEAD:Java/AirConditioner/src/AirConditionerTest.java
=======
        
>>>>>>> dcfc5d7 (Diaries):Java/AirConditioner/AirConditionerTest.java
        @Test
            public void myACisOff_increaseTemperature_temperatureIsNotIncreased(){

            assertTrue(myAC.isOff());
            myAC.increaseTemperature();
            assertEquals(26 myAC.getTemperature());

        } 

   
        @Test
        public void myACisOn_temperatureIs26Degrees_increaseTemperature5times_TemperatureShouldNotExceed30Degree(){

            myAC.turnOnAC();
            for(int count = 0; count < 5; count++){myAC.increaseTemperature();}

            assertEquals(30, myAC.getTemperature());
        } 
<<<<<<< HEAD:Java/AirConditioner/src/AirConditionerTest.java
=======



        

       
>>>>>>> dcfc5d7 (Diaries):Java/AirConditioner/AirConditionerTest.java
}






