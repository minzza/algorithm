package com.study.algorithm.baekjoon;

import java.io.*;

public class P1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int origin = n;
        int cnt = 0;
        while (true) {

            // 십의 자리 : (n % 10) * 10) -> ex 20
            // 일의 자리 : (((n / 10) + (n % 10)) % 10) -> ex 6
            // 일의 자리에서 놓친 부분 : 몫 + 나머지를 더했을 때 10을 넘을 수 있음, 그래서 % 10이 필요
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

            cnt++;
            if (origin == n) {
                break;
            }
        }
        System.out.print(cnt);
    }
}
