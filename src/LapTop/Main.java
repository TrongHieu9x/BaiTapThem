package LapTop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả: ");
            System.out.println("2. Thêm product: ");
            System.out.println("3. Sửa product: ");
            System.out.println("4. Xóa product: ");
            System.out.println("5. Chọn hãng để hiển thị: ");
            System.out.println("6. Tìm giá product: ");
            System.out.println("7. Tìm hãng product: ");
            System.out.println("8. Tìm color product: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    laptopManager.displayAll();
                    break;
                case 2:
                    Laptop laptop1 = laptopManager.createLaptop();
                    laptopManager.addLaptop(laptop1);
                    break;

                case 3:
                    System.out.println("Enter id product muốn sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextInt();
                    laptopManager.updateById(editId);
                    break;
                case 4:
                    System.out.println("Enter id product muốn xóa:  ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    Laptop laptop = laptopManager.deleteById(deleteId);
                    if (laptop == null) {
                        System.out.println("Không có id product tương ứng!!!!!!!!!!!!!!");
                    } else {
                        System.out.println(laptop);
                    }
                    break;
                case 5:
                    System.out.println("Enter firm để display:  ");
                    String displayFirm = scanner.nextLine();
                    scanner.nextLine();
                    laptopManager.displayAllFirm(displayFirm);
                    break;
                case 6:
                    System.out.println("Enter price để search product: ");
                    double searchPrice = scanner.nextDouble();
                    scanner.nextLine();
                    laptopManager.searchByPrice(searchPrice);
                    break;
                case 7:
                    System.out.println("Enter firm để search product: ");
                    String searchFirm = scanner.nextLine();
                    scanner.nextLine();
                    laptopManager.searchByFirm(searchFirm);
                    break;
                case 8:
                    System.out.println("Enter màu để search product: ");
                    String searchColor = scanner.nextLine();
                    scanner.nextLine();
                    laptopManager.searchByColor(searchColor);
                    break;
            }
        } while (choice != 0);
    }
}
