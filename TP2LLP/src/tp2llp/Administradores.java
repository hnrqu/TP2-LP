/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2llp;


public class Administradores extends DadosPessoais{
    private final int grauAcesso = 2;
   
   public Administradores(String cpf, String identidade,String numeroAdm, int codigo, String nome, String logradouro, String bairro, int numero, String municipio, String estado, int cep, int telefone, int max_midias_emprestimo) {
        super(codigo, nome, cpf, identidade, logradouro, bairro, numero, municipio, estado, cep, telefone);
        
    }
   public int getGrauAcesso() {
        return grauAcesso;
    }
  
}
