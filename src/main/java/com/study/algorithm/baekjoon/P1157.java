package com.study.algorithm.baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class P1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String unit = br.readLine();
        String[] alphabets = unit.split("");

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < alphabets.length; i++) {
            String alphabet = alphabets[i].toUpperCase(Locale.ROOT);
            if (!countMap.containsKey(alphabet)) {
                countMap.put(alphabet, 1);
            } else {
                countMap.put(alphabet, countMap.get(alphabet) + 1);
            }
        }

        int maxCnt = countMap.entrySet().stream().
                max((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1).
                get().
                getValue();

        long maxManyCnt = countMap.entrySet().stream()
                .filter(e -> maxCnt == e.getValue())
                .count();

        if(maxManyCnt > 1){
            System.out.println("?");
        } else {
            System.out.println(countMap.entrySet().stream()
                    .filter(e -> e.getValue() == maxCnt)
                    .map(Map.Entry::getKey)
                    .findFirst().get());
        }

    }

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String unit = br.readLine().toUpperCase(Locale.ROOT);
//        String[] alphabets = unit.split("");
//
//        List<String> distinctList = Arrays.stream(alphabets).distinct().collect(Collectors.toList());
//
//        List<Integer> countList = new ArrayList<>();
//        for (String item : distinctList) {
//            int count = 0;
//            for (int i = 0; i < alphabets.length; i++) {
//                if (item.equals(alphabets[i])) {
//                    count++;
//                }
//            }
//            countList.add(count);
//        }
//
//
//        int index = 0;
//        int maxCount = countList.get(index);
//        for (int i = 0; i < countList.size(); i++) {
//            for (int j = i + 1; j < countList.size(); j++) {
//                if (maxCount < countList.get(j)) {
//                    index = j;
//                    maxCount = countList.get(j);
//                }
//            }
//        }
//
//        int checkCount = 0;
//        for (int i = 0; i < countList.size(); i++) {
//            if( maxCount == countList.get(i)){
//                checkCount++;
//            }
//        }
//
//        if(checkCount > 1){
//            System.out.println("?");
//        } else {
//            System.out.println(distinctList.get(index));
//        }
//    }
}
