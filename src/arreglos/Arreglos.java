
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
        int nElementos, total =0;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elemento para el arreglo"));
        
        int[] numeros = new int[nElementos];
       
        System.out.println("Digite los elementos del arreglo");
        
        for(int i=0; i<nElementos;i++){
            System.out.println((i+1)+". Digite un caracter: ");
            numeros[i] = ent.nextInt();
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i=0;i<nElementos;i++){
            System.out.println(numeros[i]);
        }
        for(int cont =0; cont<nElementos;cont++){
        
            total+=numeros[cont];
        }
        System.out.println("Tu suma es igual a: "+total);
    }
    
}
