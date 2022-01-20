import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches:");
        double height = input.nextDouble();
        BMI newBMI = new BMI(weight, height);
        System.out.println("The BMI is " + Math.round(newBMI.BMIcalc() * 100.00) / 100.00);
        newBMI.BMIInterpretation();
    }
}

class BMI{
    private double weight, height;

    public BMI(){
        this.weight = 150;
        this.height = 80;
    }

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double BMIcalc(){
        double bmi = (weight / Math.pow(height, 2)) * 703;
        return bmi;
    }

    public void BMIInterpretation(){
        double bmi = BMIcalc();
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }
        else if(bmi >= 30){
            System.out.println("Obese");
        }
    }
}