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

    public List<Triplet> findObscureTriplets(){
        List<Triplet> obscure= new ArrayList<>();
        for(int a=1;a< N;a++){
            for (int b=a+1;b < N; b++) {
                for(int c=b+1;c<N; c++){
                    if(isObscure(a,b,c)) {
                        obscure.add(new Triplet(a,b,c));
                    }
                }}}
        return obscure;
    }
    public boolean isObscure(int a, int b, int c) {

        key.setProduct(a*b*c);
        key.setSum(a+b+c);
        //System.out.println("Product "+a*b*c+" Sum: "+ (a+b+c));
        if( map.get(key)>1){
            // System.out.println("a "+a+" b "+b+" c "+c+" Product "+a*b*c+" Sum: "+ (a+b+c));
            key.setProduct((a+1)*(b+1)*(c+1));
            key.setSum((a+1)+(b+1)+(c+1));
            if( map.containsKey(key)&& map.get(key)>1) {
                key.setProduct((a+2)*(b+2)*(c+2));
                key.setSum((a+2)+(b+2)+(c+2));
                if( map.containsKey(key)&&map.get(key)>1) {
                    key.setProduct((a+3)*(b+3)*(c+3));
                    key.setSum((a+3)+(b+3)+(c+3));
                    if( map.containsKey(key)&& map.get(key)>1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
