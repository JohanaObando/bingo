
package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;


public class Tombola {
    int limiteNumeros;
    public List<Integer> numerosSacados;//clase numerosSacados va guardando los números que va obteniendo

    public Tombola(int limiteNumeros) {
        this.limiteNumeros = limiteNumeros;
        numerosSacados = new ArrayList<>();//declaro los números sacados en una lista 
    }
    
    public Integer obtenerNumero() {//sirve para sacar números y no repetirlos
        Random r = new Random();
        int numero = r.nextInt(limiteNumeros) + 1;
        while (numerosSacados.contains(numero) && numerosSacados.size() < limiteNumeros) {
            numero = r.nextInt(limiteNumeros) + 1;
        }
        numerosSacados.add(numero);
        System.out.println("->" + numero);
        return numero;
    }
    
  
    
}
