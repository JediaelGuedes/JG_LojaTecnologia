/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JG_LojaTecnologia.Layout;

/**
 *
 * @author USER
 */
public class JG_Cadastro {
    
    protected String JG_nome;
   protected int JG_CPF;
    protected String JG_email;
    protected int JG_númerodetelefone;
    
    
    public void setJG_nome(String JG_nome) {
        this.JG_nome=JG_nome;
    }

    public String getJG_nome() {
        return this.JG_nome;
    }   
    public void setJG_CPF(int JG_CPF) {
        this.JG_CPF=JG_CPF;
    }

    public int getJG_CPF() {
        return this.JG_CPF;
    }public void setJG_email(String JG_email) {
        this.JG_email=JG_email;
    }

    public String getJG_email() {
        return this.JG_email;

    }public void setJG_númerodetelefone(int JG_númerodetelefone) {
        this.JG_númerodetelefone=JG_númerodetelefone;
    }

    public int getJG_númerodetelefone() {
        return this.JG_númerodetelefone;
    }}
