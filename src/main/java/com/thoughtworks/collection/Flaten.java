package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
//        throw new NotImplementedException();
//        把二维数组变成一维数组
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            for (Integer integer : array[i]) {
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
//        throw new NotImplementedException();
//         把二维数组变成一维数组,消除重复,按照第一次出现的顺序排列最后的输出结果
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            for (Integer integer : array[i]) {
                if(!result.contains(integer)){
                    result.add(integer);
                }
            }
        }
        return result;
    }
}
