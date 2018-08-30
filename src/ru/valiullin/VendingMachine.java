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
    ListOfDrinks blackTea = ListOfDrinks.BlackTea;
    ListOfDrinks greenTea = ListOfDrinks.GreenTea;
    ListOfDrinks coffeeType1 = ListOfDrinks.CoffeeType1;
    ListOfDrinks coffeeType2 = ListOfDrinks.CoffeeType2;
    ListOfDrinks coffeeType3 = ListOfDrinks.CoffeeType3;

    //Версия с массивом - рабочая
    /*public void giveMeADrink(int key){
        if (this.money > 0) {
            if (key >= this.drinks.length) {
                System.out.println("Такого напитка нет!");
            } else {
                String drink = getDrink(key);
                System.out.println("Возьмите ваш напиток: " + drink);
            }
        } else {
            System.out.println("Автомат бесплатно не работает!");
        }
    }*/

    //Версия с enum-ом - вопрос как правильно? либо кейсами/ифами или циклом?
    public void giveMeADrink2(int key) {
        if(this.money > 0){
            for (ListOfDrinks drink: ListOfDrinks.values()) {
                //System.out.println(drink.getButton() + " : " + drink.getName());
                if(drink.getButton() != key) {
                    System.out.println("Такого напитка нет!");
                } else {
                    System.out.println("Возьмите ваш напиток: " + drink.getName());
                }
            }
            //Diiich - наверное можно было сделать switch case-ами
            if(blackTea.getButton() == key) {
                System.out.println("Возьмите ваш напиток: " + blackTea.getName());
            } else if (greenTea.getButton() == key) {
                System.out.println("Возьмите ваш напиток: " + greenTea.getName());
            } else if (coffeeType1.getButton() == key) {
                System.out.println("Возьмите ваш напиток: " + coffeeType1.getName());
            } else if (coffeeType2.getButton() == key) {
                System.out.println("Возьмите ваш напиток: " + coffeeType2.getName());
            } else if (coffeeType3.getButton() == key) {
                System.out.println("Возьмите ваш напиток: " + coffeeType3.getName());
            } else {
                System.out.println("Такого напитка нет!");
            }
        }
    }
}
