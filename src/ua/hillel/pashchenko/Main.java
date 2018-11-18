package ua.hillel.pashchenko;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте массив размером n, элементами которого будут числа от n до 1
        Scanner scanner = new Scanner(System.in);//добавил ввод числа пользователем;
        int n;
        System.out.println("Введите значение n в консоль:");
        n = scanner.nextInt();

        int[] array = new int[n];
        int k=n;
        //заполним массив числами;
        for (int i=0; i<n; i++) {
            array[i]=k;
            k=k-1;
        }
        System.out.println("наш массив: "+ Arrays.toString(array));//вывод массива;
    }
}