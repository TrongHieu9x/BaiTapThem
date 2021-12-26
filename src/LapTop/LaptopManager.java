package LapTop;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LaptopManager {
    private static ArrayList<Laptop> laptops;
    private static final Scanner scanner = new Scanner(System.in);

    public LaptopManager() {
        laptops = new ArrayList<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Laptop createLaptop() {
        scanner.nextLine();
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter firm:  ");
        String name = scanner.nextLine();
        System.out.println("Enter color:  ");
        String color = scanner.nextLine();
        System.out.println("Enter price:  ");
        double price = scanner.nextDouble();
        System.out.println("Enter amount:  ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Laptop(id, name, color, price, amount);
    }

    public void updateById(int id) {
        Laptop laptopUpdate = null;
        for (Laptop laptop : laptops) {
            if (Laptop.getId() == id) {
                laptopUpdate = laptop;
            }
        }
        if (laptopUpdate != null) {
            System.out.println("Enter new firm:  ");
            laptopUpdate.setName(scanner.nextLine());
            System.out.println("Enter new color: ");
            laptopUpdate.setColor(scanner.nextLine());
            System.out.println("Enter new price: ");
            laptopUpdate.setPrice(scanner.nextDouble());
            System.out.println("Enter new amount: ");
            laptopUpdate.setAmount(scanner.nextInt());

            scanner.nextLine();
        }
    }

    public Laptop deleteById(int id) {
        Laptop laptop = null;
        for (Laptop laptop1 : laptops) {
            if (Laptop.getId() == id) {
                laptop = laptop1;
            }
        }
        laptops.remove(laptop);
        return laptop;
    }

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public void displayAllFirm(String firm) {
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.getFirm(), firm)) {
                return;
            }
        }
    }

    public void searchByFirm(String firm) {
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.getFirm(), firm)) {
                return;
            }
        }
    }

    public void searchByColor(String color) {
        for (Laptop laptop : laptops) {
            if (Objects.equals(laptop.getColor(), color)) {
                return;
            }
        }
    }

    public void searchByPrice(double price) {
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() == price) {
                return;
            }
        }
    }
}
