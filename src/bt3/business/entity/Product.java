package bt3.business.entity;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double Price;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        Price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Price=" + Price +
                '}';
    }
}
