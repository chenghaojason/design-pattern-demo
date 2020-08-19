package com.jason.designpattern.behavior.strategy.array;

/**
 * 冒泡排序
 *
 * @author ChenHol.Wong
 * @create 2020/8/15 17:24
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("冒泡排序结束");
        return arr;
    }
}
