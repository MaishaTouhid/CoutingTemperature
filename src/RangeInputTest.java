import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeInputTest {
    RangeInput passengerTemperature1,passengerTemperature2,driverTemperature;
    @BeforeEach
    void setUp(){
        passengerTemperature1 = new RangeInput(70,50);
        passengerTemperature2 = new RangeInput(80,60);
           driverTemperature = new RangeInput(120,80);
    }
    @Test
    void getCurrentTemperatureForpassenger1() {
        passengerTemperature1.Down();
        passengerTemperature1.Down();
        passengerTemperature1.Up();
        assertEquals(59, passengerTemperature1.getCurrentTemperature());
        passengerTemperature2.Down();
        passengerTemperature2.Up();
        passengerTemperature2.Up();
        assertEquals(71, passengerTemperature2.getCurrentTemperature());

    }
    @Test
    void getCurrentTemperatureForDriver() {
        driverTemperature.Down();
        driverTemperature.Down();
        driverTemperature.Up();
        assertEquals(99, driverTemperature.getCurrentTemperature());
    }

    @Test
    void getCurrentTemperatureForDriver1() {
    }
}