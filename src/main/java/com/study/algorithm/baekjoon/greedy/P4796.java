package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        int cnt = 1;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 || P == 0 || V == 0){
                break;
            }

            System.out.println("Case " + cnt + ": " + (((V / P) * L) + Math.min(L, (V % P))));
            cnt++;
        }

    }
}
