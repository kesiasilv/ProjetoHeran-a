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
class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);  
        this.temCarenagem = temCarenagem;
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Tem carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }
}

