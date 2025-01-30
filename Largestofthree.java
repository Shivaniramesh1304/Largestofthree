import java.util.Scanner;

    public class Largestofthree {
    
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("enter the first number:");
            int num1=scanner.nextInt();
            System.out.print("enter the second number:");
            int num2=scanner.nextInt();
            System.out.print("enter the thrid number:");
            int num3=scanner.nextInt();
            int largest;
            if(num1>num2){
                if(num1>num3){
                    largest=num1;
                }else{
                    largest=num3;
                }
                }else{
                    if(num2>num3){
                        largest=num2;
                    }else{
                        largest=num3;
                    }
                }
                System.out.println("the largest number is :" + largest);
                scanner.close();
            }
        }
