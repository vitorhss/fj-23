import java.text.NumberFormat;
import java.util.Locale;

public class TestaRelatorio {
	public static void main(String[] args) {
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		Divida divida = new Divida();
		divida.setCnpjCredor(new Cnpj("00.0000.0001-01"));
		divida.setCredor("Empresa Brasileira de Correios e Telégrafos");
		divida.setTotal(5000.00);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		relatorioDeDivida.geraRelatorio(formatador);
	}

}
