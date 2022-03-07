package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 달걀 개수
        int M = Integer.parseInt(st.nextToken()); // 잠재 고객

        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            prices.add(Integer.parseInt(br.readLine())); // 잠재 고객의 제시 가격
        }

        Collections.sort(prices);

        int result = 0;
        int max = 0;
        int price = 0;
        for (int i = 0; i < M; i++) {
            if (M - i < N) {
                result = prices.get(i) * (M - i);
            } else {
                result = prices.get(i) * N;
            }
            if(result > max){
                max = result;
                price = prices.get(i);
            }
        }
        System.out.println(price + " " + max);
    }
}
