package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Vista.Gui_Sale;

public class Ventas {
    private String product;
    private double price;
    private int quantity;
    private double discount;
    private String client;

    private static final String PRODUCT_FILE = "src/Data/products.txt";
    private static final String CLIENT_FILE = "src/Data/clients.txt";

    public Ventas(String product, double price, int quantity, double discount, String client) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.client = client;
    }

    // Getters and setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    // Method to load data from a file
    private static List<String> loadDataFromFile(String filePath) {
        List<String> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    // Methods to load products and clients
    public static List<String> loadProducts() {
        return loadDataFromFile(PRODUCT_FILE);
    }

    public static List<String> loadClients() {
        return loadDataFromFile(CLIENT_FILE);
    }

    // Method to save a sale to a file
    public void saveVenta() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Data/ventas.txt", true))) {
            writer.write(product + "," + price + "," + quantity + "," + discount + "," + client);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
