import java.util.Scanner;

public class ArmstrongSayisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakSayisi = String.valueOf(sayi).length();
        int geciciSayi = sayi;
        int toplam = 0;

        while (geciciSayi != 0) {
            int basamakDegeri = geciciSayi % 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            geciciSayi /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }
}
