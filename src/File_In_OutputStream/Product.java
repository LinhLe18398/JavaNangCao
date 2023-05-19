package File_In_OutputStream;

import javax.swing.plaf.PanelUI;
import java.io.Serializable;

public class Product implements Serializable {
    public String proId;
    public String proName;
    public double price;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String proId, String proName, double price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public Product(){
        this.proId = "A0001";
        this.proName = "Iphone";
        this.price = 1000;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
