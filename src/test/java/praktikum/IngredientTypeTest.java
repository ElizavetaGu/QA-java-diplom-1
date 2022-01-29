package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final String type;
    private final boolean expectedResult;

    public IngredientTypeTest(String type, boolean expectedResult){
        this.type = type;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] hasIngredientType(){
        return new Object[][]{
                {"SAUCE", true},
                {"FILLING", true},
                {"BUN", false},
                {"", false}
        };
    }

    @Test
    public void testIngredientType(){
        boolean actualResult = true;
        try {
            String actualType = IngredientType.valueOf(type).toString();
            Assert.assertEquals(type, actualType);
        } catch (IllegalArgumentException e) {
            actualResult = false;
        }

        Assert.assertEquals(expectedResult, actualResult);
    }
}
