package day_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {


        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın



        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int b =scan.nextInt();


        //sayilarin ikisininde pozitif olması demek => a>0 && b>0
        //sayilarin ikisininde negatif olması    =>    a<0 && b<0
        //sayilarin farklı işarette olması demek => (a<0 && b>0)  || (a>0 && b<0)


        if(a>0 && b>0){
            System.out.println(a+b);
        }else if(a<0 && b<0){
            System.out.println(a*b);
        }else if((a<0 && b>0)  || (a>0 && b<0)){
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsın");
        }else{
            System.out.println("sıfır çarpmaya göre yutan elamandır");
        }































    }
}
