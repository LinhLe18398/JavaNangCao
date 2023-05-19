package File_In_OutputStream;

import java.io.*;

public class ProductProcess  {
    protected Product[] products;
    protected int count;
    public ProductProcess(){
        this.products = new Product[5];
        this.count = 0;
    }

    public boolean writeObjectData(Product objProduct, String fileName) {
        try {
            this.products[this.count++] = objProduct;
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream oos = new ObjectOutputStream(bufferedOutputStream);
            oos.writeObject(this.products);
            oos.close();
            bufferedOutputStream.close();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            System.out.println("ghi khong thanh cong");
            return false;
        }
    }

    public Product[] readObjectData(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Product[] products = (Product[]) ois.readObject();
        ois.close();
        bis.close();
        fis.close();
        return products;

    }
}
