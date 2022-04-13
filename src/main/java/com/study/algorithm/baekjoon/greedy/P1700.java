package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        Set<Integer> set = new HashSet<>();

        int cnt = 0;
        for (int i = 0; i < k; i++) {
            int num = list.get(i);
            if (set.contains(num)) {
                continue;
            }
            if (set.size() < n) {
                set.add(num);
                continue;
            }

            int removeValue = 0;
            int max = Integer.MIN_VALUE;
            for (int item : set) {
                int temp = 0;
                List<Integer> slice = list.subList(i + 1, k);

                if (slice.contains(item)) {
                    temp = slice.indexOf(item); // 0
                } else {
                    temp = -1;
                    removeValue = item;
                    break;
                }

                if(temp > max){
                    max = temp;
                    removeValue = item;
                }
            }

            set.remove(removeValue);
            set.add(num);
            cnt++;
        }

        System.out.println(cnt);
    }
}
