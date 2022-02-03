package com.study.algorithm.baekjoon;

import java.util.Scanner;

public class P1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] dirs = new String[n];

        for (int i = 0; i < dirs.length; i++) {
            dirs[i] = sc.next();
        }


        for (int i = 0; i < dirs[0].length(); i++) {

            boolean diff = false;

            for (int j = 0; j < n - 1; j++) {

                char origin = dirs[j].charAt(i);
                char temp = dirs[j + 1].charAt(i);

                if(origin != temp){
                    diff = true;
                    break;
                }
            }
            if(diff){
                System.out.print("?");
            }
            else {
                System.out.print(dirs[0].charAt(i));
            }
        }
    }
}
