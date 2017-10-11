package histogram;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Integers {
    
    private int[] data;
    private Map<Integer, Integer> histogram= new HashMap<>();
    
    public void fill(){
        System.out.println("Tamaño del vector:");
        Scanner input = new Scanner(System.in);
        data = new int[input.nextInt()];
        for(int i=0; i<data.length; i++){
            System.out.println("Introduzca elemento número:" + (i+1));
            data[i] = input.nextInt();
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        show();
    }
    
    public void show(){
        for(Integer val : histogram.keySet()){
            System.out.println(" Valor: " + val +" Repeticiones: " + histogram.get(val));
        }
    } 
}