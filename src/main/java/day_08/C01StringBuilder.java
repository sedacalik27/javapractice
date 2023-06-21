package day_08;

import java.util.Scanner;

public class C01StringBuilder {
    //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
    //capasity lenght yazdırın
    //capasity i lenghte esıtleyın tekrar yazdırın
    //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
    //iki objeyi karsılastırın(== , equals , compareTo ile)

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);//scanner objesi oluşturduk
        //data turu(class ismi)+isim  =  new keywordu +  constructor
        //neden obje olusturduk--> next() instance methoduna ulasmak için
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.next();

        StringBuilder sb= new StringBuilder(kelime);//sb objesi oluşturduk
        System.out.println(sb);

        System.out.println("sb.capacity() = " + sb.capacity());//19
        //parametresiz constructor kullanırsak default deger 16
        //parametreli constructor kullanırsak parametre olarak verdiğimiz stringuzunlugu+  +16 olarabl belirlenir.
        System.out.println("sb.length() = " + sb.length());

        sb.trimToSize();//bu method capasiteyi lenght e eşitler
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());


        //parametresiz bir constructor oluşturucaz
        //appent methodlar overload edilmiş methodlardir
        StringBuilder sb2= new StringBuilder();
        sb2.append(kelime);
        System.out.println(sb2);

        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        System.out.println(sb==sb2);
        //sb==sb2 hem referans hem deger kontrolu sagladıgı için false
        System.out.println(sb.equals(sb2));
        //sb.equals(sb2) hem referans hem deger kontrolu sagladıgı için false
        //sb ve sb2 iki farklı obje oldugundan adresleri farklıdır
        System.out.println(sb.compareTo(sb2));
        /*
        compareTo methodu 0 veya farklı deger dondurur
        bizim için onemli olan 0 mı değil mi
        0 ise iki objenin degerleri aynı demektir
         */


    }


}
