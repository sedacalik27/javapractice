package day_08;

public class C02_StringBuilder {

    public static void main(String[] args) {
         /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
         */

        StringBuilder sb= new StringBuilder(7);
        System.out.println("sb.capacity() = " + sb.capacity());//7
        System.out.println("sb.length() = " + sb.length());//0 içinde herhangi bir deger olmadıgı için 0
        sb.append("hava guzel");
        System.out.println(sb);

        //space characterinin indexini bulup daha sonra delete yapabilirim
        int idx=sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println(sb);


        //şimdi ters çeviriyoruz
        sb.reverse();
        System.out.println(sb);

        //şimdi son dört characterini silicez
        sb.delete(sb.length()-4,sb.length());//ilk index dahil son hariç oldugundan 2.parametre length
        System.out.println(sb);

        //tekrar ters çeviricez
        sb.reverse();
        System.out.println(sb);


        //şimdi "java" yi eklicez başına
        sb.insert(0,"Java ");
        System.out.println(sb);




    }
}
