package com.wdjr.springboot.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.swap;

public class Test {
    public static void main(String[] args) {

        int[] array = {12,15,2,56,23,14};
        selectSort(array);
        //冒泡排序
        for (int i : array) {
            System.out.println(i);
        }
    }


    /**
     * 插入排序
     */
    public static void insertSort() {

    }


    /**
     * 选择排序
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) swap(array, i, j);
            }
        }

    }


    /**
     * 冒泡排序 正序
     * @param a
     */
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int s = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    s++;
                }
            }
            if (s == 0) break;
        }
    }

}
