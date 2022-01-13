/*
Write a program to find out the Chinese Zodiac sign for a given year. 
The Chinese Zodiac is based on a twelve-year cycle, with each year represented by an animal- 
monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep—in this cycle
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.print("Enter a year: ");

    Scanner yearInput = new Scanner(System.in);
    int year = yearInput.nextInt();
    int zodiacNum = year % 12;
    switch (zodiacNum) {
      case 0:
        System.out.println("monkey");
        break;
      case 1:
        System.out.println("rooster");
        break;
      case 2:
        System.out.println("dog");
        break;
      case 3:
        System.out.println("pig");
        break;
      case 4:
        System.out.println("rat");
        break;
      case 5:
        System.out.println("ox");
        break;
      case 6:
        System.out.println("tiger");
        break;
      case 7:
        System.out.println("rabbit");
        break;
      case 8:
        System.out.println("dragon");
        break;
      case 9:
        System.out.println("snake");
        break;
      case 10:
        System.out.println("horse");
        break;
      case 11:
        System.out.println("sheep");
        break;
    }
  }
}