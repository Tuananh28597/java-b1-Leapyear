package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();


// cach dung ì else thong thuong
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year ", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//            }else{
//                System.out.printf("%d is Not a leap year", year);
//            }


        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 ==0;
        if(isDivisibleBy4){
            boolean isDivisible100 = year % 100 ==0;
            if(isDivisible100){
                boolean isDivisible400 = year % 400 ==0;
                if (isDivisible400){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }

        }
        if(isLeapYear){
            System.out.printf("%d is a leap year",year);
        }else{
            System.out.printf("%d is Not a leap year",year);
        }
        }
    }

