package src;

import java.util.Scanner;
import static src.Fractions.*;

public class Source {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the nominator of your first fraction");
        if(!scan.hasNextInt()){
            System.out.println("The value must be integer");
            throw new Exception();
        }
        int num1 = scan.nextInt();

        System.out.println("Please, enter the denominator of your first fraction");
        if(!scan.hasNextInt()){
            System.out.println("The value must be integer");
            throw new Exception();
        }

        int den1 = scan.nextInt();
        if (den1 == 0) {
            System.out.println("denominator must not be zero");
            throw new Exception();
        }
        Fractions obj1 = new Fractions(num1, den1); // создаем первую дробь (объект)

        System.out.println("Now, enter the nominator of your second fraction");
        if(!scan.hasNextInt()){
            System.out.println("The value must be integer");
            throw new Exception();
        }
        int num2 = scan.nextInt();
        System.out.println("Enter the denominator of your second fraction");
        if(!scan.hasNextInt()){
            System.out.println("The value must be integer");
            throw new Exception();
        }
        int den2 = scan.nextInt();
        if (den2 == 0) {
            System.out.println("denominator must not be zero");
            throw new Exception();
        }
        Fractions obj2 = new Fractions(num2, den2); // создаем второую дробь (объект)
        Fractions obj3 = new Fractions(); // дробь по умолчанию
        // проверка функций
        show(obj1);
        show(obj2);
        addition(obj1, obj2);
        subtraction(obj1, obj2);
        multiple(obj1, obj2);
        division(obj1, obj2);
    }
}
