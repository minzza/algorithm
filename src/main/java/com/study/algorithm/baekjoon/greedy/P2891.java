package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int totalTeam = Integer.parseInt(st.nextToken());
        int minusTeamNum = Integer.parseInt(st.nextToken());
        int plusTeamNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int minusTeams[] = new int[minusTeamNum];
        for (int i = 0; i < minusTeamNum; i++) {
            minusTeams[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int plusTeams[] = new int[plusTeamNum];
        for (int i = 0; i < plusTeamNum; i++) {
            plusTeams[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < minusTeams.length; i++) {
            int minusTeam = minusTeams[i];
            for (int j = i; j < plusTeams.length; j++) {
                if (minusTeam == plusTeams[j] - 1) {
                    if(temp != plusTeams[j] - 1){
                        temp = plusTeams[j];
                        count++;
                        break;
                    }

                } else if (minusTeam == plusTeams[j] + 1) {
                    if(temp != plusTeams[j] + 1){
                        temp = plusTeams[j] ;
                        count++;
                        break;
                    }

                }
            }
        }
        System.out.println(minusTeamNum - count);

    }
}
