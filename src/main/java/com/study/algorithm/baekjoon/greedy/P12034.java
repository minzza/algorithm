package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P12034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append("Case #" + (i + 1) + ": ");

            int P = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> PS = new ArrayList<>();
            for (int j = 0; j < (P * 2); j++) {
                PS.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < PS.size(); j++) {
                for (int z = j + 1; z < PS.size(); z++) {
                    int sale = (int) (PS.get(z) * 0.75);
                    if (PS.get(j) == sale) {
                        sb.append(PS.get(j) + " ");
                        PS.remove(z);
                        break;
                    }
                }
            }

            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
