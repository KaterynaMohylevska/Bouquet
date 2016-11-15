package com.mohylevska.flowers;

/**
 * Created by cs.ucu.edu.ua on 25.10.2016.
 */
public class Tuple<K, V extends Comparable<V>> implements Comparable<Tuple<K, V>>{

    private K k;
    private V v;


    public Tuple(K k, V v){
        this.k = k;
        this.v = v;
    }

    @Override
    public int compareTo(Tuple<K, V> o) {
        return this.v.compareTo(o.v);
    }

    public String toString(){
        return "(" + k.toString() + ", " + v.toString() + ")";
    }
}
