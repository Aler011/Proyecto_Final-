
import java.awt.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvin
 */
public class Grafo {
    Nodo nodo;
    Arista arista;
    int cant;
    ArrayList<ArrayList<Integer>> lisAdy = new ArrayList<ArrayList<Integer>>();

    public Grafo(int cant){
        this.cant = cant;
        
    }

    public int getCant() {
        return cant;
    }
    
    
    public int[][] matrizAdy(ArrayList<Integer> fil, ArrayList<Integer> col, ArrayList<Arista> ar){
        
        
        //ArrayList<Integer> aux = new ArrayList<Integer>();
        
        System.out.println(" - - - MATRIZ DE ADYACENCIA - - - \n\n");
        int matriz[][] = new int[getCant()][getCant()];
        for(int k = 0; k < getCant(); k++){
           for(int l = 0; l < getCant(); l++ ){
               matriz[k][l] = 0;
           }
        }
            
           for(int l = 0; l < fil.size(); l++ ){
               //matriz[k][l] = 0;
               
                   //matriz[fil.get(l)][col.get(l)] = 1;
            for(int m = 0; m < ar.size(); m++){
                if(fil.get(l) == ar.get(m).getNi() && col.get(l) == ar.get(m).getNf()){
                   matriz[fil.get(l)][col.get(l)] = ar.get(m).getPes();
                   matriz[col.get(l)][fil.get(l)] = ar.get(m).getPes();
                }
            } 
                 
                  
               
          }
        
        
        
        //------ Parte grafica solamente ------
        System.out.print("    ");
        for(int k = 0; k < getCant(); k++){
            System.out.print(k + "    " );
        }
        
        System.out.print("\n    ");
        for(int k = 0; k < getCant(); k++){
            System.out.print("_" + "    " );
        }
        System.out.println("");
        //------ Parte grafica solamente ------
        
        
        for(int k = 0; k < getCant(); k++){
            System.out.print( k + " | ");
            //ArrayList<Integer> aux = new ArrayList<Integer>();
           for(int l = 0; l < getCant(); l++ ){
                
               if(matriz[k][l] == 1){
                   //aux.add(l);
               }
               System.out.print(matriz[k][l] + "    ");
           }
           //lisAdy.add(aux);
            System.out.println("");
            System.out.println("");
        }
        
        
        
        
       return matriz; 
    }
    
    
    
    public Nodo getNodo() {
        return nodo;
    }
    

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public Arista getArista() {
        return arista;
    }

    public void setArista(Arista arista) {
        this.arista = arista;
    }
    
    
}
