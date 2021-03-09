package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        do{
        System.out.print("Коды кофе:\n" +
                "1. Интроспекция\n" +
                "2. Абстракция\n" +
                "3. Инкапсуляция\n" +
                "4. Закрыть программу\n"+
                "Выберите цифру: ");
        Scanner in = new Scanner(System.in);
         num = in.nextInt();

        switch (num){
            case 1:
                CoffeeMachine introspection = new Introspection();
                introspection.brewCoffee();
                break;
            case 2:
                CoffeeMachine  abstraction = new Abstraction();
                abstraction.brewCoffee();
                break;
            case 3:
                CoffeeMachine  encapsulation = new Encapsulation();
                encapsulation.brewCoffee();
                break;
            case 4:
                System.out.println("Завершение программы...");
                return;
            default:
                System.out.println("Невыерно выбран тип кофе! Введите снова!");

        }
    }
        while (num!=4);

    }
}
