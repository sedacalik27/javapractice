package day_08;

public class C03_Encapsulation {
    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;//instance

    private String soyIsim;

    private int yas;


    public C03_Encapsulation() {
        /*
        method ile constructor farkı;
          return type i yoktur
          ismi class ismi ile aynıdır,buyuk harfle başlar

          --parametreli olup olmamak ortak özellikleridir yani bu aralarındaki fark değil

         */
    }

    public C03_Encapsulation(String isim, String soyIsim, int yas) {
        if(isim.charAt(0)>='A' && isim.charAt(0)<='Z'){//bu aralık buyuk harfleri işaret eder.
            this.isim = isim;
        }else{
            System.out.println("Isim buyuk harfle başlamali");
        }
        this.soyIsim = soyIsim;
        if(yas>=0){
            this.yas = yas;
        }else{
            System.out.println("Yas negatif deger alamaz");
        }

    }



    //getter ve setter oluşturduk
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if(isim.charAt(0)>='A' && isim.charAt(0)<='Z'){//bu aralık buyuk harfleri işaret eder.
        this.isim = isim;
        }else{
            System.out.println("Isim buyuk harfle başlamali");
        }
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        //yaş negatif deger alamayacak şekilde kodu düzenleyelim
        if(yas>=0){
        this.yas = yas;
        }else{
            System.out.println("Yas negatif deger alamaz");
        }
    }


    //to string yaptık;
    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
