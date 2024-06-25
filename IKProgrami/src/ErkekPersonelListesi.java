import java.util.Scanner;

public class ErkekPersonelListesi extends PersonelListesi {
    private String erkek;

    public ErkekPersonelListesi(String isim, String soyad, int dogumTarihi, String erkek) {
        super(isim, soyad, dogumTarihi);
        this.erkek = erkek;
    }

    public void emeklilikYasHesaplama(int yil){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Emeklilik hesaplamak icin dogum tarihini giriniz");
        int dogumTarihi=super.getDogumTarihi();
        dogumTarihi= scanner.nextInt();
        System.out.println("Emeklilik hesaplamak icin bir sene giriniz");
        yil= scanner.nextInt();
        int islem=yil-dogumTarihi;
        int kalan=65-islem;
        if ((kalan>0) ){
            System.out.println("Emekliliğinize " + kalan + " yil kaldi");
        } else if (kalan<=0) {
            System.out.println("Emeklisiniz, tebrikler!");
        }
    }
    public String getErkek() {
        return erkek;
    }

    public void setErkek(String erkek) {
        this.erkek = erkek;
    }
}
