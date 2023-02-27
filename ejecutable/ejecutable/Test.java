package ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int[] calorias;
        String[] dia={"lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; 
        calorias=new int[7];

        for(int i=0;i<calorias.length;i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las calorias quemadas el "+dia[i]));
        }
        JOptionPane.showMessageDialog(null, "El "+dia[0]+" quemó "+calorias[0]+".");
    }    
}
