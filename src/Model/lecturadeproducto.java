package Model;

import libreriaVersion2.generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lecturadeproducto {

    private generic<String, String> name;
    private generic<String, String> description;
    private generic<Integer, Integer> stockQuantity;
    private generic<Double, String> cost;
    private generic<String, String> supplier;

    public lecturadeproducto(String name, String description, int stockQuantity, double cost, String supplier) {
        this.name = new generic<>(name);
        this.description = new generic<>(description);
        this.stockQuantity = new generic<>(stockQuantity);
        this.cost = new generic<>(cost);
        this.supplier = new generic<>(supplier);
    }

    public static List<String> loadProductNames() {
        List<String> productNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configurable.mainpath + "/" + Configurable.productos))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    productNames.add(parts[0].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productNames;
    }

    public static int loadProductStock(String productName) {
        int stock = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(Configurable.mainpath + "/" + Configurable.productos))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[0].trim().equals(productName)) {
                    stock = Integer.parseInt(parts[2].trim());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stock;
    }

    public static double loadProductCost(String productName) {
        double cost = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(Configurable.mainpath + "/" + Configurable.productos))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4 && parts[0].trim().equals(productName)) {
                    cost = Double.parseDouble(parts[3].trim());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cost;
    }
}
