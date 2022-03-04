package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P11256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트케이

        for (int i = 0; i < T; i++) {
            int cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int j = Integer.parseInt(st.nextToken()); //사탕개수
            int n = Integer.parseInt(st.nextToken()); //상자개수

            List<Integer> boxs = new ArrayList<>();
            for (int x = 0; x < n; x++) {
                st = new StringTokenizer(br.readLine(), " ");
                boxs.add(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
            }

            Collections.sort(boxs, Collections.reverseOrder());

            for (int x = 0; x < n; x++) {
                if(j <= boxs.get(x)){
                    cnt++;
                    break;
                } else {
                    cnt++;
                    j -= boxs.get(x);
                }
            }
            System.out.println(cnt);
        }
    }
}
