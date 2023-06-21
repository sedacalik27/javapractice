package day_08;

public class C04_Encapsulation {

    //bu classı runner olarak kullanıcaz
    public static void main(String[] args) {
        //C03 classından obje oluşturun
        // Ali, Can,25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        //objenin yasını 30 olarak guncelleyin
        //parametresiz cons kullanarak 2. bir obje olusturun
        //Ayse, Yilmaz, 40 degerlerini atayın
        //yas ı -5 olarak guncelleyin
        //yas negatif deger alamayacak sekilde set meyhodunu guncelleyin bunu C03 de if ile yaptık
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin



        //parametreli cons kullanarak obje oluşturalım
        //eger c03 te to string methodu eklemeseydik yazdırınca referansı yazdırır

        C03_Encapsulation obj1= new C03_Encapsulation("Ali","Can",25);

        System.out.println(obj1);//Bu yazdırma işlemi to string methodundan kaynaklı

        //objenin yasını 30 olarak guncelleyin
        //set methodunu kullanarak yaşı güncelledik
        obj1.setYas(30);
        System.out.println(obj1);//C03_Encapsulation{isim='Ali', soyIsim='Can', yas=30}


        //parametresiz cons kullanarak 2. bir obje olusturun

        C03_Encapsulation obj2= new C03_Encapsulation();
        System.out.println(obj2);//C03_Encapsulation{isim='null', soyIsim='null', yas=0}

        //Ayse, Yilmaz, 40 degerlerini atayın

        obj2.setIsim("Ayse");
        obj2.setSoyIsim("Yilmaz");
        obj2.setYas(40);
        System.out.println(obj2);//C03_Encapsulation{isim='Ayse', soyIsim='Yilmaz', yas=40}

        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2);


        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        //bunları C03 classında yaptık ifle
        obj2.setIsim("ayse");
        System.out.println(obj2);//Isim buyuk harfle başlamali mesajını verdi ve oldugu gibi yazdırdı





    }
}
