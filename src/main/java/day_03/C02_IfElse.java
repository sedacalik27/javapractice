package day_03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
       // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1 =scan.nextInt();


        System.out.println("lütfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayi1 büyüktür sayi2");
        } else{
            System.out.println("sayi1 küçüktür sayi2");
        }


























    }
}
