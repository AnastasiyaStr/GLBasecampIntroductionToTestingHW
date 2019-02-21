package test;

import main.Key;
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

    @org.junit.Test
    public void whenFillUpTheMapMethodIsCalledThenMapKeysAreSumAndProduct(){

        unit.fillTheMapwithOneTripletInfo(1,2,3);
        assertTrue(unit.getMap().containsKey(new Key(6, 6)));

    }

    @org.junit.Test
    public void whenFillUpTheMapMethodIsCalledThenValueIsAssigned(){

        unit.fillTheMapwithOneTripletInfo(1,2,3);
        assertTrue(unit.getMap().containsValue(1));

    }

    @org.junit.Test
    public void whenFillUpTheMapMethodIsCalledThenValueIsIncremented(){
        unit.fillTheMapwithOneTripletInfo(1,2,3);
        assertTrue(unit.getMap().containsValue(1));

        unit.fillTheMapwithOneTripletInfo(1,2,3);
        assertTrue(unit.getMap().containsValue(2));

    }


}