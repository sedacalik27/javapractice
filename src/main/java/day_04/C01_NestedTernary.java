package day_04;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sisteme 2 sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        
        
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


        System.out.println(sayi1==sayi2? ("Sayılar Birbirine Esit"):(sayi1>sayi2 ? sayi1: sayi2));

        

















    }
}
