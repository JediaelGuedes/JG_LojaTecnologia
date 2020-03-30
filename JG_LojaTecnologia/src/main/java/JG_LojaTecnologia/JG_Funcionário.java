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
public class JG_Funcionário {
    protected String JG_nome;
    protected double JG_salario;
    public int JG_horastrabalhadas;
    public int JG_faltas;
    public double jg_horaExtra;
    public int JG_MesesTrabalhados;
    protected double JG_CustoDaHora;
    
    public void setJG_nome(String JG_nome){
        this.JG_nome = JG_nome;
    } 
    public String getJG_nome(){
        return this.JG_nome;
                
        
    } public void setjg_salario(double JG_salario){
        this.JG_salario = JG_salario;
        
    } public double getjg_salario(){
        return this.JG_salario;
        
    } public void setjg_horastrabalhadas(int JG_horastrabalhadas){
        this.JG_horastrabalhadas = JG_horastrabalhadas;
        
    } public int getjg_horastrabalhadas(){
        return this.JG_horastrabalhadas;
        
    }public void setjg_faltas(int JG_faltas){
        this.JG_faltas=JG_faltas;
        
    }public int getjg_faltas(){
        return this.JG_faltas;
        
    }public void setjg_horaExtra(double jg_horaExtra){
     this.jg_horaExtra=jg_horaExtra;
     
} public double getjg_horaExtra(){
        return this.jg_horaExtra;
        
}public void setjg_mesestrabalhados(int JG_MesesTrabalhados){
    this.JG_MesesTrabalhados = JG_MesesTrabalhados;
    
}public int getjg_MesesTrabalhados(){
    return this.JG_MesesTrabalhados;
    
} public double DescontoPorfaltas(){
       return this.JG_salario/30;
       
}public double fgts(){
    return JG_MesesTrabalhados*JG_salario*0.08;
    
} public void setjg_CustoDaHora(double JG_CustoDaHora){
    this. JG_CustoDaHora =  JG_CustoDaHora;
    
}public double getJG_CustoDaHora(){
    return this.JG_CustoDaHora;
    
    
}JG_Funcionário(){
    JG_salario = 1500;
    JG_MesesTrabalhados = 10;
    
}
    
}

    


  
       

     
