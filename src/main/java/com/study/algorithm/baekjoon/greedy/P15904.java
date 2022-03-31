package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");


        int i = 0;
        for (String str : input) {
            if (i == 0 && "U".equals(str)) {
                i++;
            }
            if ((i == 1 || i == 3) && "C".equals(str)) {
                i++;
                if(i == 3){
                    break;
                }
            }
            if (i == 2 && "P".equals(str)) {
                i++;
            }
        }

        if(i == 4){
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
