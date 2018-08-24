package arreglosmatrices;

import javax.swing.JOptionPane;

public class ArreglosMatrices {

    public static void main(String[] args) {
        //Arreglos
        /*String pais[] = new String[3];
        pais[0] = "Colombia";
        pais[1] = "Brasil";
        pais[2] = "Argentina";        
        JOptionPane.showMessageDialog(null, pais[2]);

        String paises[] = {"colombia", "Brasil", "Argentina"};        
        JOptionPane.showMessageDialog(null, paises[1]);
        
        for(int n = 0; n < paises.length; n++){
            JOptionPane.showMessageDialog(null, paises[n]);
	}*/
        
        //Matrices
        String paisCapital[][] = new String[2][3];
        paisCapital[0][0] = "Colombia";
        paisCapital[0][1] = "Brasil";
        paisCapital[0][2] = "Argentina";
        
        paisCapital[1][0] = "Bogota";
        paisCapital[1][1] = "Brasilia";
        paisCapital[1][2] = "Buenos Aires";

        /*JOptionPane.showMessageDialog(null, "Mi pais es: " + paisCapital[0][0] + "\n" 
                + "y mi capital es: " + paisCapital[1][0]);*/
        
        String paisCapital2[][] = {
            {"Colombia","Brasil","Argentina"},
            {"Bogota","Brasilia","Buenos Aires"}
        };
        
        for(int i = 0; i < paisCapital.length; i++){
            for(int x= 0; x < paisCapital[i].length; x++){
                JOptionPane.showMessageDialog(null, "Mi pais es: " + paisCapital[0][x] + "\n" 
                + "y mi capital es: " + paisCapital[1][x]);
            }            
        }
  

    }
    
}
