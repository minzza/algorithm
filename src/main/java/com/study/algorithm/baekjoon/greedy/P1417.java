package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1417 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 국회의원 후보
        int m = Integer.parseInt(br.readLine());// 다솜

        int[] nArray = new int[n - 1];

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }

        int cnt = 0;
        while (true) {
            Arrays.sort(nArray);
            if (m <= nArray[nArray.length - 1]) {
                nArray[nArray.length - 1] -= 1;
                m++;
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);

    }
}
