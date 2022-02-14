package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = makeArray(n, br.readLine());
        int[] b = makeArray(n, br.readLine());

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for(int i=0; i < n; i++){
            sum += a[i] * b[n - 1 - i];
        }
        System.out.println(sum);

    }

    public static int[] makeArray (int n, String line){
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(line, " ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        return array;
    }
}
