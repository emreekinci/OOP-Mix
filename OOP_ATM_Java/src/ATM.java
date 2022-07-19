import java.util.Scanner;


public class ATM {

    public void calis(Hesap hesap) { // hesap objesi( pointer gibi ) ile tum hesap islemleri burada yapilabilir.
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza Hosgeldiniz....");

        System.out.println("****************************");
        System.out.println("Kullanici Girisi");
        System.out.println("****************************");
        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı...");
                break;

            }
            else {
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0 ){
                System.out.println("Giriş Hakkınız Bitti...");

                return;

            }
        } // while loop end


        System.out.println("*********************************");
        String islemler = "1. Bakiye Goruntule\n"
                + "2. Para Yatirma\n"
                + "3. Para Cekme\n"
                + "Cikis için q'ya basin";
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true) {
            System.out.println("Islemi Seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){

                break;

            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")){

                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            }
            else if (islem.equals("3")) {

                System.out.print("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            }
            else {

                System.out.println("Gecersiz Islem....");
            }

        }//while loop end
    }
}