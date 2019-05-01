package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
//        throw new NotImplementedException();
//        将集合A中得元素映射成集合B中的元素
        List<Integer> result = new ArrayList<>();
        for (Integer integer : this.array) {
            result.add(integer*3);
        }
        return result;
    }

    public List<String> mapLetter() {
//        throw new NotImplementedException();
//        数字映射为字母
        List<String> result = new ArrayList<>();
        for (Integer integer : this.array) {
            //注意数组下标从0开始，但数字从1开始
            result.add(letterList.get(integer-1));
        }
        return result;
    }

    public List<String> mapLetters() {
//        throw new NotImplementedException();
//        字母表映射
        List<String> result = new ArrayList<>();
        for (Integer integer : this.array) {
            int divNum = (integer-1)/26;
            int remainNum = (integer-1)%26;
            if(divNum > 0){
                result.add(letterList.get(divNum-1)+letterList.get(remainNum));
            }
            else {
                result.add(letterList.get(remainNum));
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
//        throw new NotImplementedException();
//        从大到小排序
        Collections.sort(this.array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return this.array;
    }

    public List<Integer> sortFromSmall() {
//        throw new NotImplementedException();
        Collections.sort(this.array);
        return this.array;
    }
}
