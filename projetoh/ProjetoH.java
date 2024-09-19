/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoh;

/**
 *
 * @author kesia.viana
 */
public class ProjetoH {
    public static void main(String[] args) {
       
        Carro meuCarro = new Carro("BMW", "X1", 2024, 4);
        Moto minhaMoto = new Moto("Honda", "NXR-160", 2019, true);
     
        System.out.println("Carro:");
        meuCarro.exibirInformacoes();
        meuCarro.abrirPortaMalas();
            
        System.out.println("\nMoto:");
        minhaMoto.exibirInformacoes();
        minhaMoto.empinar();
    }
}

