public class Departman {
    private String isim;
    private String soyad;
    private int dogumTarihi;

    public Departman(String isim, String soyad, int dogumTarihi) {
        this.isim = isim;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }
    public Departman(String isim){
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(int dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }


}
