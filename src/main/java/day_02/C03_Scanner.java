package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //ctrl alt L düzenleme
    //ctrl z-> işlemi geri alma

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);//scanner objesi olusturdum ismine input verdim
        System.out.println("lutfen birinci sayiyi girin");
        int x = input.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int y =input.nextInt();

        boolean sonuc = karelerEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);


    }

    private static boolean karelerEsitMi(int x, int y) {
        //javada = isaret assignment(atama) isaretidir
        //matematiksel anlamdaki esit icin == kullanırız
        boolean sonuc = x*x==y*y;
        return sonuc;




    }
}
