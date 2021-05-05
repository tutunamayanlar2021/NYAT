public class Arayuz  implements  IObservable  {
    private boolean sogutucuDurum;
    Eyleyici eyle = new Eyleyici();
    SicaklikAlgilayicisi sicaklikAlgila = new SicaklikAlgilayicisi();
    @Override
    public void sogutucuAcik(IObserver observer) {
        if (!this.sogutucuDurum) {

                System.out.println("Soğutucu Açıldı!");

        }
    }

    @Override
    public void sogutucuKapali(IObserver observer) {

        if (!this.sogutucuDurum )
        {
            System.out.println("Soğutucu kapatıldı!");

        }
    }


}
