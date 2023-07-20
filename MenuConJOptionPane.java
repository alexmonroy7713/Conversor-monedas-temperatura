import javax.swing.JOptionPane;

public class MenuConJOptionPane  extends ConversorMonedas{

    public static void main(String[] args) {
        
        mostrarMenu();
    }

    public static void mostrarMenu() {
        
        
        String[] opciones = { "Conversor de monedas", "Conversor de unidades metricas", "Salir" };
        String op=(String) JOptionPane.showInputDialog(null,"Selecciones una opcion de coversion","menu",JOptionPane.DEFAULT_OPTION,null, opciones,opciones[0]);
        switch (op) {
            
            case "Conversor de monedas":
            double tipoCambio=18.6;
            double tipoCambioeuro = 18.74;
            double tipoCambiolibra= 21.64;
            double tipoCambioyen=0.12;
            double tipoCambiowon=0.013;
            
            do {
                String[] opcionesmoneda = { "De pesos a dolar", "De pesos a euro", "De pesos a libras","De pesos a yen","De pesos a won coreano","De dolar a pesos","De euro a pesos" };
        String opc=(String) JOptionPane.showInputDialog(null,"Selecciones una opcion de coversion","menu",JOptionPane.DEFAULT_OPTION,null, opcionesmoneda,opcionesmoneda[0]);
        switch (opc) {
            case "De pesos a dolar":
               
                String inputDolares = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double dolares2 = Double.parseDouble(inputDolares);

                
                double euros2 = convertirDolaresAEuros(dolares2, tipoCambio);
        JOptionPane.showMessageDialog(null, dolares2 + " pesos equivalen a " + euros2 + " dolares.");
                 
      
                break;
            case "De pesos a euro":
                
                String inputEuros = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double euros = Double.parseDouble(inputEuros);

        double pesos3 = convertirPesosAeuros(euros, tipoCambioeuro);
        JOptionPane.showMessageDialog(null, euros + " pesos equivalen a " + pesos3 + " euros");
                break;
            
            case  "De pesos a libras":
                
             
                 String inputLibras = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
        double libras = Double.parseDouble(inputLibras);

        double pesos4 = convertirPesosLibras(libras, tipoCambiolibra);
        JOptionPane.showMessageDialog(null, libras+ " pesos equivalen a " + pesos4 + " libras");
                break;
                 
            case "De pesos a yen":
            
            String inputYen = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
            double yen = Double.parseDouble(inputYen);
    
            double pesos5 = convertirPesosYenes(yen, tipoCambioyen);
            JOptionPane.showMessageDialog(null, yen+ " pesos equivalen a " + pesos5+ " yenes");
                break;
                case "De pesos a won coreano":
                String inputWon = JOptionPane.showInputDialog("Introduce la cantidad en pesos:");
                double won = Double.parseDouble(inputWon);
        
                double pesos6 = convertirPesosWones(won, tipoCambiowon);
                JOptionPane.showMessageDialog(null, won+ " pesos equivalen a " + pesos6+ " yenes");
                break;
                case "De dolar a pesos":
                String inputDolares1 = JOptionPane.showInputDialog("Introduce la cantidad en dólares:");
                double dolares1 = Double.parseDouble(inputDolares1);
        
                double pesos = convertirEurosADolares(dolares1, tipoCambio);
                JOptionPane.showMessageDialog(null, dolares1 + " dólares equivalen a " + pesos + " pesos.");
                break;
                 case "De euro a pesos":
                 String inputEurospesos = JOptionPane.showInputDialog("Introduce la cantidad en euros:");
                 double europesos = Double.parseDouble(inputEurospesos);
         
                 double pesos7 = convertirEurospesos(europesos, tipoCambioeuro);
                 JOptionPane.showMessageDialog(null, europesos+ " euros equivalen a " + pesos7+ " pesos");
                break;
           
        }
    
    }  while (preguntarContinuar());
      
               
            case "Conversor de Unidades metricas":
            double tipoCambiometros = 100;
         String[] opcionesunidades = { "De metros a centimetros", "De centimetros a metros" };
        String opco=(String) JOptionPane.showInputDialog(null,"Selecciones una opcion de coversion","menu",JOptionPane.DEFAULT_OPTION,null,  opcionesunidades, opcionesunidades[0]);
        switch (opco) {
            case "De metros a centimetros":
               
         
        String inputMetros = JOptionPane.showInputDialog("Introduce la cantidad metros:");
        double metros = Double.parseDouble(inputMetros);

        double centimetros = convertirMetrosAcentimetros(metros, tipoCambiometros);
        JOptionPane.showMessageDialog(null, metros + " metros equivalen a " + centimetros + " centimetros");
           

                 
      
             
            case "De centimetros a metros":

            String inputCentimetros = JOptionPane.showInputDialog("Introduce la cantidad centimetros:");
        double centimetross = Double.parseDouble(inputCentimetros);

        double metross = convertirCentimetrosAmetros(centimetross, tipoCambiometros);
        JOptionPane.showMessageDialog(null, centimetross + " centrimetros equivalen a " + metross + " metros");

           break;
                
           
            case "Salir":
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    }
    

    }

    

    public static boolean preguntarContinuar() {
        String[] opciones = { "Sí", "No" };
        int op = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
      if (op==0) {
       

        
      } else {
        JOptionPane.showMessageDialog(null, "Progrma terminado");
         System.exit(0);
        
      }
      return op==0;

        
      
    }
    
}









       