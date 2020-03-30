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
public class JG_Compras {
  protected int JG_QuantidadeDeComprasMensais;
  protected double JG_custodetrasporte;
  protected double JG_custodamercadoria;
  protected double JG_ComprasdoAlmoxarifado;
  protected double JG_taxadetrasporteaereo;
  protected double JG_SalarioParaOsEmpregados;
  
  
  public void setjg_QuantidadeDeComprasMensais(int JG_QuantidadeDeComprasMensais){
        this.JG_QuantidadeDeComprasMensais = JG_QuantidadeDeComprasMensais;
    }
    public int getjg_QuantidadeDeComprasMensais(){
        return this.JG_QuantidadeDeComprasMensais;
  

    
} public void setjg_custodetrasporte(double JG_custodetrasporte){
        this.JG_custodetrasporte = JG_custodetrasporte;
        
} public double getjg_custodetrasporte(){
        return this.JG_custodetrasporte;
        
} public void setjg_custodamercadoria(double JG_custodamercadoria){
        this.JG_custodamercadoria = JG_custodamercadoria;
        
}public double getjg_custodamercadoria(){
        return this.JG_custodamercadoria;
        
}public void setjg_ComprasdoAlmoxarifado(double JG_ComprasdoAlmoxarifado){
        this.JG_ComprasdoAlmoxarifado = JG_ComprasdoAlmoxarifado;
        
}public double getJG_ComprasdoAlmoxarifado(){
        return this.JG_ComprasdoAlmoxarifado;
        
}public void setjg_taxadetrasporteaereo(double JG_taxadetrasporteaereo){
        this.JG_taxadetrasporteaereo = JG_taxadetrasporteaereo;
        
} public double getjg_taxadetrasporteaereo(){
        return this.JG_taxadetrasporteaereo;
        
} public void setjg_SalarioParaOsEmpregados(double JG_SalarioParaOsEmpregados){
        this.JG_SalarioParaOsEmpregados = JG_SalarioParaOsEmpregados;
        
} public double getjg_SalarioParaOsEmpregados(){
        return this.JG_SalarioParaOsEmpregados;
        
}public double JG_DinheiroGastoComComprasMensais(){
    return this.JG_custodamercadoria*JG_QuantidadeDeComprasMensais*JG_taxadetrasporteaereo;
    
}public double JG_CustoDoMaterialDaEmpresa(){
    return this.JG_ComprasdoAlmoxarifado+JG_custodetrasporte* JG_taxadetrasporteaereo;
    
    

} JG_Compras(){
    
    
    JG_custodamercadoria = 300;
    JG_QuantidadeDeComprasMensais = 200;
    JG_ComprasdoAlmoxarifado = 1000;
    JG_custodetrasporte = 600;
    JG_taxadetrasporteaereo = 0.52;
}

}

//public double GanhoComhoraextra(){
         //return this.JG_salario*0.20*JG_horaExtra;