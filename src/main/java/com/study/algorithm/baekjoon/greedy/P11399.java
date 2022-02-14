package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<Integer> array = new ArrayList<>();
        while (st.hasMoreTokens()) {
            array.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(array);


        int sum = 0;
        int prev = 0;
        for (int i = 0; i < array.size(); i++) {
           sum += prev + array.get(i);

           prev += array.get(i);
        }

//        int sum = 0;
//        for (int i = 0; i < array.size(); i++) {
//            if(i == 0){
//                sum = array.get(i);
//                continue;
//            }
//
//            int temp = 0 ;
//            for (int j = 0; j < i + 1; j++) {
//                temp += array.get(j);
//            }
//            sum += temp;
//        }
    }
}
