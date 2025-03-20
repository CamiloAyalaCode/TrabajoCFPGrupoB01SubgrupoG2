package Pack;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class GenerateInfoFiles {

    public static void main(String[] args) {


        //Creation of salesman objects
        Salesman a = new Salesman("CC",161568,"Juan Daniel","Fernandez Luque");
        Salesman b = new Salesman("PEP",5641561,"Juan David","Perez Vasquez");
        Salesman c = new Salesman("CC",1583,"Millos David","Higuita Gaucho");

        //Adding salesman objects to array list
        ArrayList<Salesman> als = new ArrayList<Salesman>();
        als.add(a);
        als.add(b);
        als.add(c);

        //Creating Salesmen information file
        File fs = new File("./SalesmenInfo.csv");
        try (FileWriter fw = new FileWriter(fs)){
            for (Salesman salesman : als) {
                fw.write(salesman.salesmanToCSV() + "\n");
            }
        } catch (Exception e){
            System.out.println("Se ha producido un error");
        }

        //Creation of product objects
        Product g = new Product(1,"Celular",524.36);
        Product h = new Product(2,"Ipad",725.32);
        Product i = new Product(3,"PC",954.30);

        //Adding product objects to array list
        ArrayList<Product> alp = new ArrayList<Product>();
        alp.add(g);
        alp.add(h);
        alp.add(i);

        //Adding product information file
        File fp = new File("./ProductInfo.csv");
        try (FileWriter fw = new FileWriter(fp)){
            for (Product product : alp) {
                fw.write(product.productToCSV() + "\n");
            }
        } catch (Exception e){
            System.out.println("Se ha producido un error");
        }

        //Creation of sales objects
        Sales p = new Sales(1,6);
        Sales q = new Sales(2,7);
        Sales r = new Sales(3,8);
        Sales s = new Sales(1,5);
        Sales t = new Sales(1,5);

        //Adding product objects to array list
        ArrayList<Sales> alsa = new ArrayList<Sales>();
        alsa.add(p);
        alsa.add(q);
        alsa.add(r);
        alsa.add(s);
        alsa.add(t);

        //Adding sales information files

        //Salesman a
        File fsa = new File("./1SalesInfo"+a.getIdNumberSalesman()+".csv");
        try (FileWriter fw = new FileWriter(fsa)){
            fw.write(a.getIdTypeSalesman()+","+a.getIdNumberSalesman()+"\n");
            fw.write(p.getIdProduct()+","+p.getSaledProduct()+"\n");

        } catch (Exception e){
            System.out.println("Se ha producido un error");
        }

        //Salesman b
        File fsb = new File("./2SalesInfo"+b.getIdNumberSalesman()+".csv");
        try (FileWriter fw = new FileWriter(fsb)){
            fw.write(b.getIdTypeSalesman()+","+b.getIdNumberSalesman()+"\n");
            fw.write(q.getIdProduct()+","+q.getSaledProduct()+"\n");
            fw.write(r.getIdProduct()+","+r.getSaledProduct()+"\n");

        } catch (Exception e){
            System.out.println("Se ha producido un error");
        }

        //Salesman c
        File fsc = new File("./3SalesInfo3"+c.getIdNumberSalesman()+".csv");
        try (FileWriter fw = new FileWriter(fsc)){
            fw.write(c.getIdTypeSalesman()+","+c.getIdNumberSalesman()+"\n");
            fw.write(s.getIdProduct()+","+s.getSaledProduct()+"\n");
            fw.write(t.getIdProduct()+","+t.getSaledProduct()+"\n");

        } catch (Exception e){
            System.out.println("Se ha producido un error");
        }
        //Message that states that the code run
        System.out.println("Se han generado los archivos");
    }
}
