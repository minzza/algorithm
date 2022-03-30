package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P15720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int max = Math.max(A, B);
        max = Math.max(max, C);

        List<Integer> burgers = makeList(br.readLine(), A);
        List<Integer> sides = makeList(br.readLine(), B);
        List<Integer> beverages =  makeList(br.readLine(), C);
        
        int set = 0;
        int notSet = 0;
        for (int i = 0; i < max; i++) {
            int sum = 0;
            int checkNum = 0;
            if( i < burgers.size()){
                sum += burgers.get(i);
                checkNum++;
            }

            if( i < sides.size()){
                sum += sides.get(i);
                checkNum++;
            }

            if( i < beverages.size()){
                sum += beverages.get(i);
                checkNum++;
            }

            notSet += sum;

            if(checkNum == 3){
                set += (int) (sum * 0.9);
            } else {
                set += sum;
            }
        }
        System.out.println(notSet);
        System.out.println(set);

    }

    private static List<Integer> makeList(String line, int N) throws IOException {
        StringTokenizer st = new StringTokenizer(line, " ");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
