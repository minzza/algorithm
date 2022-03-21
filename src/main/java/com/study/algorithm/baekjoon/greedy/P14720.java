package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int storeCount = Integer.parseInt(br.readLine());
        int[] stores = new int[storeCount];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < storeCount; i++) {
            stores[i] = Integer.parseInt(st.nextToken());
        }

        boolean isStrawberry = false;
        boolean isChoco = false;
        boolean isBanana = false;

        int cnt = 0;
        for (int i = 0; i < storeCount; i++) {

            if(isStrawberry && isChoco && isBanana){
                isStrawberry = false;
                isChoco = false;
                isBanana = false;
            }

            if (!isStrawberry) {
                if (stores[i] == 0) {
                    isStrawberry = true;
                    cnt ++;
                    continue;
                }
                continue;
            }

            if (!isChoco) {
                if (stores[i] == 1) {
                    isChoco = true;
                    cnt ++;
                    continue;
                }
                continue;
            }
            if (!isBanana) {
                if (stores[i] == 2) {
                    isBanana = true;
                    cnt ++;
                    continue;
                }
                continue;
            }
        }
        System.out.println(cnt);
    }
}
