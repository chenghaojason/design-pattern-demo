package com.jason.designpattern.behavior.strategy.array;

/**
 * 数组处理类
 *
 * @author ChenHol.Wong
 * @create 2020/8/15 17:36
 */
public class ArrayHandler {
    private Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int[] sort(int[] arr) {
        return sort.sort(arr);
    }
}
