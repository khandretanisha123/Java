import  java.util.Scanner;

class CountDigit{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iRet = 0;
        Digit digit = new Digit();
        
        System.out.println("Enter number : ");
        int iValue = scanner.nextInt();

        iRet = digit.CountDigits(iValue);

        System.out.println("Number of digits : "+iRet);
    } 
    
}
class Digit
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;                 
            iCount++;
        }

        return iCount;
    }
}