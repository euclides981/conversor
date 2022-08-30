package interfacegrafica;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;

public class ConversorController implements Initializable{
	
	@FXML
	private TextField txtValorMoeda;
	@FXML
	private Button btnCalcular;
	@FXML
	private Button btnLimpar;
	@FXML
	private Label lblRes;
	@FXML
	private Label lblResultado;
	@FXML
	private ComboBox <String> cboMoeda;
	@FXML
	private Hyperlink hyperlink;
	
	@FXML
	void openLink() throws URISyntaxException, IOException {
		Desktop.getDesktop().browse(new URI("https://github.com/euclides981"));
	}
	
	public void onBtnCalcularClick() {
		
		double ValorMoeda;
		String formataMoeda;
		
		double dolar = 5.12;
		double euro = 5.08;
		double libra = 6.01;
		double pesoArg = 0.037;
		double pesoChi = 0.0058;
		
		
		ValorMoeda = Double.parseDouble(txtValorMoeda.getText());
		
		
		if(cboMoeda.getValue().equals("Reais para Dolar")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda / dolar);
			
			lblRes.setText("R$" + ValorMoeda + " Reais equivale a:");
		
			lblResultado.setText("$" + formataMoeda + " Dolares");
		}
		
		if(cboMoeda.getValue().equals("Dolar para Reais")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda * dolar);
			
			lblRes.setText("$" + ValorMoeda + " Dolares equivale a:");
		
			lblResultado.setText("R$" + formataMoeda + " Reais");
		}
		
		if(cboMoeda.getValue().equals("Reais para Euro")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda / euro);
			
			lblRes.setText("R$" + ValorMoeda + " Reais equivale a:");
		
			lblResultado.setText("€" + formataMoeda + " Euros");
		}
		
		if(cboMoeda.getValue().equals("Euro para Reais")) {
					
			formataMoeda = String.format("%.2f", ValorMoeda * euro);
			
			lblRes.setText("€" + ValorMoeda + " Euros equivale a:");
		
			lblResultado.setText("R$" + formataMoeda + " Reais");
		}
		
		if(cboMoeda.getValue().equals("Reais para Libras")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda / libra);
			
			lblRes.setText("R$" + ValorMoeda + " Reais equivale a:");
		
			lblResultado.setText("£" + formataMoeda + " Libras Esterlinas");
		}
		
		if(cboMoeda.getValue().equals("Libras para Reais")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda * libra);
			
			lblRes.setText("£" + ValorMoeda + " Libras Esterlinas equivale a:");
		
			lblResultado.setText("R$" + formataMoeda + " Reais");
		}
		
		if(cboMoeda.getValue().equals("Reais para Pesos Argentinos")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda / pesoArg);
			
			lblRes.setText("R$" + ValorMoeda + " Reais equivale a:");
		
			lblResultado.setText("$" + formataMoeda + " Pesos Argentinos");
		}
	
		if(cboMoeda.getValue().equals("Pesos Argentinos para Reais")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda * pesoArg);
			
			lblRes.setText("$" + ValorMoeda + " Pesos Argentinos equivale a:");
		
			lblResultado.setText("R$" + formataMoeda + " Reais");
		}
		
		if(cboMoeda.getValue().equals("Reais para Pesos Chilenos")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda / pesoChi);
			
			lblRes.setText("R$" + ValorMoeda + " Reais equivale a:");
		
			lblResultado.setText("$" + formataMoeda + " Pesos Chilenos");
		}
	
		if(cboMoeda.getValue().equals("Pesos Chilenos para Reais")) {
			
			formataMoeda = String.format("%.2f", ValorMoeda * pesoChi);
			
			lblRes.setText("$" + ValorMoeda + " Pesos Chilenos equivale a:");
		
			lblResultado.setText("R$" + formataMoeda + " Reais");
		}
	}
	
	public void onBtnLimparClick() {
		txtValorMoeda.setText("");
		lblResultado.setText("");
		lblRes.setText("");
		cboMoeda.valueProperty().set(null);
		btnLimpar.setDisable(true);
		btnCalcular.setDisable(true);
	}
	
	public void onKeyReleased() {
		boolean calcular;
		boolean limpar;
		calcular = (txtValorMoeda.getText().isEmpty());
		btnCalcular.setDisable(calcular);
		
		limpar = (txtValorMoeda.getText().isEmpty());
		btnLimpar.setDisable(limpar);
	}

	
	//Conversor de Temperatura
		@FXML
		private TextField txtValorTemp;
		@FXML
		private Button btnCalcularTemp;
		@FXML
		private Button btnLimparTemp;
		@FXML
		private Label lblResultadoTemp;
		@FXML
		private ComboBox <String> cboTemp;
		
		
		public void onBtnCalcularClickTemp() {
			
			double ValorTemp = Double.parseDouble(txtValorTemp.getText());
			
			String formataTemp;
			
			if(cboTemp.getValue().equals("Celsius para Fahrenheit")) {
				
				formataTemp = String.format("%.2f", ValorTemp * 1.8 + 32);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " grau Fahrenheit");
			}
					
			if(cboTemp.getValue().equals("Celsius para Kelvin")) {
				
				formataTemp = String.format("%.2f", ValorTemp + 315.15);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " Kelvin");
			}
			
			if(cboTemp.getValue().equals("Fahrenheit para Kelvin")) {
				
				formataTemp = String.format("%.2f", (ValorTemp - 32) * 5/9 + 273.15);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " Kelvin");
			}
			
			if(cboTemp.getValue().equals("Fahrenheit para Celsius")) {
				
				formataTemp = String.format("%.2f", (ValorTemp - 32) * 5/9);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " grau Celsius");
			}
			
			
			if(cboTemp.getValue().equals("Kelvin para Fahrenheit")) {
				
				formataTemp = String.format("%.2f", (ValorTemp - 273.15) * 9/5 + 32);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " Fahrenheit");
			}
			
			if(cboTemp.getValue().equals("Kelvin para Celsius")) {
				
				formataTemp = String.format("%.2f", ValorTemp - 273.15);
			
				lblResultadoTemp.setText("O resultado é: " + formataTemp + " Celsius");
			}
			
		}
		
		public void onBtnLimparClickTemp() {
			txtValorTemp.setText("");
			lblResultadoTemp.setText("");
			cboTemp.valueProperty().set(null);
			btnLimparTemp.setDisable(true);
			btnCalcularTemp.setDisable(true);
		}
		
		public void onKeyReleasedTemp() {
			boolean calcular;
			boolean limpar;
			calcular = (txtValorTemp.getText().isEmpty());
			btnCalcularTemp.setDisable(calcular);
			limpar = (txtValorTemp.getText().isEmpty());
			btnLimparTemp.setDisable(limpar);
		}
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			cboMoeda.getItems().addAll("Reais para Dolar", "Dolar para Reais", "Reais para Euro", "Euro para Reais", "Reais para Libras", "Libras para Reais", "Reais para Pesos Argentinos", "Pesos Argentinos para Reais", "Reais para Pesos Chilenos", "Pesos Chilenos para Reais");
			cboTemp.getItems().addAll("Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Kelvin", "Fahrenheit para Celsius", "Kelvin para Fahrenheit", "Kelvin para Celsius");
		}
}
