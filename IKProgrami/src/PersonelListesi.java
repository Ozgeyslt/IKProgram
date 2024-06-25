import java.util.Scanner;

public class PersonelListesi extends Departman{

    public PersonelListesi(String isim, String soyad, int dogumTarihi) {
        super(isim, soyad, dogumTarihi);
    }

    public void emeklilikYasHesaplama(int yil){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Emeklilik hesaplamak icin dogum tarihini giriniz");
        int dogumTarihi=super.getDogumTarihi();
        dogumTarihi= scanner.nextInt();
        System.out.println("Emeklilik hesaplamak icin bir sene giriniz");
        yil= scanner.nextInt();
        int islem=yil-dogumTarihi;
        int kalan=60-islem;
        if ((kalan>0) ){
            System.out.println("Emekliliğinize " + kalan + " yil kaldi");
        } else if (kalan<=0) {
            System.out.println("Emeklisiniz, tebrikler!");
        }
    }
}
