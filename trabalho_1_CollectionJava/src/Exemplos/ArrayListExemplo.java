
package Exemplos;

import java.util.ArrayList;

public class ArrayListExemplo{
    public static void main(String[] args){
    
    
    // cria um novo ArrayList de strings com uma capacidade inicial de 10
    ArrayList<String> cores = new ArrayList<String>();
        
    
    cores.add("azul"); 
    cores.add(0, "vermelho"); 
    
    // cabeçalho
    System.out.print("mostra todas cores na lista :");
    
    // exibe as cores na lista com for normal
    for (int i = 0; i < cores.size(); i++)
        System.out.printf(" %s", cores.get(i));
    
    // exibe as cores usando for aprimorada no método display
    display(cores,"%nmosta coress com for aprimorada");
    
    cores.add("verde"); // adiciona "verde" ao fim da lista
    cores.add("amarelo"); // adiciona "amarelo" ao fim da lista
    display(cores, "mostra lista com cores nova:");
   
    cores.remove("amarelo"); // remove o primeiro "amarelo"
    display(cores, "removemos  a  cor amarelo da lista:");
    
    cores.remove(1); // remove o item no índice 1
    display(cores, "removemos  a cor (azul) da lista:");
    
    // verifica se um valor está na List
    System.out.printf("\"amarelo \"  %sesta na lista!%n",cores.contains("amarelo") ? "": "nao ");
    
    // exibe o número de elementos na List
    System.out.printf("tamanho da lista: %s%n", cores.size());

    }
    
    
    
    // exibe elementos do ArrayList no console
    public static void display(ArrayList<String> items, String header){    
        System.out.printf(header); // exibe o cabeçalho
    
        // exibe cada elemento em itens
        for (String item : items)
            System.out.printf(" %s", item);
    
        System.out.println();
    }
} // fim da classe ArrayList
    
