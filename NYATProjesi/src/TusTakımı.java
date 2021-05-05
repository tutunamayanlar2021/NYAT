import java.util.Scanner;

public class TusTakımı implements IObserver{

    int number =0;
    int secim=0;
    Scanner islemSec=new Scanner(System.in);
    Arayuz arayuz=new Arayuz();
    SicaklikAlgilayicisi algilayici=new SicaklikAlgilayicisi();

    AkilliCihaz Adi = new AkilliCihaz.Builder()
            .Name("HerEveLazım")
            .build();
    AkilliCihaz  Surum = new AkilliCihaz.Builder()
            .Surum("1.0.3")
            .build();

    AkilliCihaz Dil = new AkilliCihaz.Builder()
            .Dil("English")
            .build();



     public void secim() {


        while (true){

            System.out.println("***************İşlem Seçiniz***************");
            System.out.println("1-Sıcaklık Görüntüle");
            System.out.println("2-Soğutucu Aç");
            System.out.println("3-Soğutucu Kapat");
            System.out.println("4-Akıllı Cihaz Hakkında");
            System.out.println("5-Çıkış Yap");
            System.out.println("********************************************");
            number= islemSec.nextInt();

            if (number== 1)
            {
                SicaklikAlgilayicisi sicaklikAlgilayicisi=new SicaklikAlgilayicisi();
                sicaklikAlgilayicisi.sicaklikBul();
                sicaklikAlgilayicisi.sicaklikDegistir();


            }

            else if (number == 2)
            {
                arayuz.sogutucuAcik(this);

            }
            else if (number == 3)
            {
                arayuz.sogutucuKapali(this);

            }
            else if(number==4){

                System.out.println("********Akıllı Cihazın Özellikleri********* ");
                System.out.println((" Adi:"+Adi).replaceAll(",null",""));
                System.out.println((" Sürümü:"+Surum).replaceAll("[,null,]",""));
                System.out.println((" Dili:"+Dil).replaceAll("null,",""));

            }
            else if(number==5){
                System.out.println("Çıkış Yapıldı");

                System.exit(0);

            }

        }

   }

    boolean cihazGuncelMi=true;
    @Override
    public void update() {

        if(!cihazGuncelMi){
            System.out.println("Akıllı cihaz için güncelleme mevcut...................");
            System.out.println("Akıllı cihaz güncelleniyor...................");
            System.out.println("Güncellemeler başarıyla tamamlandı.............");

        }else{
            System.out.println(" Akıllı cihaz güncel");
        }

    }
}
