package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok basamaklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 veya çok basamaklı pozitif bir sayi giriniz");
        int sayi =scan.nextInt();

        kacBasamakli(sayi);
        //main method içinden method oluşturma
        //method ismi        + (argument)
        //kendimiz belirliyoruz  + method parantezi










    }


    public static void kacBasamakli(int sayi) {
        //bir sayi 99 dan buyukse 3 veya daha çok basamaklıdır
        System.out.println(sayi > 99 ? "sayi 3 veya daha cok basamakli" : "sayi 3 ten az basamaklı");

    }
}
