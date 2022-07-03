/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2llp;

/**
 *
 * @author aluno
 */
public class Cliente extends DadosPessoais {

    private final int grauAcesso = 0;

    public Cliente(int codigo, String nome,String cpf,String identidade, String logradouro, String bairro, int numero, String municipio, String estado, int cep, int telefone) {
        super(codigo, nome, cpf,identidade, logradouro, bairro, numero, municipio, estado, cep, telefone);
    }

    public int getGrauAcesso() {
        return grauAcesso;
    }

}
