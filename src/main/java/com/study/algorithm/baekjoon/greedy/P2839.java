package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while (true) {

            // 5kg의 최대 사용 여부 확인 && 남은 설탕이 없는 경우
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                break;
            }

            // 정확하게 만들 수 없을 경우
            if(N < 0){
                System.out.println(-1);
                break;
            }

            // 3kg의 봉지 사용 개수 늘리기
            N -= 3;
            count++;
        }
    }
}