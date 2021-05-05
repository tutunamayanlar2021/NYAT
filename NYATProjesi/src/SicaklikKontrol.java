public class SicaklikKontrol {
    IDip _dip;
    public SicaklikKontrol(IDip dip){
        this._dip=dip;

    }

    public SicaklikKontrol() {
        _dip.dereceArtır();
        _dip.dereceAzalt();
    }


}
