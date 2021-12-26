package Fruit;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FruitManager {
    private static ArrayList<Fruit> fruits;
    private static final Scanner scanner = new Scanner(System.in);

    public FruitManager() {
        fruits = new ArrayList<>();
    }

    public void displayAll() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public ArrayList<Fruit> displayFruitPriceMax() {

        ArrayList<Fruit> maxPriceFruit = new ArrayList<>();
        double maxPrice = fruits.get(fruits.size()-1).getPrice();

        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == maxPrice) {
                maxPriceFruit.add(fruit);
            }
        }
        return maxPriceFruit;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public Fruit createFruit() {
        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter vị: ");
        String taste = scanner.nextLine();
        System.out.println("Enter màu: ");
        String color = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Fruit(name, weight, taste, color, price);
    }

    public void deleteByName(String name) {
        Fruit fruit = null;
        for (Fruit fruit1 : fruits) {
            if (Objects.equals(fruit1.getName(), name)) {
                fruit = fruit1;
            }
        }
        fruits.remove(fruit);
    }
}
