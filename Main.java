/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author letic
 */
public class Main {
    public static void main (String[] args) {
    
    String nome = "Leticia";
    System.out.println(nome);
    
    Servico servico = new Servico(1,"barba",30);
    
    System.out.println(servico.getDescricao());
    System.out.println(servico.getValor());
    
    Cliente cliente = new Cliente(1, "Leticia", "RUA SALMO 91", "08525350");
        System.out.println(cliente.getNome());

    Usuario usuario = new Usuario (1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
        
    Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "06/01/2021 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
}
