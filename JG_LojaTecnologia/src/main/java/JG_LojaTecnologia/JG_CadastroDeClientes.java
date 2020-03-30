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
public class JG_CadastroDeClientes {
    public String JG_nome;
    public int JG_cpf;
    public  int JG_numerodecadastro;
    protected String JG_email;
    protected int JG_numerodetelefone;
    public double JG_CustoDoProduto;
    protected String JG_beneficiosDoCartãoDaLoja;
    public int JG_quantidadeDeComprasDoCliente;
    
    
 JG_CadastroDeClientes(){
    JG_nome = "Jediael Guedes";
    JG_cpf = 030405343;
    JG_numerodecadastro = 77334;
    JG_email = "jediael.guedes67@gmail.com";
    JG_numerodetelefone = 991376267;
    JG_CustoDoProduto = 1450;
    JG_beneficiosDoCartãoDaLoja = "Descontos exclusivo de 45%";
    JG_quantidadeDeComprasDoCliente = 100;
    
}
    
 public void setjg_nome(String JG_nome){
  this.JG_nome=JG_nome; 
  
} public String getjg_nome(){
    return this.JG_nome;
    
} public void setjg_cpf(int JG_cpf){
    this.JG_cpf=JG_cpf; 
    
}public int getjg_cpf(){
   return this.JG_cpf;
   
}public void setjg_numerodecadastro(int JG_numerodecadastro){
    this.JG_numerodecadastro = JG_numerodecadastro;
    
}public int getjg_numerodecadastro(){
    return this.JG_numerodecadastro;
    
    
}public void setjg_email(String JG_email){
    this.JG_email=JG_email;
    
}public String getjg_email(){
    return this.JG_email;
    
}public void setjg_numerodetelefone(int JG_numerodetelefone){
    this.JG_numerodetelefone = JG_numerodetelefone;
    
} public int getjg_numerodetelefone(){
    return this.JG_numerodetelefone;
    
} public void setjg_CustoDoProduto(double JG_CustoDoProduto){
    this.JG_CustoDoProduto=JG_CustoDoProduto;
    
}public double getjg_CustoDoProduto(){
    return this.JG_CustoDoProduto;
    
} public void setjg_beneficiosDoCartãoDaLoja(String JG_beneficiosDoCartãoDaLoja){
    this.JG_beneficiosDoCartãoDaLoja=JG_beneficiosDoCartãoDaLoja;
    
} public String getjg_beneficiosDoCartãoDaLoja(){
    return this.JG_beneficiosDoCartãoDaLoja;
    
} public double DescontoEmComprasComCartão(){
    return JG_CustoDoProduto*0.45;
} public void setjg_quantidadeDeComprasDoCliente(int JG_quantidadeDeComprasDoCliente){
    this.JG_quantidadeDeComprasDoCliente=JG_quantidadeDeComprasDoCliente;
    
}public int getjg_quantidadeDeComprasDoCliente(){
    return this.JG_quantidadeDeComprasDoCliente;
    
}public double DescontoEmCompraSemCartão(){
    return 0.40*JG_CustoDoProduto;
    
   
    
}}





    

    

