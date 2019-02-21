package test;

import main.Key;
import main.ObscurencyFinder;
import org.junit.Before;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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

    @org.junit.Test
    public void whenFillTheMapThenSequentialNumbersAreUsed(){
        //1:1-2-3
        //2:1-2-4
        //3:1-2-5
        //4:1-2-6

        unit.fillWithSequentialNumbers();
        Map<Key, Integer> testMap = new HashMap<>();
        testMap.put(new Key(6,6),1);
        testMap.put(new Key(7,8),1);
        testMap.put(new Key(8,10),1);
        testMap.put(new Key(9,12),1);

        assertTrue(unit.getMap().keySet().containsAll(testMap.keySet())&&unit.getMap().values().containsAll(testMap.values()));

    }
    @org.junit.Test
    public void whenFindObscureTripletsThenFilledListIsReturned(){
        unit.fillWithSequentialNumbers();
        assertTrue(!unit.findObscureTriplets().isEmpty());

    }

}