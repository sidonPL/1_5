import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner pobieranie = new Scanner(System.in);
        int a;
        a = pobieranie.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("Liczba "+  a + " jest parzysta");
        }
        else
        {
            System.out.println("Liczba "+ a + " jest nieparzysta");
        }
    }
}