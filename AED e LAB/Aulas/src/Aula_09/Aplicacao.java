package Aula_09;
import java.util.Random;
 
public class Aplicacao {
     
    public static String toString(int vetor[]){
        String resp = "[";
        for(int i: vetor)
            resp += i + ", ";
        return resp+"]";
    }
     
    public static void main(String []args){
        int TAM = 30000;
        int vetor [] = new int[TAM];
        Random rand = new Random();
        Ordena metodo = new InsertionSort();
         
        for(int i=0; i<TAM; i++){
            //vetor[i] = rand.nextInt(TAM) + 1; // ordem aleatório
            //vetor[i] = i; // ordem crescente
            vetor[i] = TAM - i; // ordem decrescente
        }
         
        System.out.println(toString(vetor));
        long start = System.currentTimeMillis();
        metodo.ordenar(vetor);  
        long elapsed = System.currentTimeMillis() - start;
         
        System.out.println("Tempo de ordenação: " + elapsed);
        System.out.println(toString(vetor));
    }
}