/**
 * @author Solomennikova N.
 * @version 1.0
 */
package org.example;

import java.util.Scanner; //импортируем класс Scanner
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 или 2 (1 - calculator, 2 - string array): ");

        int choice = scan.nextInt();
        if (choice ==1){
            System.out.println("Запускается выполнение калькулятора");
            System.out.print("Введите первое число: ");
            float num1 = scan.nextFloat();
            System.out.print("Введите второе число: ");
            float num2 = scan.nextFloat();

            System.out.print("Введите действие : ");
            String simb = scan.nextLine();
            simb = scan.nextLine();

            float res;
            DecimalFormat format = new DecimalFormat("#0.0000"); //указываем формат числа для вывода результата вычислений


            switch (simb) {
                //прописываем цикл для вычислений, в зависимости от вводимого арифметического знака: "+", "-", "*", "/"
                case "+":
                    res = num1 + num2;
                    System.out.println("Сумма чисел = " + format.format(res));
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("Разность чисел =" + format.format(res));
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("Произведение чисел = " + format.format(res));
                    break;
                case "/":
                    if (num2 == 0) System.out.println("на ноль делить нельзя");
                    else {
                        res = num1 / num2;
                        System.out.println("Частное чисел = " + format.format(res));
                        break;
                    }
            }
        } else if (choice ==2){
            System.out.println("Запускается поиск максимального слова в массиве");
            int a = 0;
            String strmax = "";

            System.out.print("Введите длину массива: ");
            int size = scan.nextInt();
            scan.nextLine();
            //  System.out.println(size);  -проверка промежуточная на длину массива

            String[] myWords = new String[size];
            System.out.print("Введите слова в массив: ");
            for (int i = 0; i < myWords.length; i++) {
                myWords[i] = scan.nextLine(); // Заполняем массив элементами
            }
            for (int i = 0; i < myWords.length; i++) {
                if (myWords[i].length() > a) {
                    a = myWords[i].length();
                    strmax = myWords[i];
                }
            }
            System.out.println("Самое длинное слово в массиве: " + strmax);

        } else {
            System.out.println("Введено неверное число");
        };
          scan.close();
    }
}
