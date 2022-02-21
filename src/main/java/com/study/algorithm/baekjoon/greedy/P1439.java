package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("");


        List<Boolean> list = new ArrayList<>();
        boolean isChange = false;
        for (int i = 0; i < S.length; i++) {
            if (i == 0) {
                list.add(isChange);
            } else {
                if (S[i].equals(S[i - 1])) {
                    continue;
                } else {
                    isChange = !isChange;
                    list.add(isChange);
                }
            }
        }

        if (list.size() <= 1) {
            System.out.println(0);
        } else {
            int zeroCnt = 0;
            int oneCnt = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)){
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }
            if(zeroCnt < oneCnt){
                System.out.println(zeroCnt);
            }else {
                System.out.println(oneCnt);
            }
        }
    }
}
