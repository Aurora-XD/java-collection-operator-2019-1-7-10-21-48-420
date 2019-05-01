package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
//        throw new NotImplementedException();
//        选出给定区间中所有的数字
        List<Integer> result = new ArrayList<>();
        if(left < right){
            for(int i = left;i <= right;i++){
                result.add(i);
            }
        }
        else {
            for(int i = left;i >= right;i--){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
//        throw new NotImplementedException();
//        选出给定区间中所有的偶数
        List<Integer> result = new ArrayList<>();
        if(left < right){
            for(int i = left;i <= right;i++){
                if(i%2 == 0){
                    result.add(i);
                }
            }
        }
        else {
            for(int i = left;i >= right;i--){
                if(i%2 == 0){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
//        throw new NotImplementedException();
//        选出给定区间中所有的偶数
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if(i%2 == 0){
                result.add(i);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
//        throw new NotImplementedException();
//        弹出集合最后一个元素
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
//        throw new NotImplementedException();
//        弹出两个集合的交集
        List<Integer> result = new ArrayList<>();
        for (int i : firstArray) {
            for(int j = 0;j <secondArray.length;j++){
                if(secondArray[j] == i){
                   result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//        throw new NotImplementedException();
//        将集合二中与集合一不同的元素加入集合一
        List<Integer> result = new ArrayList<>();
        for (Integer integer : Arrays.asList(firstArray)) {
            result.add(integer);
        }
        for (Integer integer : Arrays.asList(secondArray)) {
            if(!Arrays.asList(firstArray).contains(integer)){
                result.add(integer);
            }
        }
        return result;
    }
}
