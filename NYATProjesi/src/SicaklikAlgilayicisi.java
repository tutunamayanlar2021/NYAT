import java.math.BigDecimal;
import java.util.Scanner;

   public class SicaklikAlgilayicisi implements  IDip{
    Scanner islemSec=new Scanner(System.in);
   int sicaklik;
    BigDecimal normalSıcaklık=BigDecimal.valueOf(24);

    public  void  sicaklikBul ()
    {
        int sicaklik = (int) (Math.random()*((50-24)+1));
        System.out.println("Ortam Sıcaklığı:"+sicaklik+"°C");

    }
    int secim;
    public void sicaklikDegistir()
    {
        IDip DİP =new SicaklikAlgilayicisi();
        SicaklikAlgilayicisi algilayicisi=new SicaklikAlgilayicisi();
       while(true) {
           algilayicisi.dereceArtır();
           algilayicisi.dereceAzalt();


           secim=islemSec.nextInt();
           if (secim == 1) {

               sicaklik = sicaklik + (int) (Math.random() * ((50 - 30) + 20));
               System.out.println("Artırıldı!\nYeni Derece:" + sicaklik+"°C");
               continue;

           }
           if (secim == 2) {
               sicaklik = sicaklik - (int) (Math.random() * ((50 - 24) + 1));
               System.out.println("Azaltıldı!\nYeni Derece:" + sicaklik+"°C");

           }
           break;
       }

    }


    @Override
    public void dereceArtır() {
        System.out.println("1-Soğutucunun  Derecesini arttır");
    }

    @Override
    public void dereceAzalt() {

        System.out.println("2-Soğutucunun  Derecesini azalt");
    }
}
