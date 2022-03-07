import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int numInput, num1Input;
        Scanner input= new Scanner(System.in);
        int []num;
        num = new int[7];
        int []num1;
        num1 = new int[7];
        for (int i = 0 ; i <= num.length ; i++)
        {
            System.out.println("enter a number between 10 to 20 for maharach1:");
            num[i]= input.nextInt();
            numInput = num[i];
            for (int t = 0 ; t <= num.length ; t++) {
                System.out.println("enter a number between 10 to 20 for maharach2:");
                num1[t] = input.nextInt();
                if (num1[t] == num[i])
                    System.out.println("its the same number in " + num[t]);
            }
        }
    }
}