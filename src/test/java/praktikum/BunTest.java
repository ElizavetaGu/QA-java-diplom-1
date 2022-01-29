package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    String expectedName;
    float expectedPrice;
    Bun bun;

    @Before
    public void setUp(){
        expectedName = "black bun";
        expectedPrice = 100;
        bun = new Bun(expectedName, expectedPrice);
    }


    @Test
    public void testGetName(){
        String actualName = bun.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetPrice(){
        float actualPrice = bun.getPrice();

        assertEquals(expectedPrice, actualPrice, 0);
    }

}
