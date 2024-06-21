import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Puxando os valores e atribuindo a Moeda;

        String endereco = "https://v6.exchangerate-api.com/v6/b0e650a830f170179f0aea37/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String resposta = response.body();

        Gson gson = new Gson();
        Moeda moedas = gson.fromJson(resposta, Moeda.class);

        //Declarando as variáveis a serem utilizadas;
        Scanner leitura = new Scanner(System.in);
       int escolha = 0;
       double valor;

        while (escolha != 7) {
        System.out.println("****** Seja bem-vindo/a ao Conversor de Moeda =] ******");
        System.out.println("Selecione a opção de conversão desejada:");
        System.out.println("1) Dólar ==> Peso Argentino");
        System.out.println("2) Peso Argentino ==> Dólar");
        System.out.println("3) Dólar ==> Real Brasileiro");
        System.out.println("4) Real Brasileiro ==> Dólar");
        System.out.println("5) Dólar ==> Peso Colombiano");
        System.out.println("6) Peso Colombiano==> Dólar");
        System.out.println("7) SAIR");
        escolha = leitura.nextInt();

        if (escolha == 7)
        {
            System.out.println("Programa finalizado com sucesso.");
            break;
        }

        System.out.println("Qual valor você deseja converter?");
        double valorConversao = leitura.nextInt();

        double taxaDeConversao = 0;
        double resultado = 0;

        switch (escolha) {
            case 1:
                taxaDeConversao = moedas.getConversionRates().getArs();
                resultado = ( valorConversao * taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;

            case 2:
                taxaDeConversao = moedas.getConversionRates().getArs();
                resultado = ( valorConversao / taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;

            case 3:
                taxaDeConversao = moedas.getConversionRates().getBrl();
                resultado = ( valorConversao * taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;

            case 4:
                taxaDeConversao = moedas.getConversionRates().getBrl();
                resultado = ( valorConversao / taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;

            case 5:
                taxaDeConversao = moedas.getConversionRates().getCop();
                resultado = ( valorConversao * taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;

            case 6:
                taxaDeConversao = moedas.getConversionRates().getCop();
                resultado = ( valorConversao / taxaDeConversao);
                System.out.println("O valor convertido é:" + resultado);
                break;
        }

        }
    }
}
