
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

        public class Principal {
            public static void main(String[] args){
                Triangulo trill = new Triangulo();
                
                trill.setBase(Double.parseDouble(JOptionPane.showInputDialog("base triangulo")));
                
                
                trill.setAltura(Double.parseDouble(JOptionPane.showInputDialog("altura triangulo")));
            
                JOptionPane.showMessageDialog(null,"A area do triangulo é"+ trill.getArea());
            }
    
}
