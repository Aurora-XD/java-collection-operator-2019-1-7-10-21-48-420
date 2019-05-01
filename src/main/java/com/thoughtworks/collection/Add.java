package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
//        throw new NotImplementedException();
//        求两个参数间的偶数和
        int result = 0;
        int startNumber = leftBorder;
        int endNumber = rightBorder;
        if(leftBorder>rightBorder){
            startNumber = rightBorder;
            endNumber = leftBorder;
        }
        for(int i = startNumber;i <= endNumber;i++){
            if ( i % 2 == 0){
                result += i;
            }
        }
        return  result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
//        throw new NotImplementedException();
//        求两个参数间的奇数和
        int result = 0;
        int startNumber = leftBorder;
        int endNumber = rightBorder;
        if(leftBorder>rightBorder){
            startNumber = rightBorder;
            endNumber = leftBorder;
        }
        for(int i = startNumber;i <= endNumber;i++){
            if ( i % 2 == 1){
                result += i;
            }
        }
        return  result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        数组中每个元素3倍加2的和
        int result = 0;
        for (Integer integer : arrayList) {
            result += integer*3+2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        奇数3倍加2，偶数不变
        List<Integer> result = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer%2 == 1){
                result.add(integer*3+2);
            }
            else {
                result.add(integer);
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        奇数3倍加5
        int result = 0;
        for (Integer integer : arrayList) {
            if(integer%2 == 1){
                result += integer*3+5;
            }
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        求数组中所有偶数组成的数组的中位数
        double result = 0;
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer%2 == 0){
                evenList.add(integer);
            }
        }
        int index = evenList.size()/2;
        if(evenList.size()%2 == 0){
            result = (evenList.get(index-1)+evenList.get(index))/2;
        }
        else {
            result = evenList.get(index);
        }
        return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        求数组中所有偶数的平均数
        double result = 0;
        int evenCount = 0;
        for (Integer integer : arrayList) {
            if(integer%2 == 0){
                result += integer;
                evenCount += 1;
            }
        }
        if(evenCount != 0){
            result /= evenCount;
        }
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//        求数组中所有偶数组成的数组是否包含某特定的数specialElment
        //为什么不直接遍历一遍求解？？
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer%2 == 0){
                evenList.add(integer);
            }
        }
        if(evenList.contains(specialElment)){
            return true;
        }
        else{
            return false;
        }
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        找出数组中的所有偶数，从中剔除重复数据并返回
        List<Integer> result = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer%2 ==  0 && !result.contains(integer)){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        排序数组 结果使数组偶数在递增在前，奇数递减在后
        List<Integer> result = new ArrayList<>();
        //Collections.sort()默认升序排序，降序排序时需要重写compare方法
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            if(integer%2 == 0){
                result.add(integer);
            }
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer integer : arrayList) {
            if(integer%2 == 1){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        数组中前一个元素和后一个元素的和的3倍的数组
        List<Integer> result = new ArrayList<>();
        if(arrayList.size()>=2){
            for(int i = 1;i < arrayList.size();i++){
                result.add((arrayList.get(i)+arrayList.get(i-1))*3);
            }
        }
        return result;
    }
}
