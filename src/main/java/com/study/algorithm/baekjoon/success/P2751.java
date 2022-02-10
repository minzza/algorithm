package com.study.algorithm.baekjoon.success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 시간 복잡도 문제 O(logN)
 * 퀵 정렬은 안됨 -> 최악의 경우 O(N^2)이기때문에
 * Collections sort를 사용.
 * 출력도 빠른 StringBuilder로 사용해야한다.
 */
public class P2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            array.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int x : array) {
            sb.append(x).append('\n');
        }
        System.out.println(sb);
    }
}
