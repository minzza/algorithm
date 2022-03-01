package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P10610 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] N = br.readLine().split("");
        long sum = 0;
        for (String n : N){
            sum += Integer.parseInt(n);
        }
        Arrays.sort(N, Collections.reverseOrder());

        if(N[N.length-1].equals("0") && sum % 3 == 0){
            StringBuffer sb = new StringBuffer();
            for(String n : N){
                sb.append(n);
            }
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
