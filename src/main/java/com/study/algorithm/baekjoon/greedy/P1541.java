package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class P1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split("-");

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int temp = 0;

            String[] a = array[i].split("\\+");

            for (int j = 0; j < a.length; j++) {
                temp += Integer.parseInt(a[j]);
            }

            if (sum == 0) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
