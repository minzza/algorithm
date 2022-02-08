package com.study.algorithm.baekjoon.success;

import java.io.*;
import java.util.*;

public class P1145 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int value = 1;
        int cnt = 0;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (value % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                System.out.println(value);
                break;
            }
            cnt = 0;
            value++;
        }
    }
}
