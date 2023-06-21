package day_01;

public class C01_Variables {

    public static void main(String[] args) {

        //Bir variable olustur, yazdır
        int yas = 36;
        //syntax : variable data turu + variable isim +atama operatoru + variable deger
        int sayi = 50;
        System.out.println(yas);//ctrl d ile satırı alt alta cogaltabılırız
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        //sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi);
        //sayi variable ini etiketiyle birlikte yazdırma
        //ctrl alt L -> kodlarımızı duzenlemeye yarar
        //bir variable ı etiketiyle birlikte yazdırmanın kısa yolu = soutv
        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("yas = " + yas);
        //String bir variable olusturalım ->non primitive bir data turu, "" icinde yazılır, buyuk harfle baslar
        String isim = "Ali";

        //isim variable ını etıketıyle yazdır
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagım :benimYasim ve bu variable ın degeri yas variablenın degerine esıt olsun
        //benimYasim variable degeri de yas variablenın degeri gibi 36 olsun
        int benimYasim = yas;


        //onunIsmi variablenın degeri "ali" olsun ve bunu kopyalama islemi ile yapalim
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //camelCase
        //PascalCase
        //snake_case
        //kebab-case


        //Aynı satırda coklu variable deklare et
        int yil = 2023, ay = 5, gun = 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        //Bir variable degerini guncelle
        //az once olusturdugumuz isim variablenın degerini Veli olarak guncelle
        isim ="Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        //java yukaridan asagı ve soldan saga calisir



        //Degişkenleri(variable) yazdır


        //Bir variable deklere et : x ->deklare etmek =tanimlamak->data turu+data ismi
        //deklere et dedigi için deger ataması yamak zorunda degiliz
        double x;

        //Bir variable baslat : y
        //başlat dedigi için bir deger ataması yapmak zorundayız
        double y = 12.5;

        //Başka bir variable başlat : z
        double z = 33;//java buraya yazdigimiz 33 degerini 33.0 olarak algiladi ve hata vermedi


        //x degişkenini y degişkeni ile başlat
        x = y;//bir variable bir scope(main method) da bir kez deklare edilebilir


        //Variable y'i guncelle
        y = 13.9;//ondalikli sayilarda . kulklaniriz

        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }







}
