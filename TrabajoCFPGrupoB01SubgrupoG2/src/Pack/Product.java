package Pack;

public class Product {

    private int idProduct;
    private String nameProduct;
    private Double unitPriceProduct;

    public Product(int idProduct, String nameProduct, Double unitPriceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.unitPriceProduct = unitPriceProduct;
    }

    public String productToCSV(){
        return this.idProduct +","+this.nameProduct +","+this.unitPriceProduct;
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

    public Double getUnitPriceProduct() {
        return unitPriceProduct;
    }

    public void setUnitPriceProduct(Double unitPriceProduct) {
        this.unitPriceProduct = unitPriceProduct;
    }
}
