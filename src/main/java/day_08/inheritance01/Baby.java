package day_08.inheritance01;

public class Baby extends Child{

    int kilo=45;//basında static yazmadıgı için instance dir.

    public static void main(String[] args) {
        //static variable ve methodlar direk kullanilabilir
        System.out.println(isim);
        System.out.println(soyIsim);
        method1();
        method2();



        //instance datalara ulaşabilmek için obje oluşturalım

        Baby obj= new Baby();
        System.out.println(obj.yas);//10

        //child class objesi oluşturalım
        Child obj2=new Child();
        //obj2.kilo==>objeyi child tan oluşturdugumuz için baby deki kiloyu görmedi
        //child classta kilo variable yok
        //Parent classa da bakar, Parent classta da kilo yok
        //bu yuzden hata verir, obje hangi classtan olusturulduysa
        //o classa ve onun parentlarına bakar, asagı dogru bakmaz




    }
}
