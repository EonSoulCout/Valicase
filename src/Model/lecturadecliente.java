package Model;

import libreriaVersion2.generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lecturadecliente {

    private generic<String, String> name;
    private generic<String, String> address;
    private generic<String, String> contact;
    private generic<String, String> ruc;

    public lecturadecliente(String name, String address, String contact, String ruc) {
        this.name = new generic<>(name);
        this.address = new generic<>(address);
        this.contact = new generic<>(contact);
        this.ruc = new generic<>(ruc);
    }

    public static List<String> loadClientNames() {
        List<String> clientNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configurable.mainpath + "/" + Configurable.clientes))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    clientNames.add(parts[0].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientNames;
    }
}
