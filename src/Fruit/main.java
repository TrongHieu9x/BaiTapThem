package Fruit;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả: ");
            System.out.println("2. Hiển thị tất cả theo loại: ");
            System.out.println("3. Hiển thị quả có giá cao nhất: ");
            System.out.println("4. 1000000 mua được nhiều qảu nào nhất: ");
            System.out.println("5. Thêm quả theo tên: ");
            System.out.println("6. Xóa quả theo tên: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    fruitManager.displayAll();
                    break;
                case 2:

                case 3:
                    System.out.println(fruitManager.displayFruitPriceMax());
                    break;
                case 4:

                case 5:
                    Fruit fruit1 = fruitManager.createFruit();
                    fruitManager.addFruit(fruit1);
                    break;
                case 6:
                    System.out.println("Enter name quả muốn xóa: ");
                    String deleteFruit = scan.nextLine();
                    scan.nextLine();
                    fruitManager.deleteByName(deleteFruit);
                    break;
            }
        } while (choice != 0);
    }
}
