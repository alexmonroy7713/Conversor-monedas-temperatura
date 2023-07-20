import javax.swing.JOptionPane;



public class Unidades  extends ConversorMonedas{
    
    public static void main(String[] args) {
        double tipoCambiometros = 100; // Tipo de cambio actual (ejemplo: 1 Euro = 1.18 Dólares)
       
        

        String inputMetros = JOptionPane.showInputDialog("Introduce la cantidad metros:");
        double metros = Double.parseDouble(inputMetros);

        double centimetros = convertirMetrosAcentimetros(metros, tipoCambiometros);
        JOptionPane.showMessageDialog(null, metros + " metros equivalen a " + centimetros + " centimetros");

        String inputCentimetros = JOptionPane.showInputDialog("Introduce la cantidad centimetros:");
        double centimetross = Double.parseDouble(inputCentimetros);

        double metross = convertirCentimetrosAmetros(centimetros, tipoCambiometros);
        JOptionPane.showMessageDialog(null, centimetross + " centrimetros equivalen a " + metross + " metros");
    }

       
        
  
    


 

   
}