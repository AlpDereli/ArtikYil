import java.util.Scanner;
public class Yil {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Yılı Giriniz: ");
        int yil = take.nextInt();
        if (yil%400==0)
        {
            System.out.println("Artık Yıl");
        }
        else if (yil%4 == 0 && yil%100!=0)
        {
            System.out.println("Artık Yıl");
        }
        else
        {
            System.out.println("Artık Yıl Değil");
        }
    }
}
