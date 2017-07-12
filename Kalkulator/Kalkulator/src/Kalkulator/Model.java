package Kalkulator;

public class Model  {
	
	public double Rezultat; 
	public double Operacija(double PrviBroj, double DrugiBroj, String operacija) {
       
		switch (operacija) {
            case "+":
            	Rezultat = PrviBroj + DrugiBroj;
                return Rezultat;
            case "-":
            	Rezultat = PrviBroj - DrugiBroj;
                return Rezultat;
            case "*":
            	Rezultat = PrviBroj * DrugiBroj;
                return Rezultat;
            
                        	
            case ".%":
            	Rezultat = (PrviBroj / DrugiBroj) * 100;
            	return Rezultat;
                       	
            case "/":
                if (DrugiBroj == 0)
                    return 0;
                Rezultat = PrviBroj / DrugiBroj;
                return Rezultat;
        }

        System.out.println("Unknown operator - " + operacija);
        return 0;
    }
	
		
}
