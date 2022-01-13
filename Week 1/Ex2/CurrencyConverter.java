/*
Develop a program that coverts United States Dollar (USD) to Singapore Dollar (SGD). 
Ask user to enter the amount/quantity of USD that they want to convert to SGD. 
Then the final output should display the amount in SGD. 
The user can enter multiple times. 
To stop the calculator, user should input a negative number.
You can use 1 USD = 1.35 SGD.  
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double amtUSD = 0;
        Scanner amtInput = new Scanner(System.in);
        while(amtUSD >= 0){
            System.out.println("Enter the amount in USD");           
            amtUSD = amtInput.nextDouble();
    
            if(amtUSD >= 0){
                double amtSGD = amtUSD * 1.35;
                System.out.println("The final amount in SGD " + amtSGD);
            }
        }
    }
  }