package ru.valiullin;

public class VendingMachine {
    private double money = 0;
    private String[] drinks;
    //todo Переписать проект с урока (вендинговый автомат) используя конструктор, перечисления и взаимодействие с пользователем.
    //Конструктор по умолчанию и конструктор автомата напитков

    public VendingMachine() {
    }

    public VendingMachine(String[] drinks) {
        this.drinks = drinks;
    }

    public void addMoney(double money) {
        this.money = money;
    }

    private String getDrink(int key){
        return this.drinks[key];
    }

    public void giveMeADrink(int key){
        if (this.money > 0) {
            if (key > this.drinks.length-1) {
                System.out.println("Такого напитка нет!");
            } else {
                String drink = getDrink(key);
                System.out.println("Возьмите ваш напиток: " + drink);
            }
        } else {
            System.out.println("Автомат бесплатно не работает!");
        }
    }
}
