package com.jason.designpattern.behavior.strategy.array;

/**
 * 选择排序
 *
 * @author ChenHol.Wong
 * @create 2020/8/15 17:29
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("选择排序结束");
        return arr;
    }
}
