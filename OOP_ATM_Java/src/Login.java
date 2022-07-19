import java.util.Scanner;

public class Login {    //  kullanici adi ve parola girildi.

    public  boolean login(Hesap hesap){ // hesap objesi

        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanici Adi : ");
        kullanici_adi = scanner.nextLine();
        System.out.print("Parola : ");
        parola = scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){

            return true;

        }
        else {
            return false;
        }
    }
}