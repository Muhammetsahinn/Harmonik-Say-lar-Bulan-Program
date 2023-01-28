import java.util.Scanner;

public class main2{
    public static void main(String[] args){

        float a,toplam=0,b;
        Scanner grs = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        a = grs.nextInt();

        for(float i=1; i<=a; i++){
            toplam=toplam+(1/i);
        }
        System.out.println(toplam);

    }

}
