import ru.valiullin.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //объявляем сканер
        Scanner scanner = new Scanner(System.in);
        //"заполняем" автомат напитками;
        String[] someDrinks = new String[] {"Black tea", "Green tea", "Coffee type1", "Coffee type2", "Coffee type3"};
        VendingMachine vm = new VendingMachine(someDrinks);

        //просим ввести данные. Версия с массивом - рабочая
        /*System.out.print("Введите денежные средства: ");
        if(scanner.hasNextDouble()){
            double money = scanner.nextDouble();
            vm.addMoney(money);
        } else {
            System.out.println("Введите денежные средства!!!");
        }
        System.out.print("Введите цифру желаймого напитка: ");
        if(scanner.hasNextInt()){
            int drink = scanner.nextInt();
            vm.giveMeADrink(drink);
        } else {
            System.out.println("Введите цифру напитка!!!");
        }*/
        //------------------------------------------------

        //Версия с enum - рабочая
        System.out.print("Введите денежные средства: ");
        if(scanner.hasNextDouble()){
            double money = scanner.nextDouble();
            vm.addMoney(money);
        } else {
            System.out.println("Введите денежные средства!!!");
        }
        System.out.print("Введите цифру желаймого напитка: ");
        if(scanner.hasNextInt()){
            int drink = scanner.nextInt();
            vm.giveMeADrink2(drink);
        } else {
            System.out.println("Введите цифру напитка!!!");
        }


        //VendingMachineForTea vmft = new VendingMachineForTea();
        //vmft.addMoney(150);
        //vmft.giveMeADrink(3);
        //System.out.println("Hello World!");
    }
}
