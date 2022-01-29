package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    Ingredient ingredient;
    IngredientType ingredientType;
    String ingredientName;
    float ingredientPrice;

    @Before
    public void setUp(){
        ingredientName = "ingredientName";
        ingredientPrice = 100;
        ingredientType = SAUCE;
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
    }

    @Test
    public void testGetType(){
        Assert.assertEquals(ingredientType, ingredient.getType());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals(ingredientName, ingredient.getName());
    }

    @Test
    public void testGetPrice(){
        Assert.assertEquals(ingredientPrice, ingredient.getPrice(), 0);
    }
}
