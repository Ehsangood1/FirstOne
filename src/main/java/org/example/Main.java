package org.example;
import java.util.Scanner;
public class Main {


    int _firstNum;
    int _secondNum;
    int operation;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Main program = new Main();
        program.receiveInfo();

    }

    public void receiveInfo() {
        System.out.println("your first number:");
        this._firstNum = Integer.parseInt(input.nextLine());
        System.out.println("your second number:");
        this._secondNum = Integer.parseInt(input.nextLine());
        System.out.println("choose the operation \n 1. Division \n 2. Multiplication \n 3. Addtion \n 4. Subtraction");
        this.operation = Integer.parseInt(input.nextLine());
        operatorFinder(_firstNum, _secondNum, operation);
    }
    public void operatorFinder(int FNum, int SNum, int oPeration) {
        switch (oPeration) {
            case 1:
                System.out.println(FNum/SNum);
                break;
            case 2:
                System.out.println(FNum*SNum);
                break;
            case 3:
                System.out.println(FNum+SNum);
                break;
            case 4:
                System.out.println(FNum-SNum);
                break;
            default:
                System.out.println("you choosed a wrong number");

        }

    }



}