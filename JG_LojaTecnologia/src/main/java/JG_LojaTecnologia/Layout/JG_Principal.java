/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JG_LojaTecnologia.Layout;

/**
 *
 * @author USER
 * 
 */


             //====ATENÇÃO!!!!!====//
//===SE NÃO APARECER NADA NA TELA QUANDO FOR EXECUTADO =======
//===MINIMIZE E ABRA O PROGRAMA NOVAMENTE ============//

   import java.awt.BorderLayout;
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JTextField;
   import java.awt.Font;
   import java.awt.Color;
   import javax.swing.JPasswordField;
   import java.awt.Dimension;
   import java.awt.event.ActionListener;
   import java.awt.event.ActionEvent;
   import javax.swing.JButton;
   import javax.swing.JOptionPane;
   import javax.swing.JPanel;
   import javax.swing.JComboBox;





public class JG_Principal extends JG_Janela implements ActionListener{
    
    JLabel jLabel_Descricao = new JLabel("Descrição");
    JTextField field_Descricao = new JTextField(20);
    JLabel jLabel_Preco = new JLabel("Preço");
    JTextField field_Preco = new JTextField(5);
    JLabel jLabel_Quantidade = new JLabel("Quantidade");
    JTextField field_Quantidade = new JTextField(3);
    JButton button_Salvar = new JButton("Salvar");
    JPanel jPanel_Formulario = new JPanel();
    
     //======CadastroDeClientes========
    JLabel jLabel_jg_nome = new JLabel ("NomeDoCliente");
    JTextField field_jg_nome = new JTextField(19);
    JLabel jLabel_jg_cpf = new JLabel("CPF");
    JTextField field_jg_cpf = new JTextField(25);
    JButton botão_Cadastrar = new JButton("Cadastrar");
    JLabel jLabel_JG_email = new JLabel ("EmailDoCliente");
    JTextField field_JG_email = new JTextField(15);
    JLabel jLabel_JG_númerodetelefone = new JLabel ("NúmeroDeTelefone");
    JTextField field_JG_númerodetelefone = new JTextField(10);
   JPanel jPanel_Formulario2 = new JPanel();
    
  //=========Gerente/funcionário=================
   JLabel jLabel_jg_gerente = new JLabel ("UsuárioDoGerente");
   JTextField field_jg_gerente = new JTextField(15);
   JLabel jLabel_senha = new JLabel ("Senha");
   JPasswordField Senha_jg_gerente = new JPasswordField(15);
   JButton BotaoAutorizar = new JButton("Autorizar Venda");
   JLabel jLabel_jg_funcionario = new JLabel ("UsuárioDoFuncionário");
   JTextField field_jg_funcionario = new JTextField(17);
    JLabel jLabel_senha1 = new JLabel ("Senha");
   JPasswordField Senha_jg_funcionario = new JPasswordField(10);
   JButton JG_BotaoComissão = new JButton("Gerar Comissão");
   
   
   
   //========Funcionário===========
    
    Font grande = new Font("Serif", Font.BOLD,17);
    JLabel legenda = new JLabel("texto");
    JButton botao = new JButton("Clientes");
    Font fonte = new Font("Couriew New", Font.ITALIC,18);
    JButton botao2 = new JButton("Funcionários");
    Font fonte1 = new Font("Couriew New", Font.ITALIC,18);
    JButton botao3 = new JButton("Gerente");
    Font fonte2 = new Font("Couriew New", Font.ITALIC,18);
    JButton botao4 = new JButton("vendas");
    Font fonte3 = new Font("Couriew New", Font.ITALIC,18);
    JButton botao5 = new JButton("Compras");
    Font fonte4 = new Font("Couriew New", Font.ITALIC,18);
    
    //========MeioDeVenda==============
    JLabel jLabel_jg_cartão = new JLabel ("TipoDeCartão");
    JTextField field_jg_cartão = new JTextField(24);
    JLabel jLabel_jg_dinheiro = new JLabel ("ValorEmDinheiro");
    JTextField field_dinheiro = new JTextField(14);
 
    JLabel jLabel_JG_Númerodeparcelas = new JLabel ("NúmeroDeParcelas");
    JTextField field_JG_Númerodeparcelas = new JTextField(26);
    
     JButton JG_Parcela = new JButton("$PARCELAS$");
    
   
    
    public void actionPerformed(ActionEvent e){
        //JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!");
        
      //JOptionPane.showMessageDialog(null, "Nome: Jediael");
      //JOptionPane.showMessageDialog(null,"Idade: 18" );
     // JOptionPane.showMessageDialog(null,"CPF: 037.234.234-30" );
      
    
    }
    public JG_Principal(){
        
        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(700,500));
        add(painel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);  
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setBackground(Color.GREEN);
        
        
        
        
        
        legenda.setFont(grande);
        
        
         JTextField text_field = new JTextField(30);
         text_field.setText("Digite Aqui o Motivo Do Desconto");
        JComboBox boxi = new JComboBox();
        
       // =========INTENS ========//
       boxi.addItem("Intens");
       boxi.addItem("Celular");
       boxi.addItem("Notebook");
       boxi.addItem("Computador de Mesa");
       boxi.addItem("Fone de Ouvido");
       boxi.addItem("Mouse");
       boxi.addItem("Teclado");
       boxi.addItem("Processador");
       boxi.addItem("Pente de Memória Ram");
       boxi.addItem("Gravadora");
       boxi.addItem("HD");
       boxi.addItem("Placa Mãe");
       boxi.addItem("Placa De Vídeo");
       boxi.addItem("Pen Drive"); 
       boxi.addItem("SSD"); 
       boxi.addItem("Nobreak"); 
       boxi.addItem("Gabinete"); 
       
       
       //=========DESCONTOS=========//
       JComboBox boxi2 = new JComboBox();
       
       boxi2.addItem("Aplicar Desconto");
       boxi2.addItem("10%");
       boxi2.addItem("15%");
       boxi2.addItem("20%");
       boxi2.addItem("25%");
       boxi2.addItem("30%");
       boxi2.addItem("35%");
       boxi2.addItem("40%");
       boxi2.addItem("45%");
       boxi2.addItem("50%");
       boxi2.addItem("60%");
       //================Boxi3=================//
      
       
       
        
        //===========BOTAO=========
        botao.setForeground(Color.BLUE);
        botao.setBackground(Color.yellow);
        botao2.setForeground(Color.BLUE);
        botao2.setBackground(Color.yellow);
        botao3.setForeground(Color.BLUE);
        botao3.setBackground(Color.yellow);
        botao4.setForeground(Color.BLUE);
        botao4.setBackground(Color.yellow);
        botao5.setForeground(Color.BLUE);
        botao5.setBackground(Color.yellow);
        
        //=============BOXI=========
        boxi.setBackground(Color.YELLOW);
        
        
        
    //======FONTBOTAO======
    botao.setFont(fonte);
    botao2.setFont(fonte);
    botao3.setFont(fonte);
    botao4.setFont(fonte);
    botao5.setFont(fonte);
    
    
    
    //=======CadastroDeProdutos=====
    jLabel_Descricao.setFont(fonte);
    jLabel_Preco.setFont(fonte);
    jLabel_Quantidade.setFont(fonte);
    
    //=======Funcionario e Gerente=====
    jLabel_jg_gerente.setFont(fonte);      
    jLabel_senha.setFont(fonte);
    jLabel_jg_funcionario.setFont(fonte);
    jLabel_senha1.setFont(fonte);    
    
    //======CadasroDeClientes=======
     jLabel_jg_nome.setFont(fonte);
     jLabel_jg_cpf.setFont(fonte);
     jLabel_JG_email.setFont(fonte);
     jLabel_JG_númerodetelefone.setFont(fonte);
             
    //=======pagamento==========
    
      jLabel_jg_cartão.setFont(fonte);
     jLabel_jg_dinheiro.setFont(fonte);
     jLabel_JG_Númerodeparcelas.setFont(fonte);
     
     
     
      
    
    //======Boxi2=====
    
     boxi2.setBackground(Color.YELLOW);
     
     //=====TextField
     
     text_field.setBackground(Color.white);
   
    //=========================================//
    //  -<-
    // -----
    
    //========================================//
   // botão_Cadastrar.addActionListener(new ActionListener());
    //setLayout(null);
       //=========CadastroDeProdutos========
       painel.add (jLabel_Descricao);
       
       
       //Font jLabel_Descricao = new Font("Couriew New", Font.BOLD,3);
       
       painel.add(field_Descricao);
       field_Descricao.setBackground(Color.white);
       
       painel.add(jLabel_Preco);
       //Font jLabel_Preco = new Font("Couriew New", Font.BOLD,3);
       
       painel.add(field_Preco);
       field_Preco.setBackground(Color.white);
       
       painel.add(jLabel_Quantidade);
       //Font jLabel_Quantidade = new Font("Couriew New", Font.BOLD,3);
       
       painel.add(field_Quantidade);
       field_Quantidade.setBackground(Color.white);
       
       painel.add(button_Salvar);
       button_Salvar.setBackground(Color.YELLOW);
       //=====CadastroDeCliente====
       painel.add(botão_Cadastrar);
       botão_Cadastrar.setBackground(Color.YELLOW);
       
       //=======Registro======
       painel.add(boxi);
       painel.add(boxi2);
       painel.add(text_field );
       
      //========CadastroDeClientes======
       painel.add(jLabel_jg_nome);
       //Font jLabel_jg_nome = new Font("Couriew New", Font.BOLD,3);
       
       painel.add(field_jg_nome);
       
       painel.add(jLabel_jg_cpf);
       //Font jLabel_jg_cpf = new Font("Couriew New", Font.BOLD,3);
      
       painel.add(field_jg_cpf);
       painel.add(jLabel_JG_email);
       //Font jLabel_JG_email = new Font("Couriew New", Font.BOLD,3);
       painel.add( field_JG_email);
       painel.add(jLabel_JG_númerodetelefone);
       //Font jLabel_JG_númerodetelefone = new Font("Couriew New", Font.BOLD,3);
       painel.add(field_JG_númerodetelefone);
       painel.add(botão_Cadastrar);  
       
       //======Gerente e Funcionário========
      painel.add(jLabel_jg_gerente);
      painel.add(field_jg_gerente);  
      painel.add(jLabel_senha);
      painel.add(Senha_jg_gerente);  
      painel.add(BotaoAutorizar); 
      painel.add(jLabel_jg_funcionario);  
      painel.add(field_jg_funcionario);
      painel.add(jLabel_senha1);
      painel.add(Senha_jg_funcionario);  
      painel.add(JG_BotaoComissão); 
      
      //==========MeioDePagamento===========
   painel.add(jLabel_jg_cartão);
   painel.add(field_jg_cartão);
    painel.add(jLabel_jg_dinheiro);
    painel.add(field_dinheiro);
    painel.add(jLabel_JG_Númerodeparcelas);
    painel.add(field_JG_Númerodeparcelas);       
    painel.add(JG_Parcela);
    JG_Parcela.setBackground(Color.cyan);
    
   
                   
            
       
      // painel.add(botao);
       //painel.add(BorderLayout.SOUTH, botao);
      // painel.add(botao2);
     //  painel.add(BorderLayout.SOUTH, botao2);
       
      //  painel.add(botao3);
     //  painel.add(BorderLayout.SOUTH, botao3);
      //  painel.add(botao4);
      //  painel.add(BorderLayout.SOUTH, botao4);
       // painel.add(botao5);
      //  painel.add(BorderLayout.SOUTH, botao5);
      
     
      
      
      
       //JLabel jLabel_jg_cartão = new JLabel ("TipoDeCartão");
    //JTextField field_jg_cartão = new JTextField(16);
   // JLabel jLabel_jg_dinheiro = new JLabel ("ValorEmDinheiro");
   //JTextField field_dinheiro = new JTextField(14);
     //JButton JG_Parcela = new JButton("ValoresDasParcelas");
     //painel.add(jLabel_jg_cartão);
   //painel.add(field_jg_cartão);
   // painel.add(jLabel_jg_dinheiro);
   // painel.add(field_dinheiro);
   // painel.add(boxi3);
   // painel.add(JG_Parcela);
   
      JG_Parcela.addActionListener(new ActionListener()
      {
            @Override
            public void actionPerformed(ActionEvent e) {
               JG_MeiodeVenda venda = new JG_MeiodeVenda();
               venda.setJG_Cartão(field_jg_cartão.getText());
                venda.setJG_dinheiro(Integer.parseInt(field_dinheiro.getText()));
                venda.setJG_númerodeparcelas(Integer.parseInt(field_JG_Númerodeparcelas.getText()));
                    
                   JOptionPane.showMessageDialog(null, "Cartão: " + venda.getJG_Cartão()+ "\n"
                   + "Valores das parcelas: " +"\n"
                   + "O valor da parcela é : " + venda.getJG_dinheiro()/venda.getJG_númerodeparcelas()+"\n"
             
                   
                     
                    + "Muito Obrigado!");
                   
            }
          
      }
      
      
      
      
      );
      
      
      
      
      
      
      
        //==========GerenteFuncionário=======================
        BotaoAutorizar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
              JG_Gerente gerente = new JG_Gerente();
              gerente.setJG_Usuario1(field_jg_gerente.getText());
               
                  
                    
                   JOptionPane.showMessageDialog(null, "Bem Vindo: " + gerente.getJG_Usuario1()+ "\n"
                  + "A Venda Foi Autorizada!");
            }
            
        }
        
        ); 
             
        
        
        
        
        
        
        //==========CadastroDeProdutos====================================
        JG_BotaoComissão.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
              JG_Funcionário funcionario = new JG_Funcionário();
              funcionario.setJG_Usuario(field_jg_funcionario.getText());
               
                  
                    
                   JOptionPane.showMessageDialog(null, "Bem Vindo: " + funcionario.getJG_Usuario()+ "\n"
                  + "Comissão Gerada!");
            }
            
        }
        
        
        );
        
        
        
        
        
        
       // =================================================================
       
        botão_Cadastrar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
               JG_Cadastro cadastro = new JG_Cadastro();
               cadastro.setJG_nome(field_jg_nome.getText());
               
                   cadastro.setJG_CPF(Integer.parseInt(field_jg_cpf.getText()));
                   cadastro.setJG_email(field_JG_email.getText());
                   cadastro.setJG_númerodetelefone(Integer.parseInt(field_JG_númerodetelefone.getText()));
                    
                   JOptionPane.showMessageDialog(null, "O Nome do Cliente é: " + cadastro.getJG_nome() + "\n"
                    + "O CPF do Cliente é: " + cadastro.getJG_CPF()+ "\n"
                    + "O Email do Cliente é: " + cadastro.getJG_email()+ "\n"
                    + "O Telefone do Cliente é: " + cadastro.getJG_númerodetelefone()+ "\n"
                  + "Cliente Cadastrado!");
            }
            
        }     
        );
        
       
     
        
        
        button_Salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    JG_Produtos produtos = new JG_Produtos();
                   
                  produtos.setJG_descricao(field_Descricao.getText());
                    produtos.setJG_preco(Integer.parseInt(field_Preco.getText()));
                    produtos.setJG_quantidade(Integer.parseInt(field_Quantidade.getText()));
                    
                    JOptionPane.showMessageDialog(null, "A descrição do produto: " +  produtos.getJG_descricao() + "\n"
                   + "O preço digitado foi: " +  produtos.getJG_preco() + "\n"
                   + "A quantidade digitada foi: " +  produtos.getJG_quantidade() + "\n"
                    + "Muito Obrigado!");
            }
        });
    }

    
    
   /////================================================================================///////////
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args){
        new JG_Principal();
    }
    
}

