package day_08.inheritance01;

public class Child extends Parent {
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
    // STATİC VARİABLE'LARI VE STATİC METHODLARI
    // FARKLI BİR CLASS'DAN CAGIRABİLMEK İCİN CLASS İSMİ KULLANILIR.
    // FAKAT BU İKİ CLASS ARASINDA PARENT CHİLD İLİSKİSİ VARSA,
    // DİREK KULLANILABİLİR


    int yas=10;


    public static void main(String[] args) {
       // Math.abs(2);
        //Math classından abs() static methodunu class ismi ile cagırabiliyoruz.

        //iki class arasında parent child ilişkisi olunca normalde aşagıdaki parentları yazmamıza gerek yok
        Parent.method1();
        System.out.println(Parent.isim);//Ali
        isim="Veli";//atama yapınca parent class taki isimi güncelledik
        System.out.println(isim);//Veli

        System.out.println(soyIsim);//Can
        soyIsim="Tan";
        System.out.println(soyIsim);//Tan olarak güncelledik


        //parent classtaki static methodları çagırıyoruz
        method2();


        //yas variable cagırmak için int yas variable ların ikisinden birinin static olması gerekir

        //hem parenttaki hem de child daki yas variable ları instance
        //herhangi bir static yas variable yok
        //instance variablelar static methodlarda direk kullanılamadıkları için
        //yas variable ını da main methodda kullanamadık

        //kullanabilmek için obje oluşturmak zorundayız

        //child classından obje oluşturunuz
        Child obj1= new Child();
        System.out.println(obj1.yas);//10

        //parent classtan obje oluşturalim
        Parent obj2=new Parent();
        System.out.println(obj2.yas);//30

        //variablelari ararken hep yukarı dogru bakarız yani hep parentlar olarak

        obj2.method3();//Parent class instance method3
        obj2.method4();//Parent class instance method4




    }
}
