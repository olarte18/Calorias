package ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int[] calorias;
        int dia=0,diaMenos=0,mayor,menor;
        double suma=0;
        //String[ ] dias;
        //dias = new String[7];

        String[ ] dias = {"lunes", "martes", "miercoles","jueves","viernes","sabado","domingo"};
        

        
        // processing
        calorias = new int[7];
        for (int i=0;i<7;i=i+1)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite las calorias del dia "+dias[i]));
            dia=i+1;
            //JOptionPane.showMessageDialog(null, "Las calorias del dia " + dias[i] + " son: " + calorias[i]);
            System.out.println ("Las calorias del dia " + dias[i] + " son: " + calorias[i]);
        }
        mayor=calorias[0];
        for (int x = 1; x < calorias.length; x++) {
			if (calorias[x] > mayor) {
				mayor = calorias[x];
                dia=x;
			}
		}
        menor=calorias[0];
        for (int x = 1; x < calorias.length; x++) {
			if (calorias[x] < menor) {
				menor = calorias[x];
                diaMenos=x;
			}
		}
        for(int s=0;s<7;s++){
            suma=suma+calorias[s];
        }
        suma=suma/7;

        

            JOptionPane.showMessageDialog(null,"El dia "+dias[dia]+" fue el dia con mas calorias.\nCalorias quemadas el dia "+dias[dia]+" fue : "+mayor);
            JOptionPane.showMessageDialog(null,"El dia "+dias[diaMenos]+" fue el dia con menos calorias.\nCalorias quemadas el dia "+dias[diaMenos]+" fue : "+menor);
            JOptionPane.showMessageDialog(null,"El Promedio de calorias fue : "+suma);
    }    
}
