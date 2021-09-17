package com.example.helloworld;

public class For1to10 {

    public static void main(String[] args){
        int sum = 0;

        for (int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println("合計は"+sum+"です");
    }
}
