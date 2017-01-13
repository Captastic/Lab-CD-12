package capriotti.anthony.cd12;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
import static org.junit.Assert.*;
import capriotti.anthony.cd12.SumOrProductTest;
import org.junit.Before;
import org.junit.Test;

public class SumOrProductTest {
    SumOrProduct thing = new SumOrProduct();

    @Test
    public void sumTest(){
        Integer expected = 6;
        Integer actual = thing.sumFunction(3);
    }

    @Test
    public void productTest(){
        Integer expected = 1;
        Integer actual = thing.sumFunction(1);
    }

}
