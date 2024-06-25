import java.util.Scanner;

public class TakimBilgileri {

    public static TakimLideri takimlar(String takim) {

        while (true) {
            System.out.println("1. takım Ahmet'in takımı \n"
                    + "2. takım Mehmet'in takımı \n"
                    + "3. takım Ayşe'in takımı \n"
                    + "4. takım Fatma'in takımı \n");
            Scanner scanner = new Scanner(System.in);
            takim = scanner.nextLine();
            if (takim.equals("1")) {
                return new TakimLideri("Ahmet", "Yilmaz", 1990, "Paris", 8);
            } else if (takim.equals("2")) {
                return new TakimLideri("Mehmet", "Yilmaz", 1991, "Lyon", 6);
            } else if (takim.equals("3")) {
                return new TakimLideri("Ayse", "Kaya", 1994, "Marsilya", 7);
            } else if (takim.equals("4")) {
                return new TakimLideri("Fatma", "Kaya", 1995, "Nice", 9);
            } else {
                return null;
            }
        }
    }

}
