package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader implements Configurable {

    public List<lecturadecliente> loadClients() {
        List<lecturadecliente> clients = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(mainpath + "/" + clientes))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    lecturadecliente client = new lecturadecliente(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim());
                    clients.add(client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public List<lecturadeproducto> loadProducts() {
        List<lecturadeproducto> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(mainpath + "/" + productos))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    lecturadeproducto product = new lecturadeproducto(parts[0].trim(), parts[1].trim(), Integer.parseInt(parts[2].trim()), Double.parseDouble(parts[3].trim()), parts[4].trim());
                    products.add(product);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
