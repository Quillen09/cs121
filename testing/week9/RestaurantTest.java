package week9;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class RestaurantTest {
    private Restaurant resto2;
    private  Restaurant resto3;

    @BeforeEach
    public void setUp(){
        resto2 = new Restaurant(4, "dinner","large");
        resto3 = new Restaurant(7, "food", "small");
    }
    @Test
    public void testinstanceCount(){
        resto2 = new Restaurant(4, "dinner","large");
        resto3 = new Restaurant(7, "food", "small");
        assertEquals(2, Restaurant.getInstanceCount());
    }

}