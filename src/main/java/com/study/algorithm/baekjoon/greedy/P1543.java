package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String str = br.readLine();

        int cnt = 0;
        while (line.length() > 0) {
            if (line.startsWith(str)) {
                cnt++;
                line = line.substring(str.length());
            } else {
                line = line.substring(1);
            }
        }
        System.out.println(cnt);

    }
}
