package controller;

import model.ClienteModel;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {

        ClienteModel andrew   = new ClienteModel("123123123", "Andrew", "Campos", "Rua do Gato", "0000001", "9991", "andrew@mail.com");
        ClienteModel bruno    = new ClienteModel("123321123", "Bruno", "Campos", "Rua do Boi", "0000002", "9992", "bruno@mail.com");
        ClienteModel carlos   = new ClienteModel("333333333", "Carlos", "Campos", "Rua do Peixe", "0000003", "9993", "carlos@mail.com");
        ClienteModel diego    = new ClienteModel("444444444", "Diego", "Campos", "Rua do Cavalo", "0000004", "9994", "diego@mail.com");
        ClienteModel euclesio = new ClienteModel("555555555", "Euclesio", "Campos", "Rua do Zoologico", "0000005", "9995", "euclesio@mail.com");

        List<ClienteModel> clientes = new ArrayList<>();
        clientes.add(andrew);
        clientes.add(bruno);
        clientes.add(carlos);
        clientes.add(diego);
        clientes.add(euclesio);

        Optional<ClienteModel> clienteFiltrado = clientes.stream().filter(cliente -> cliente.getTelefone() == "9991").findAny();
        System.out.println(clienteFiltrado);

        Map<String, ClienteModel> clienteMap = new HashMap<>();
        clienteMap.put(andrew.getCpf(), andrew);
        clienteMap.put(bruno.getCpf(), bruno);
        clienteMap.put(carlos.getCpf(), carlos);
        clienteMap.put(diego.getCep(), diego);
        clienteMap.put(euclesio.getCpf(), euclesio);

        System.out.println(clienteMap.get("333333333"));

    }

}
