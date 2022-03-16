package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class P6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = null;
        while ((temp = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(temp);

            String[] s = st.nextToken().split("");
            String[] t = st.nextToken().split("");

            StringBuilder sb = new StringBuilder();
            int idx = 0;
            for (int i = 0; i < s.length; i++) {
                for (int j = idx; j < t.length; j++) {
                    if(s[i].equals(t[j])){
                        idx = j + 1;
                        sb.append(s[i]);
                        break;
                    }
                }
            }
            if(s.length == sb.length()){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
