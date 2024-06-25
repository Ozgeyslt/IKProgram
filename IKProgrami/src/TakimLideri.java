import java.util.Scanner;

public class TakimLideri extends Departman{

    private String takımAdi;

    private int takımPersonelSayisi;
    public TakimLideri(String isim, String soyad, int dogumTarihi, String takımAdi, int takımPersonelSayisi) {
        super(isim, soyad, dogumTarihi);
        this.takımAdi=takımAdi;
        this.takımPersonelSayisi=takımPersonelSayisi;
    }

    public TakimLideri(String isim){
        super(isim);
    }
    public void takımLideriDegistir(String yeniLider){
        System.out.println("Degistirmek istediginiz takımı yazınız...");
        Scanner scanner=new Scanner(System.in);
        String isim=null;
        TakimBilgileri bilgiler=new TakimBilgileri();
        TakimLideri lider=new TakimLideri(isim);
        lider=bilgiler.takimlar(isim);
        lider.bilgileriGoster();
        System.out.println("Yeni takım Liderinin ismini yazınız");
        yeniLider=scanner.nextLine();
        System.out.println("Yeni takım Lideri : " + yeniLider);
    }

    public void personelIslemleri(String islem){
        System.out.println("islemler : \n"
                + "1. personel ekle \n"
                + "2. personel çıkar \n"
                + "3. personel degistir \n"
                + "Cikis için q basınız");

        System.out.println("Lutfen bir islem seciniz..");
        Scanner scanner=new Scanner(System.in);
        while (true){
            islem=scanner.nextLine();
            if (islem.equals("1")){
                System.out.println("Eklemek istediginiz personelin adını giriniz...");
                String isim=scanner.nextLine();
                System.out.println("Eklemek istediginiz personelin soyadını giriniz...");
                String soyad=scanner.nextLine();
                System.out.println( isim + " " + soyad +" personel listesine eklenmiştir");
            } else if (islem.equals("2")) {
                System.out.println("Cikarmak istediginiz personelin adını giriniz...");
                String isim=scanner.nextLine();
                System.out.println("Cikarmak istediginiz personelin soyadını giriniz...");
                String soyad=scanner.nextLine();
                System.out.println( isim + " " + soyad +" personel listesinden cikarilmistir");
            } else if (islem.equals("3")) {
                System.out.println("Takımını degistirmek istediginiz personelin adını giriniz...");
                String isim=scanner.nextLine();
                System.out.println("Takımını degistirmek personelin soyadını giriniz...");
                String soyad=scanner.nextLine();
                System.out.println( isim + " " + soyad +" personelin takımı değiştirilmiştir..");
            } else if (islem.equals("q")) {
                System.out.println("Cikis yapılıyor...");
                break;
            }
        }
    }

    public void bilgileriGoster(){
        System.out.println("Isim : " + getIsim());
        System.out.println("Soyad : " + getSoyad());
        System.out.println("Dogum Tarihi: " + getDogumTarihi());
        System.out.println("Takim adi: " + takımAdi);
        System.out.println("Takim personel sayisi : " + takımPersonelSayisi);
    }

    public void gorevEkle(String gorev){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz gorevi yazınız");
        gorev=scanner.nextLine();
        System.out.println(gorev + " görevi eklendi");
    }

    public void gorevTamamlandi(String gorev){

        System.out.println(gorev + " görev tamamlandi");
    }

    public String getTakımAdi() {
        return takımAdi;
    }

    public void setTakımAdi(String takımAdi) {
        this.takımAdi = takımAdi;
    }

    public int getTakımPersonelSayisi() {
        return takımPersonelSayisi;
    }

    public void setTakımPersonelSayisi(int takımPersonelSayisi) {
        this.takımPersonelSayisi = takımPersonelSayisi;
    }
}
