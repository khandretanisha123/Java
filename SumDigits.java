import java.util.Scanner;

public  class SumDigits {

    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iRet = 0;
        Dig dig = new Dig();
        
        System.out.println("Enter number : ");
        int iValue = scanner.nextInt();

        iRet = dig.SumDigits(iValue);

        System.out.println("Summation of digits : "+iRet);
    }
}
class Dig
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;                 
        }

        return iSum;
    }
}