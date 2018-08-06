/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class Repositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Formas de usar o JOptionPane
        String [] pizzas = {"QUEIJO","ARROZ","CARNE","FEIJAO"};
        String entrada = (String) JOptionPane.showInputDialog(null,"Selecione o sabor de pizza", "Sabor da Pizza",JOptionPane.QUESTION_MESSAGE,
                null,pizzas,pizzas[0]);
        System.out.println("O sabor da pizza foi: "+entrada);
        JOptionPane.showConfirmDialog(null,"Você deseja sair?","SAÍDA DO SISTEMA",JOptionPane.YES_NO_CANCEL_OPTION);
    
    }
    
}
