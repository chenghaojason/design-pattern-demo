package com.jason.designpattern.behavior.strategy.array;

/**
 * 插入排序
 *
 * @author ChenHol.Wong
 * @create 2020/8/15 17:33
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
                arr[j] = temp;
            }
        }
        System.out.println("插入排序结束");
        return arr;
    }
}
