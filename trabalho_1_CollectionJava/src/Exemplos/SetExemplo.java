/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos;
import java.util.Set;
import java.util.HashSet;


public class SetExemplo {
    
  public static void main(String[] args) {
    Set cargos = new HashSet<>();

    cargos.add("Gerente");
    cargos.add("Diretor");
    cargos.add("Presidente");
    cargos.add("Secretária");
    cargos.add("Funcionário");
    cargos.add("Diretor"); // repetido!

    // imprime na tela todos os elementos
    System.out.println(cargos);
  }
}
    
