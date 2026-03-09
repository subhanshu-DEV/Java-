import java.util.Scanner;
class Factroial{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int Factroial = 1;
        for(int i=1;i<num;i++)
        {
            Factroial = Factroial * i;
        }
        System.out.println("Factroial=" + Factroial);
    }
}