/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoh;

/**
 *
 * @author kesia.viana
 */

      // Subclasse de Veiculo
class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano); 
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta-malas do carro.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();  
        System.out.println("Número de portas: " + portas);
    }
}
    
