import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canbrowcoffee(){

        // given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // then
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7,coffee.getBeans());

    }

    @Test
    public void brewingConsumeBean() {

        // given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        // when
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // then
        Assert.assertEquals(0,cafe.getBeansInStock());
    }








}

