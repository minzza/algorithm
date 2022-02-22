package com.study.algorithm.baekjoon.greedy;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1202 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Jewel> jewels = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            Jewel jewel = new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            jewels.add(jewel);
        }
        Collections.sort(jewels, new Comparator<Jewel>() {
            @Override
            public int compare(Jewel o1, Jewel o2) {
                if (o1.weight == o2.weight) {
                    return o2.price - o1.price;
                }
                return o1.weight - o2.weight;
            }
        });

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);
        // 우선순위 큐를 내림차순으로 정렬되게 설정(최대값을 구하는 것이니까)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long result = 0;
        for (int i = 0, j = 0; i < K; i++) {
            while (j < N && jewels.get(j).getWeight() <= bags[i]) {
                pq.add(jewels.get(j++).getPrice());
            }
            if(!pq.isEmpty()){
                result += pq.poll();
            }
        }
        System.out.println(result);
    }

    static class Jewel {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }

        public int getWeight() {
            return this.weight;
        }
    }
}
