package day_02;

public class C05_Concatenation {
    // SELIM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
    /* ASCİİ table kullanınız
               S = 83,
               E = 69,
               L = 76,
               I = 73,
               M = 77
    */
    public static void main(String[] args) {
        char s=83;
        char e= 69;
        char l= 76;
        char i = 73;
        char m= 77;
        //SELİM
        System.out.println(s+e+l+i+m);//char verilerinin arasinda + işsreti varsa intelij bunlari mat toplar
        //yanyana yazdırmak için (concatenation için ) başına "" koyarak bu ifadeyi stringe ceviririz
        //string bir ifade ile neyi toplarsak toplayalim sonuç string olur( yan yana yazılır)
        System.out.println(""+s+e+l+i+m);











    }





}
