public class KadınPersonelListesi {

    public void emeklilikYasHesaplama(int yil){
        String isim=null;
        PersonelListesi personelListesi=new PersonelListesi(isim, isim, yil);
        personelListesi.emeklilikYasHesaplama(yil);
    }
}
