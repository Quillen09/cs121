package week6;

import org.junit.Test;

import static org.junit.Assert.*;

public class carTest {
    car honda = new car("Civic", 1990, true);

    @Test
    public void getYear() {
        assertEquals(1990,honda.getYear());
        assertNotNull(honda);
    }
    @Test
    public void testConstructor(){
        car honda2 = new car();
        assertNotNull(honda2);
    }
    @Test
    public void testisElectricCar(){
        car honda3 = new car("Civic", 1990,true);
        assertTrue(honda3.isElectric);
    }
    @Test
    public void testisElectricCar2(){
        car honda3 = new car("Civic", 1990,false);
        assertFalse(honda3.isElectric);
}}
