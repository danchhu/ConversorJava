import javax.swing.JOptionPane;

public class Interfaz {
	

	
	public static void main(String[] args) {
				
				int continuar = 0;
			
				String [] cambios = {"Peso  a Dolar", "Peso a Euro", "Peso a Libra esterlina",
						"Peso a Yen japones","Peso a Won surcoreano","Dolar a Peso ",
						"Euro a Peso ","Libra esterlina a Peso ","Yen japones a Peso ",
						"Won surcoreano a Peso "};
				
				double [] precios = {0.0039, 0.0036, 0.0031, 0.56, 5.16, 256.19, 277.82, 323.74, 1.77, 0.19};
		
			
			
				String menu = (JOptionPane.showInputDialog(null,
				"Seleccione el conversor deseado",
				"Menu",
				JOptionPane.PLAIN_MESSAGE,
				null, 
				new Object [] { "Conversor de moneda"}, "Selecciona")) .toString();
				
			
				while (continuar == 0) {
					
					if(menu == "Conversor de moneda") {
					
					double valor = 0;
					
					
					try {
					 valor = Double.parseDouble(JOptionPane.showInputDialog("inserte el valor a convertir"));
						
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Porfavor inserte un numero!");
						break;
					}
					
					
					
				String Divisa =  (JOptionPane.showInputDialog(null, "Seleccione la divisa elegida", "Cambio", JOptionPane.PLAIN_MESSAGE, null, cambios, "Selecciona")) .toString();	
				
				
				
				for (int i = 0; i < cambios.length; i++) {
					if(Divisa == cambios[i]) {
					double conversion = valor * precios[i];
					JOptionPane.showMessageDialog(null, "Usted recibio $" + conversion + " en su cambio de " + Divisa);
					}
					
					
					
				}
			
				
					
				
			
				
	
					
				}

					 continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Nueva operacion", JOptionPane.YES_NO_OPTION);
						
					
				}
				
					
				}
	}

		
	

					
						
				
				
			
				
			
				

	


	

	


