/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Cliente {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dt_nasc
     */
    public int getDt_nasc() {
        return dt_nasc;
    }

    /**
     * @param dt_nasc the dt_nasc to set
     */
    public void setDt_nasc(int dt_nasc) {
        this.dt_nasc = dt_nasc;
    }
    
    private String nome;
    private  int rg;
    private int cpf;
    private int dt_nasc;
    
    
    
    
}
