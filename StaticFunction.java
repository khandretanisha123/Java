import java.util.Scanner;

public class StaticFunction {
    public static void main(String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        iResult = Addition(iValue1, iValue2);   ///Function Call////

        System.out.println("Addition is : "+iResult);
    }

    
    ///////////////////////////////////////////
    /// 
    ///     Here function is static so we don't 
    ///     have to create object we can directly call the 
    ///     function using their name 
    /// 
    //////////////////////////////////////////////
    public static int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

}
