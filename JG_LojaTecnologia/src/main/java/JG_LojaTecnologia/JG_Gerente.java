/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JG_LojaTecnologia;

/**
 *
 * @author USER
 */
    public class JG_Gerente extends JG_Funcionário{
    protected String JGG_nome;
    public String JG_experiência;
    private String JG_usuario;
    private String JG_senha;
    protected int JG_CódigoDeAcesso;
    protected int JG_TempoDeexperiencia;
     
    
    
    public void setjg_usuario(String JG_usuario){
        this.JG_usuario = JG_usuario;
    }
    public String getjg_usuario(){
        return this.JG_usuario;
    }
    public void setjg_senha(String JG_senha){
        this.JG_senha = JG_senha;
    }
    public String getjg_senha(){
        return this.JG_senha;
    }
    public double geraBonificacao(){
        return this.JG_salario*0.3 + 100;
    } public void setjg_TempoDeexperiencia(int JG_TempoDeexperiencia){
          this.JG_TempoDeexperiencia = JG_TempoDeexperiencia;
    } public int getjg_TempoDeexperiencia(){
        return this.JG_TempoDeexperiencia;
    } 
     public double GanhoComhoraextra(){
         return this.jg_horaExtra*JG_salario*0.20;
    } public void setjg_experiência(String JG_experiência){
        this.JG_experiência = JG_experiência;
    }public String getjg_experiência(){
        return this.JG_experiência;
    }public void setjg_CódigoDeAcesso(int JG_CódigoDeAcesso){
        this.JG_CódigoDeAcesso = JG_CódigoDeAcesso;
    }public int getjg_CódigoDeAcesso(){
        return this.JG_CódigoDeAcesso;
     
}
   
  JG_Gerente(){
   JG_salario = 3000;
   jg_horaExtra = 3;
   JGG_nome = "Daniel";
   JG_TempoDeexperiencia = 5 ;
   
 
   
}}
 


      
    
    

