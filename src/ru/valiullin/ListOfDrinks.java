package ru.valiullin;

public enum ListOfDrinks {
    BlackTea("Чай черный",0), GreenTea("Чай зеленый",1), CoffeeType1("Кофе черный",2), CoffeeType2("Американо",3), CoffeeType3("Капучино",4);

    private String name;
    private int button;

    ListOfDrinks(String name, int button) {
        this.name = name;
        this.button = button;
    }

    public String getName() {
        return this.name;
    }

    public int getButton() {
        return this.button;
    }
}

