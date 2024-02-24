import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2, select;
        Scanner scanner=new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        n1=scanner.nextDouble();
        System.out.print("2.Sayıyı Giriniz: ");
        n2=scanner.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select=scanner.nextInt();

        switch ((int) select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1 / n2));
                if (n2 !=0 ) {
                    System.out.println("Bölme: " + (n1 / n2));
                }
                else System.out.println("Bir Sayı Sıfıra Bölünemez.");
                break;
            default:
                System.out.println("Yanlış Tercihte Bulundunuz, Yeniden Deneyiniz.");

        }
    }
}
