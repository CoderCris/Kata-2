package histogram;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Crisa
 */
public class Integers {
    
    private int[] data;
    private Map<Integer, Integer> histogram= new HashMap<>();
    

    public void initialize(){
        input();
        procedure();
        output();
    }
    
    private void input() {
        System.out.println("Tamaño del vector:");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){
            System.out.println("El valor introducido no es un entero, por favor, introduzca otro valor");
            input.next();
        }
        data = new int[input.nextInt()];
        for(int i=0; i<data.length; i++){
            System.out.println("Introduzca elemento número:" + (i+1));
            while (!input.hasNextInt()){
            System.out.println("El valor introducido no es un entero, por favor, introduzca otro valor");
            input.next();
            }
            data[i] = input.nextInt();
        }
    }
    
    private void procedure() {
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
    }

    
    public void output(){
        histogram.keySet().forEach((val) -> {
            System.out.println("Valor: " + val + " Repeticiones: " + histogram.get(val));
        });
    }


}