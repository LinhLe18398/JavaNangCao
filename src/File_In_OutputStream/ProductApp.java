package File_In_OutputStream;

import java.io.IOException;

public class ProductApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product objProduct1 = new Product();
        objProduct1.setPrice(2000);
        Product objProduct2 = new Product("A002","Iphone 12", 3000);
        Product objProduct3 = new Product("A003","Iphone 13", 4000);
        Product objProduct4 = new Product("A004","Iphone 14", 5000);
        Product objProduct5 = new Product("A0025","Iphone 15", 6000);
        ProductProcess objProductProcess = new ProductProcess();
        String fileName = "object.dat";
        objProductProcess.writeObjectData(objProduct1,fileName);
        objProductProcess.writeObjectData(objProduct2,fileName);
        objProductProcess.writeObjectData(objProduct3,fileName);
        objProductProcess.writeObjectData(objProduct4,fileName);
        objProductProcess.writeObjectData(objProduct5,fileName);
        Product[] products = (Product[]) objProductProcess.readObjectData(fileName);
        for (int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }


    }
}
