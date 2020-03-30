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
public class JG_Vendas extends JG_Compras {
    protected int JG_NumeroTotalDeVendas;
    protected int JG_NumeroDeVendasNãoRealizadas;
    protected String JG_MeioDeVenda;
    protected String JG_TipoDeEmbalagem; 
    public int JG_numerodevendasdiarias;
    protected double JG_ComissãoDeVenda;
    
    
    public void setjg_NumeroTotalDeVendas(int JG_NumeroTotalDeVendas ){
        this.JG_NumeroTotalDeVendas  =  JG_NumeroTotalDeVendas; 
        
    }public int getjg_NumeroTotalDeVendas(){
        return this.JG_NumeroTotalDeVendas;
        
    } public void setJG_NumeroDeVendasNãoRealizadas(int JG_NumeroDeVendasNãoRealizadas ){
        this.JG_NumeroDeVendasNãoRealizadas  =  JG_NumeroDeVendasNãoRealizadas; 
        
    }public int getjg_NumeroDeVendasNãoRealizadas(){
        return this.JG_NumeroDeVendasNãoRealizadas;
        
    }public void setjg_MeioDeVenda(String JG_MeioDeVenda ){
        this.JG_MeioDeVenda  =  JG_MeioDeVenda;
        
    }public String getjg_MeioDeVenda(){
        return this.JG_MeioDeVenda;
        
    } public void setjg_TipoDeEmbalagem(String jg_TipoDeEmbalagem ){
        this.JG_TipoDeEmbalagem  =  jg_TipoDeEmbalagem;
        
    } public String getjg_TipoDeEmbalagem (){
        return this.JG_TipoDeEmbalagem;    
    } public void setjg_numerodevendasdiarias(int JG_numerodevendasdiarias ){
        this.JG_numerodevendasdiarias  =  JG_numerodevendasdiarias;
        
    } public int getjg_numerodevendasdiarias(){
        return this.JG_numerodevendasdiarias;
        
}public double lucro(){
    return this.JG_NumeroTotalDeVendas-JG_NumeroDeVendasNãoRealizadas-JG_SalarioParaOsEmpregados;
}public double ComissoesDeVendasMensais(){
    return this.JG_NumeroTotalDeVendas*0.10;

}JG_Vendas(){
  JG_NumeroTotalDeVendas = 30000;
  JG_NumeroDeVendasNãoRealizadas = 800;
  JG_SalarioParaOsEmpregados = 10000;
  JG_numerodevendasdiarias = 1000;
    
} public double ComissoesDiarias(){
   return this.JG_NumeroTotalDeVendas/30*0.10;
}}
    

//public double GanhoComhoraextra(){
         //return this.JG_salario*0.20*JG_horaExtra;
