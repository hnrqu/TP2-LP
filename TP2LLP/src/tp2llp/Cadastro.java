/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2llp;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cadastro {

    private int acessCode;

    private ArrayList<DadosPessoais> array_adm;
    private ArrayList<DadosPessoais> array_cliente;
    private ArrayList<DadosPessoais> array_prof;

    public Cadastro() {
        this.array_adm = new ArrayList<>();
        this.array_cliente = new ArrayList<>();
        this.array_prof = new ArrayList<>();
    }

    /**
     * cadastra novo contato
     *
     * @param Codigo
     * @param Nome
     * @param Cpf
     * @param Identidade
     * @param Logradouro
     * @param Bairro
     * @param Numero
     * @param Municipio
     * @param Estado
     * @param Cep
     * @param Telefone
     */
    public void cadastroContato(int Codigo, String Nome, String Cpf, String Identidade, String Logradouro, String Bairro, int Numero, String Municipio, String Estado, int Cep, int Telefone) {
        if (acessCode == 2) {
            DadosPessoais p1 = new DadosPessoais(Codigo, Nome, Cpf, Identidade, Logradouro, Bairro, Numero, Municipio, Estado, Cep, Telefone);
            this.array_adm.add(p1);
        } else if (acessCode == 1) {
            DadosPessoais p2 = new DadosPessoais(Codigo, Nome, Cpf, Identidade, Logradouro, Bairro, Numero, Municipio, Estado, Cep, Telefone);
            this.array_prof.add(p2);
        } else if (acessCode == 0) {
            DadosPessoais p3 = new DadosPessoais(Codigo, Nome, Cpf, Identidade, Logradouro, Bairro, Numero, Municipio, Estado, Cep, Telefone);
            this.array_cliente.add(p3);
        }
    }

    public String numerodeContatos() {
        switch (acessCode) {
            case 2:
                return array_adm.size() + "";
            case 1:
                return array_prof.size() + "";
            case 0:
                return array_cliente.size() + "";
            default:
                break;
        }
        return null;
    }

    public void exibirtodosContatos() {
        switch (acessCode) {
            case 2:
                for (int i = 0; i < this.array_adm.size(); i++) {
                    DadosPessoais aux = this.array_adm.get(i);
                    System.out.println("Código:" + aux.getCodigo() + "Nome:" + aux.getNome() + "Telefone:" + aux.getTelefone() + "CPF:" + aux.getCpf() + "Identidade:" + aux.getIdentidade() + "Logradouro:" + aux.getLogradouro() + "Municipio:" + aux.getMunicipio() + "Bairro:" + aux.getBairro() + "Estado:" + aux.getEstado());
                }
            case 1:
                for (int i = 0; i < this.array_prof.size(); i++) {
                    DadosPessoais aux = this.array_prof.get(i);
                    System.out.println("Código:" + aux.getCodigo() + "Nome:" + aux.getNome() + "Telefone:" + aux.getTelefone() + "CPF:" + aux.getCpf() + "Identidade:" + aux.getIdentidade() + "Logradouro:" + aux.getLogradouro() + "Municipio:" + aux.getMunicipio() + "Bairro:" + aux.getBairro() + "Estado:" + aux.getEstado());
                }
            case 0:
                for (int i = 0; i < this.array_cliente.size(); i++) {
                    DadosPessoais aux = this.array_cliente.get(i);
                    System.out.println("Código:" + aux.getCodigo() + "Nome:" + aux.getNome() + "Telefone:" + aux.getTelefone() + "CPF:" + aux.getCpf() + "Identidade:" + aux.getIdentidade() + "Logradouro:" + aux.getLogradouro() + "Municipio:" + aux.getMunicipio() + "Bairro:" + aux.getBairro() + "Estado:" + aux.getEstado());
                }
            default:
                break;
        }

    }

    public int getAcessCode() {
        return acessCode;
    }

    public void setAcessCode(int acessCode) {
        this.acessCode = acessCode;
    }

}
