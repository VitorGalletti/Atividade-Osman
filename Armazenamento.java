package Ativi;

import javax.swing.JOptionPane;

public class Armazenamento {
	private Pessoa pessoa;

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void mostrarPessoa() {
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
    }
}

