package Ativi;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {
        Armazenamento armazenamento = new Armazenamento();

        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));

        Pessoa pessoa = new Pessoa(nome, idade);
        armazenamento.adicionarPessoa(pessoa);

        armazenamento.mostrarPessoa();
    }
}

