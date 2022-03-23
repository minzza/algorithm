package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        System.out.print(Integer.parseInt(A.replace("6", "5")) + Integer.parseInt(B.replace("6", "5")));
        System.out.print(" ");
        System.out.print(Integer.parseInt(A.replace("5", "6")) + Integer.parseInt(B.replace("5", "6")));

    }
}
