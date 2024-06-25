import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("IK Programına hoşgeldiniz");
        Scanner scanner=new Scanner(System.in);

        String islem=null;
        int sayi=0;
        TakimLideri takımLideri=new TakimLideri(islem);
        while (true){
            System.out.println("Lütfen yapmak istediginiz islemi seciniz \n"
                    + "1. Takım bilgilerini göster \n"
                    + "2. Takım lideri degistir \n"
                    + "3. Personel islemleri \n"
                    + "4. Görev ekle \n"
                    + "5. Görev tamamla \n"
                    + "6. Kadın personel emeklilik yasi hesapla \n"
                    + "7. Erkek personel emeklilik yasi hesapla \n"
                    + "Cikis yapmak icin q basınız..." );
            islem=scanner.nextLine();
            if (islem.equals("1")){
                takımLideri=TakimBilgileri.takimlar(islem);
                takımLideri.bilgileriGoster();
                scanner.nextLine();

            } else if (islem.equals("2")) {
                takımLideri.takımLideriDegistir(islem);
                scanner.nextLine();

            } else if (islem.equals("3")) {
                takımLideri.personelIslemleri(islem);
                scanner.nextLine();

            } else if (islem.equals("4")) {
                takımLideri.gorevEkle(islem);
                scanner.nextLine();

            } else if (islem.equals("5")) {
                System.out.println("Tamamlamak istediginiz görevi yaziniz");
                islem=scanner.nextLine();
                takımLideri.gorevTamamlandi(islem);
                scanner.nextLine();

            } else if (islem.equals("6")) {
                int yil=0;
                String isim=null;
                KadınPersonelListesi liste=new KadınPersonelListesi();
                liste.emeklilikYasHesaplama(yil);
                scanner.nextLine();

            } else if (islem.equals("7")) {
                int yil=0;
                String isim=null;
                ErkekPersonelListesi liste=new ErkekPersonelListesi(isim, isim, yil, isim);
                liste.emeklilikYasHesaplama(yil);
                scanner.nextLine();
            } else if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else {
                System.out.println("Gecersiz islem...");
            }
        }
    }
    }