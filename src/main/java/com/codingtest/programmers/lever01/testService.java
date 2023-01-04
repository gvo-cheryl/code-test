package com.codingtest.programmers.lever01;

public class testService {

    public static void main(String[] args) {

        // 크기가 작은 부분 문자열 : https://school.programmers.co.kr/learn/courses/30/lessons/147355#
        System.out.println("answer = " + smallSubstring("10203", "15"));

    }

    public static int smallSubstring(String t, String p) {
        int answer = 0;

        int pLength = p.length();
        int tLength = t.length();

        for (int i=0; i<tLength-pLength+1; i++){
            if (Long.parseLong(t.substring(i, i+pLength)) <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}
