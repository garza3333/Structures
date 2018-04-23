package Lists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Arreglo {
    private int[] lista;
    private int cont,tamaño;
    /**
     * crea una lista con el largo deseado
     * @param largo 
     */
    public Arreglo(int largo){
        this.tamaño = largo;
        this.lista = new int[largo];
    }
    /**
     * inserta un valor al final de la lista
     * @param value - valor a insertar
     */
    public void add(int value){
        if(cont==tamaño){
            System.out.println("La lista esta llena");
        }else{
            lista[cont] = value;
            ++cont;
        }
    }
    /**
     * verifica si la lista se encuentra vacía
     * @return 
     */
    
    public boolean isempty(){
        
        for(int i = 0; i<tamaño ; ++i){
            if(lista[i]!=0){
                
                return false;
            }
        }return true;
    }
    /**
     * inserta un valor en la posición deseada si ya existe valor lo remplaza 
     * @param value - valor a insertar
     * @param index - posisión en la que se inserta
     */
    public void insertI(int value , int index){
        if(index>=tamaño || index < 0){
            System.out.println("ese indice no existe");
        }else{
        lista[index] = value;
            System.out.println("insertado!");}
    }
    /**
     * imprime en pantalla como se encuentra la lista
     */
    public void see(){
        System.out.print("[");
        for(int j=0; j<tamaño-1 ;++j){
            System.out.print(lista[j]+",");
        }System.out.println(lista[tamaño-1]+"]");
    }
    
}
