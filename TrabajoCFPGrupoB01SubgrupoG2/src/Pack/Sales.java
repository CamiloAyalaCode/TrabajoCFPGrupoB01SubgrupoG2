package Pack;

public class Sales {

    private int idProduct;
    private int saledProduct;

    public Sales(int idProduct, int saledProduct) {
        this.idProduct = idProduct;
        this.saledProduct = saledProduct;
    }

    public String salesToCSV() {
        return this.idProduct + "," + this.saledProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getSaledProduct() {
        return saledProduct;
    }

    public void setSaledProduct(int saledProduct) {
        this.saledProduct = saledProduct;
    }
}
