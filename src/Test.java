import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Beyblade Programina Hosgeldiniz");
        System.out.println("Cikis icin q'ya basın ");

        Scanner scanner = new Scanner(System.in);

                while (true) {

                    System.out.println("Hangi beyblade üretmek istiyorsunuz ");

                    String islem = scanner.nextLine();

                    if (islem.equals("Q")){

                        System.out.println("Programdan Cikiliyor");
                        break;
                    }
                    else {
                        BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                        Beyblade beyblade = fabrika.beybladeUret(islem);

                        if (beyblade == null) {

                            System.out.println("Lutfen gecerli bir isim girin");
                        }
                        else{
                            beyblade.bilgileriGoster();
                            beyblade.Saldir();
                            beyblade.kutsalCanaverOrtayaCikar();
                        }

                    }
                }



    }
}
