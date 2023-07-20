import javax.swing.JOptionPane;

public class ConversorMonedas {
    
    public static void main(String[] args) {
        double tipoCambio = 18.6; // Tipo de cambio actual (ejemplo: 1 Euro = 1.18 Dólares)
        double tipoCambioeuro = 18.74;
         double tipoCambiolibra= 21.64;
         double tipoCambioyen=0.12;
         double tipoCambiowon=0.013;

        String inputDolares1 = JOptionPane.showInputDialog("Introduce la cantidad en dólares:");
        double dolares1 = Double.parseDouble(inputDolares1);

        double pesos = convertirEurosADolares(dolares1, tipoCambio);
        JOptionPane.showMessageDialog(null, dolares1 + " dólares equivalen a " + pesos + " pesos.");

        String inputPesos = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double pesos2 = Double.parseDouble(inputPesos);

        double euros2 = convertirDolaresAEuros(pesos2, tipoCambio);
        JOptionPane.showMessageDialog(null, pesos2 + " pesos equivalen a " + euros2 + " dolares");

        String inputEuros = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double euros = Double.parseDouble(inputEuros);

        double pesos3 = convertirPesosAeuros(euros, tipoCambioeuro);
        JOptionPane.showMessageDialog(null, euros + " pesos equivalen a " + pesos3 + " euros");

        
        String inputLibras = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double libras = Double.parseDouble(inputLibras);

        double pesos4 = convertirPesosLibras(libras, tipoCambiolibra);
        JOptionPane.showMessageDialog(null, libras+ " pesos equivalen a " + pesos4 + " libras");

        String inputYen = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double yen = Double.parseDouble(inputYen);

        double pesos5 = convertirPesosYenes(yen, tipoCambioyen);
        JOptionPane.showMessageDialog(null, yen+ " pesos equivalen a " + pesos5+ " yenes");

        String inputWon = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double won = Double.parseDouble(inputWon);

        double pesos6 = convertirPesosWones(won, tipoCambiowon);
        JOptionPane.showMessageDialog(null, won+ " pesos equivalen a " + pesos6+ " wones");

        String inputEurospesos = JOptionPane.showInputDialog("Introduce la cantidad en euros:");
        double europesos = Double.parseDouble(inputEurospesos);

        double pesos7 = convertirEurospesos(europesos, tipoCambioeuro);
        JOptionPane.showMessageDialog(null, europesos+ " euros equivalen a " + pesos7+ " pesos");
    }
    

    public static double convertirEurosADolares(double euros, double tipoCambio) {
        return euros * tipoCambio;
    }

    public static double convertirDolaresAEuros(double dolares, double tipoCambio) {
        return dolares / tipoCambio;
    }

    public static double convertirPesosAeuros(double euros, double tipoCambioeuro) {
        return euros / tipoCambioeuro;
    }

     public static double convertirEurospesos(double europesos, double tipoCambioeuro) {
        return europesos  * tipoCambioeuro;
    }


    
    public static double convertirPesosLibras(double libras, double tipoCambiolibra) {
        return libras / tipoCambiolibra;
    }

    
    public static double convertirPesosYenes(double yen, double tipoCambioyen) {
        return yen / tipoCambioyen;
    }
     
    public static double convertirPesosWones(double won, double tipoCambiowon) {
        return won / tipoCambiowon;
    }

    public static double convertirCentimetrosAmetros(double metros, double tipoCambiometros) {
        return metros / tipoCambiometros;
    }
     public static double convertirMetrosAcentimetros(double metros, double tipoCambiometros) {
        return metros * tipoCambiometros;
    }
}
    

