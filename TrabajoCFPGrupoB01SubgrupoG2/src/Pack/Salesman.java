package Pack;

public class Salesman {

    private String idTypeSalesman;
    private int idNumberSalesman;
    private String nameSalesman;
    private String lastNameSalesman;

    public Salesman(String tipoDocumento, int numeroDocumento, String nombresVendedor, String apellidosVendedor) {
        this.idTypeSalesman = tipoDocumento;
        this.idNumberSalesman = numeroDocumento;
        this.nameSalesman = nombresVendedor;
        this.lastNameSalesman = apellidosVendedor;
    }

    public String salesmanToCSV(){
        return this.idTypeSalesman +","+this.idNumberSalesman +","+this.nameSalesman+","+this.lastNameSalesman;
    }

    public String getIdTypeSalesman() {
        return idTypeSalesman;
    }

    public void setIdTypeSalesman(String idTypeSalesman) {
        this.idTypeSalesman = idTypeSalesman;
    }

    public int getIdNumberSalesman() {
        return idNumberSalesman;
    }

    public void setIdNumberSalesman(int idNumberSalesman) {
        this.idNumberSalesman = idNumberSalesman;
    }

    public String getnameSalesman() {
        return nameSalesman;
    }

    public void setnameSalesman(String nameSalesman) {
        this.nameSalesman = nameSalesman;
    }

    public String getLastNameSalesman() {
        return lastNameSalesman;
    }

    public void setLastNameSalesman(String lastNameSalesman) {
        this.lastNameSalesman = lastNameSalesman;
    }
}
