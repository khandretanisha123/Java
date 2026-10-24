import java.util.Scanner;


class DigitInNumber
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        Digit digit = new Digit();
        
        System.out.println("Enter number : ");
        int iValue = scanner.nextInt();

        digit.DisplayDigits(iValue);
    }
}


class Digit
{
    public void DisplayDigits(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;                 
            System.out.println(iDigit); 
        }
    }
}


