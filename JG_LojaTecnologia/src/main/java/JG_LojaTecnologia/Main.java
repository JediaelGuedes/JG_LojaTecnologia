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



import JG_LojaTecnologia.Layout.JG_Principal;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     
     new JG_Principal();
     
    JG_CadastroDeClientes cliente = new JG_CadastroDeClientes();
    cliente.DescontoEmComprasComCartão();
    cliente.DescontoEmCompraSemCartão();
    System.out.println("Cliente");
    System.out.print("Nome: ");
    System.out.println(cliente.JG_nome);
    System.out.print("CPF do Cliente: ");
    System.out.println(cliente.JG_cpf);
    System.out.print("Numero de cadastro: ");
    System.out.println(cliente.JG_numerodecadastro);
    System.out.print("Email: ");
    System.out.println(cliente.JG_email);
    System.out.print("Numero De telefone: ");
    System.out.println(cliente.JG_numerodetelefone);
    System.out.print("Custo do Produto: ");
    System.out.println(cliente.JG_CustoDoProduto);
    System.out.print("Beneficios do cartao da loja: ");
    System.out.println(cliente.JG_beneficiosDoCartãoDaLoja);
    System.out.print("Quantidade de compras do cliente: ");
    System.out.println(cliente. JG_quantidadeDeComprasDoCliente);
    System.out.print("desconto com cartao: - ");
    System.out.println(cliente.DescontoEmComprasComCartão());
    System.out.print("desconto sem cartao: - ");
    System.out.println(cliente.DescontoEmCompraSemCartão());
    
    System.out.println("Funcionario");
    JG_Funcionário funcionario = new JG_Funcionário();
    funcionario.setjg_salario(1500);
    funcionario.setjg_horastrabalhadas(150);
    funcionario.setjg_faltas(1);
    funcionario.setjg_horaExtra(2);
    funcionario.setjg_CustoDaHora(10);
    
    System.out.print("funcionario: ");
    funcionario.setJG_nome("Mateus");
    System.out.println(funcionario.getJG_nome());
    System.out.print("O salario do funcionario eh: ");
    System.out.println(funcionario.getjg_salario());
    System.out.print("As horas trablhadas sao: ");
    System.out.println(funcionario.getjg_horastrabalhadas());
    System.out.print("O numero de faltas eh: ");
    System.out.println(funcionario.getjg_faltas());
    System.out.print("voce fez de hora extra: ");
    System.out.println(funcionario.getjg_horaExtra());
    System.out.print("o custo da hora eh: ");
    System.out.println(funcionario.getJG_CustoDaHora());
    
    funcionario.DescontoPorfaltas();
    System.out.print("Desconto Por Falta: - ");
    System.out.println(funcionario.DescontoPorfaltas());
    funcionario.fgts();
    
    System.out.print("Voce recebera de FGTS: + ");
    System.out.println(funcionario.fgts());
    
    JG_Gerente gerente = new JG_Gerente();
    System.out.println("Gerente");
    System.out.print("Gerente: ");
    System.out.println(gerente.JGG_nome);
    System.out.print("usuario: ");
    gerente.setjg_usuario("DanielB");
    System.out.println(gerente.getjg_usuario());
    gerente.setjg_senha("3234");
    System.out.print("A senha do gerente eh: ");
    System.out.println(gerente.getjg_senha());
    gerente.setjg_CódigoDeAcesso(34102);
    System.out.print("O codigo de acesso a area restrita eh: ");
    System.out.println(gerente.getjg_CódigoDeAcesso());
    System.out.print("O tempo de experiencia do gerente eh: ");
    System.out.print(gerente.JG_TempoDeexperiencia);
    System.out.println(" anos");
    System.out.print("A bonificacao do gerente eh de: ");
    System.out.println(gerente.geraBonificacao());
    System.out.print("Quanto voce ira ganhar com hora extra: ");
    System.out.println(gerente.GanhoComhoraextra());
     
     JG_Vendas vendas = new JG_Vendas();
     System.out.println("Vendas");
     System.out.print("voce teve de lucro: ");
     System.out.println(vendas.lucro());
     System.out.print("Comissoes diarias para os Empregados que realizarem mil vendas : ");
     System.out.println(vendas.ComissoesDiarias());
     System.out.print("Comissoes mensais para os empregados que realizaram mil vendas durante 30 dias: ");
     System.out.println(vendas.ComissoesDeVendasMensais());
     vendas.setjg_MeioDeVenda("Cartao de credito ou dinheiro");
     System.out.print("meio de pagamento: ");
     System.out.println(vendas.getjg_MeioDeVenda());
     vendas.setjg_TipoDeEmbalagem("sacola comum ou sacola de presente");
      System.out.print("Tipo da Embalagem do Produto: ");
      System.out.println(vendas.getjg_TipoDeEmbalagem());
      
      JG_Compras compras = new JG_Compras();
      System.out.println("Compras");
      compras.setjg_QuantidadeDeComprasMensais(200);
      compras.setjg_custodetrasporte(600);
      compras.setjg_custodamercadoria(300);
      compras.setjg_ComprasdoAlmoxarifado(1000);
      compras.setjg_taxadetrasporteaereo(0.52);
      
      System.out.print("a quantidade de compras mensais eh: ");
      System.out.println(compras.getjg_QuantidadeDeComprasMensais());
      System.out.print("o custo de transporte eh: ");
      System.out.println(compras.getjg_custodetrasporte());
      System.out.print("O custo da mercadoria eh: ");
      System.out.println(compras.getjg_custodamercadoria());
      System.out.print("Custo de compras do Almoxarifado: ");
      System.out.println(compras.getJG_ComprasdoAlmoxarifado());
      System.out.print("A taxa de trasporte aereo eh: ");
      System.out.println(compras.getjg_taxadetrasporteaereo());
      System.out.print("Valor total de mercadoria:" );
      System.out.println(compras.JG_DinheiroGastoComComprasMensais());
      System.out.print("Valor do patrimonio de trabalho: ");
      System.out.println(compras. JG_CustoDoMaterialDaEmpresa());
      
      
      
   
    
    



    }}