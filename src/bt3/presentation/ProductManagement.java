package bt3.presentation;

import bt3.business.design.IProduct;
import bt3.business.designimpl.ProductImpl;
import bt3.config.InputMethods;

public class ProductManagement {
    private IProduct productImpl = new ProductImpl();

    public void displayMenuProduct() {
        while (true) {
            System.out.println("-----------Product Menu ------------");
            System.out.println("1. ●\tThêm sản phẩm");
            System.out.println("2. ●\tSửa thông tin sản phẩm theo id");
            System.out.println("3. ●\tXóa sản phẩm theo id");
            System.out.println("4. ●\tHiển thị danh sách sản phẩm");
            System.out.println("5. ●\tTìm kiếm sản phẩm theo tên");
            System.out.println("6. ●\tSắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.println("Nhâp lưa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    productImpl.addProduct();
                    break;
                case 2:
                    productImpl.editProduct();
                    break;
                case 3:
                    productImpl.deleteProduct();
                    break;
                case 4:
                    productImpl.displayProduct();
                    break;
                case 5:
                    productImpl.searchProduct();
                    break;
                case 6:
                    productImpl.sortProduct();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("số nhập không hợp lệ, mời nhập lại");
                    break;
            }
        }
    }

}
