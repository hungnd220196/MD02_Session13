package bt3.business.designimpl;

import bt3.business.design.IProduct;
import bt3.business.entity.Product;
import bt3.config.InputMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductImpl implements IProduct {
    private static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() {
        System.out.println("Nhập vào số lượng sản phẩm muốn thêm");
        int count = InputMethods.getInteger();
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin");
            Product product = inputData(true);
            //thêm sản phẩm vào list
            productList.add(product);
        }
        System.out.println("Bạn đã thêm thành công " + count + " sản phẩm");

    }

    // tìm sản phẩm theo id
    public Product findById(Integer id) {
        for (Product e : productList) {
            if (e.getIdProduct() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void editProduct() {
        System.out.println("mời bạn nhập id sản phẩm muốn sửa");
        int idEdit = InputMethods.getInteger();
        Product productEdit = findById(idEdit);
        if (productEdit == null) {
            System.out.println("không tìm thấy sản phẩm có id " + idEdit);
        } else {
            // hiển thị thông tin cũ
            System.out.println("Thông tin sản phẩm chưa sửa " + productEdit);
            // cho người dùng nhập lại
            productEdit = inputData(false);
            productEdit.setIdProduct(idEdit); // set lại id k đổi
            // set nó lại vào danh sách
            productList.set(productList.indexOf(findById(idEdit)), productEdit);
            System.out.println("đã cập nhật thông tin");

        }

    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập id của sẩn phẩm cần xóa");
        int idDel = InputMethods.getInteger();
        Product productDel = findById(idDel);
        if (productDel == null) {
            System.err.println("Khong tim thay");
        } else {
            productList.remove(productDel);
            System.out.println("Xóa thanh công");
        }
    }

    @Override
    public void displayProduct() {
        if (productList.isEmpty()) {
            System.err.println("Danh sach rỗng");
        } else {
            for (Product e : productList) {
                System.out.println(e);
            }
        }

    }

    @Override
    public void sortProduct() {
        productList.sort(Comparator.comparing(Product::getNameProduct));
        System.out.println(productList);

    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm:");
        String search = InputMethods.getString();
        List<Product> searchResults = new ArrayList<>();

        for (Product product : productList) {
            if (product.getNameProduct().toLowerCase().contains(search.toLowerCase())) {
                searchResults.add(product);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm nào phù hợp.");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Product result : searchResults) {
                System.out.println(result);
            }
        }

    }

    public Product inputData(boolean isAdd) {
        Product newProduct = new Product();
        if (isAdd) {
            newProduct.setIdProduct(getNewId()); // id tự tăng
            System.out.println("ID: " + newProduct.getIdProduct());
        }
        System.out.println("mời bạn nhập tên sản phẩm");
        newProduct.setNameProduct(InputMethods.getString());
        System.out.println("mời bạn nhập giá sản phẩm");
        newProduct.setPrice(InputMethods.getInteger());
        return newProduct;
    }

    public int getNewId() {
        int idMax = 0;
        for (Product e : productList) {
            if (idMax < e.getIdProduct()) {
                idMax = e.getIdProduct();
            }
        }
        return idMax + 1;
    }
}





