package bt3.presentation;

import bt3.config.InputMethods;

public class Main {
    private static ProductManagement productManagement = new ProductManagement();

    public static void main(String[] args) {
        while (true) {
            System.out.println("MENU");
            System.out.println("1.Quản lý danh mục");
            System.out.println("2.Quan lý sản phẩm");
            System.out.println("Nhâp lưa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:

                    break;
                case 2:
                    productManagement.displayMenuProduct();
                    break;
                default:
                    System.err.println("Nhập sai");
            }

        }
    }
}
