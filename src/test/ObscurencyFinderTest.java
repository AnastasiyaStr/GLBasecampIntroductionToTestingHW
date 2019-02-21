package test;

import main.ObscurencyFinder;
import org.junit.Before;

import static org.junit.Assert.*;

public class ObscurencyFinderTest {

    private ObscurencyFinder unit;
    @Before
    public void setUp() throws Exception {
        unit = new ObscurencyFinder();
    }
    @org.junit.Test
    public void whenGetProductMethodIsCalledThenProductIsReturned(){
        int product = unit.getProduct(1,2,3);
        assertEquals(6,product);

    }

    @org.junit.Test
    public void whenGetSumMethodIsCalledThenSumIsReturned(){
        int sum = unit.getSum(1,2,3);
        assertEquals(6,sum);

    }
}