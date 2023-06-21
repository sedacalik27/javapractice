package day_06;

import java.util.Arrays;

public class C02_Arrays {
     /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
     public static void main(String[] args) {

         int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
         //int arr[]= iki şekilde de olur.


         System.out.println(Arrays.toString(arr));//[100, 10001, -90, 845, 8787, 898, 0, 1]
         Arrays.sort(arr);//array i kucukten buyuge sıralamış olduk

         System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]

         System.out.println("minumum :"+ arr[0]);//minumum :-90
         System.out.println("maximum: " + arr[arr.length-1]);//arrayin son elemanını alırım//maximum: 10001

         System.out.println("ikinci maximum :"+ arr[arr.length-2]);//Arrayin sondan ikinci elemanını alırım
                                                                   //ikinci maximum :8787











     }
}
