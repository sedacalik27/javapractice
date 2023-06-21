package day_07;

public class C06_Varargs {
    // kac tane kelime verilirse verilsin
    // iclerinden en uzun olanı yazdıran bir method olusturun
    // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "Veli";
        String str3= "Ahmet";
        String str4= "Abdullah";
        String str5= "Abdurrahman";

        //main methodun içinden method oluşturacagiz

        System.out.println(enUzunKelime(str1, str2, str3, str4, str5));


    }

    public static String enUzunKelime(String... str) {//parametre kısmını ismi str olan bir array olarak düşünelim
        String enUzunKelime= "";//buldugum en uzun kelimeyi koyacagım konteyner oluşturdum
        for (String each:str) {//str arrayindeki her bir elemanı ele almak için loop oluşturduk
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        return enUzunKelime;
        //methodttan elde ettigimiz datayı yazdırmanın iki yolu vardır
        //1. return edip main methodun içinden yazdırmak
        //2.return etmeden methodun içinden yazdirmak


    }

}
