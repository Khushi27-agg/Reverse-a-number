import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        int rev=0;
        int rem=0;
        int length = (int) Math.log10(number) + 1;
        for(int i=0;i<length;i++){
            rem=number%10;
            rev=(rev*10)+rem;
            number=number/10;
        }
        System.out.println("Reverse number is:"+rev);
    }
}