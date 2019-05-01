package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
//        throw new NotImplementedException();
//        求数组中的偶数
        List<Integer> result = new ArrayList<>();
        for (Integer integer : this.array) {
            if(integer%2 == 0){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
//        throw new NotImplementedException();
//        求数组中3的倍数
        List<Integer> result = new ArrayList<>();
        for (Integer integer : this.array) {
            if(integer%3 == 0){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
//        throw new NotImplementedException();
//        求两数组的公共元素
        List<Integer> result = new ArrayList<>();
        for (Integer integer : firstList) {
            if(secondList.contains(integer)){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> getDifferentElements() {
//        throw new NotImplementedException();
//        去除数组中的重复元素
        List<Integer> result = new ArrayList<>();
        for (Integer integer : this.array) {
            if(!result.contains(integer)){
                result.add(integer);
            }
        }
        return result;
    }
}