package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> pl = new ArrayList<>();
        List<Integer> ml = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                pl.add(num);
            } else {
                ml.add(num);
            }
        }

        Collections.sort(pl, Collections.reverseOrder());
        Collections.sort(ml);

        //양수
        int sum = 0;

        int i = 0;
        while (i < pl.size()) {
            if (i + 1 < pl.size() && pl.get(i) != 1 && pl.get(i + 1) != 1) {
                sum += pl.get(i++) * pl.get(i++);
            } else {
                sum += pl.get(i++);
            }
        }

        i = 0;
        //음수
        while (i < ml.size()) {
            if (i + 1 < ml.size() && ml.get(i) != 1 && ml.get(i + 1) != 1) {
                sum += ml.get(i++) * ml.get(i++);
            } else {
                sum += ml.get(i++);
            }
        }
        System.out.println(sum);
    }
}
