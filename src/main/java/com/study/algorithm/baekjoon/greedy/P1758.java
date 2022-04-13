package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> seq = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            seq.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(seq, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < N; i++) {

            if(seq.get(i) - ((i + 1) - 1) <= 0){
                break;
            }
            sum += seq.get(i) - ((i + 1) - 1);
        }

        System.out.println(sum);
    }
}
