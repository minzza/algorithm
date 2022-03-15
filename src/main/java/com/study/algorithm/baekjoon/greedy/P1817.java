package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());



        if (N == 0) {
            System.out.println(0);
            return;
        }
        st = new StringTokenizer(br.readLine(), " ");

        int[] books = new int[N];
        for (int i = 0; i < books.length; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }

        int box = 1;
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i];
            if(M < sum){
                box++;
                sum = books[i];
            }
        }
        System.out.println(box);


    }
}
