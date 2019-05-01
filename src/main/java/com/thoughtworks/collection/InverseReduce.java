package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
//        throw new NotImplementedException();
//        根据给定数字无限分割至等于0(提示：9-2=7,7-2=5 ...)
        List<Integer> result = new ArrayList<>();
        for(int i = number-2;i > 0;i -= 2){
            result.add(i);
        }
        return result;
    }
}
