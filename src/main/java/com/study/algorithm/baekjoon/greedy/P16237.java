package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P16237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int cnt = E;
        cnt += D;
        if (A <= D) {
            A = 0;
        } else {
            A -= D;
        }

        cnt += C;
        if(B <= C){
            C -= B;
            A -= C * 2;
        } else {
            B -= C;
            cnt = cnt + B / 2 * B % 2;
            A -= B / 2;
            if(B % 2 == 0){
                A -= 3;
            }
        }
    }
}
