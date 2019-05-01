package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
//        throw new NotImplementedException();
//        获取数组中的最大值
        int max = this.arrayList.get(0);
        for (Integer integer : this.arrayList) {
            if(integer > max){
                max = integer;
            }
        }
        return max;
    }

    public double getMinimum() {
//        throw new NotImplementedException();
//        获取数组中的最小值
        int min = this.arrayList.get(0);
        for (Integer integer : this.arrayList) {
            if(integer < min){
                min = integer;
            }
        }
        return min;
    }

    public double getAverage() {
//        throw new NotImplementedException();
//        获取数组的平均值
        double result = 0;
        double sumList = 0;
        for (Integer integer : this.arrayList) {
            sumList += integer;
        }
        result = sumList/this.arrayList.size();
        return result;
    }

    public double getOrderedMedian() {
//        throw new NotImplementedException();
//        获取数组中位数
        double result = 0;
        int medianIndex = this.arrayList.size()/2;
        if(this.arrayList.size()%2 == 0){
            result = (this.arrayList.get(medianIndex-1)+this.arrayList.get(medianIndex))/2.0;
        }
        else {
            result = this.arrayList.get(medianIndex);
        }
        return result;
    }

    public int getFirstEven() {
//        throw new NotImplementedException();
//        获取数组中第一个偶数
//        ???
        int result = 0;
        for (Integer integer : this.arrayList) {
            if(integer%2 == 0){
                result = integer;
                break;
            }
        }
        return result;
    }

    public int getIndexOfFirstEven() {
//        throw new NotImplementedException();
//        获取数组中第一个偶数的下标
        int result = -1;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if(this.arrayList.get(i)%2 == 0){
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean isEqual(List<Integer> arrayList) {
//        throw new NotImplementedException();
//        判断两个数组是否相等
        if(this.arrayList.size() != arrayList.size()){
            return false;
        }
        else{
            for (int i = 0; i < arrayList.size(); i++) {
                if(this.arrayList.get(i) != arrayList.get(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
//        throw new NotImplementedException();
        Double result;
//        int nodeNum = 0;
//        for (int i = 1;;i++){
//            if (singleLink.getNode(i) != null){
//                nodeNum += 1;
//            }
//            else {
//                break;
//            }
//        }

        int medianIndex = this.arrayList.size()/2;
        if(arrayList.size()%2 == 0){
            result = (this.arrayList.get(medianIndex-1)+this.arrayList.get(medianIndex))/2.0;
        }
        else {
            result = this.arrayList.get(medianIndex)*1.0;
        }
        return result;
    }

    public int getLastOdd() {
//        throw new NotImplementedException();
//        获取数组中最后一个奇数
        int result = 0;
        for (Integer integer : this.arrayList) {
            if(integer%2 == 1){
                result = integer;
            }
        }
        return result;
    }

    public int getIndexOfLastOdd() {
//        throw new NotImplementedException();
//        获取数组中最后一个奇数的下标
        int result = -1;
        for (int i = 0; i <this.arrayList.size() ; i++) {
            if(this.arrayList.get(i)%2 == 1){
                result = i;
            }
        }
        return result;
    }
}
