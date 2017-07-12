package Kalkulator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Kontroler {

	@FXML
    protected Text izlaz;
	

    private double Broj = 0;
    private String operacija = "";
    private boolean start = true;

    private Model model = new Model();

    @FXML
    private void Dugmadi(ActionEvent event) {
    	
        if (start) {
            izlaz.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        izlaz.setText(izlaz.getText() + value);
    }

    @FXML
    private void Operacije(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operacija.isEmpty())
                return;

            operacija = value;
            Broj = Double.parseDouble(izlaz.getText());
            izlaz.setText("");
        }
        else {
            if (operacija.isEmpty())
                return;
            izlaz.setText(String.valueOf(model.Operacija(Broj, Double.parseDouble(izlaz.getText()), operacija)));
            
            operacija = "";
            start = true;
        }
    }
        @FXML
        private void C (ActionEvent event) {
           

            izlaz.setText("");
        }
        @FXML
        private void Predznak (ActionEvent event) {
           
        	double predznak = Double.parseDouble(String.valueOf(izlaz.getText()));
			predznak = predznak * (-1);
			izlaz.setText(String.valueOf(predznak));
            
            
        }
        @FXML
        private void Nazad (ActionEvent event) {
        String nazad;
        StringBuilder strN = new StringBuilder(izlaz.getText());
		strN.deleteCharAt(izlaz.getText().length() - 1);
		nazad = strN.toString();
		izlaz.setText(nazad);
        }
        @FXML
        private void Tacka (ActionEvent event) {
        	start=true;
        String value = ((Button)event.getSource()).getText();
        izlaz.setText(izlaz.getText() + value);
        
    }
        
        
        
}
