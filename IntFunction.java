import java.util.Scanner;

public class IntFunction {
    public static void  main (String A[]){

        Scanner scanner = null;
        int iNo1 = 0;
        int iNo2 = 0;
        int iResult =0;
        IntFunction arithmetic = null ;

        scanner = new Scanner(System.in);

        System.out.println("Enter first Number :");
        iNo1 = scanner.nextInt();

        System.out.println("Enter second Number : ");
        iNo2 = scanner.nextInt();

        arithmetic = new IntFunction();

        iResult=arithmetic.Arithmetic(iNo1 , iNo2);
        System.out.println("Addition is : "+iResult);

    }

    public int Arithmetic(int iValue1 , int iValue2){

        int iAns = 0;
        iAns = iValue1 + iValue2;
        return iAns;
    }
}
