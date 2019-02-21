package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObscurencyFinder {

    private Map<Key,Integer> map;
    private Key key;
    private int N;

    public Map<Key, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Key, Integer> map) {
        this.map = map;
    }

    public ObscurencyFinder() {
        this.map = map = new HashMap<>();
        key = new Key();
        N=100;
    }

    public int getProduct(int i, int i1, int i2) {
        return i*i1*i2;
    }

    public int getSum(int i, int i1, int i2) {
        return i+i1+i2;
    }

    public void fillTheMapwithOneTripletInfo(int i, int i1, int i2) {
        int sum = getSum(i,i1,i2);
        int product=getProduct(i,i1,i2);
        key.setProduct(product);
        key.setSum(sum);
        if(map.containsKey(key)) {
            Integer integer = map.get(key);
            map.replace(key,integer+1);

        }else{
            map.put(new Key(sum,product),1);
        }

    }
    public void fillWithSequentialNumbers(){
        for(int a=1;a< N;a++){
            for (int b=a+1;b < N; b++) {
                for(int c=b+1;c<N; c++) {
                    fillTheMapwithOneTripletInfo(a,b,c);
                }}}
    }

    public List<Integer> findObscureTriplets(){
        List<Integer> obscure= new ArrayList<>();
        for(int a=1;a< N;a++){
            for (int b=a+1;b < N; b++) {
                for(int c=b+1;c<N; c++){

                        obscure.add(a);
                        obscure.add(b);
                        obscure.add(c);

                }}}
        return obscure;
    }


}
