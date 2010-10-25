/*
 * p1 de ED 
 * @author Marco Moura <email at marcomoura dot com>
 */

import java.util.Scanner;

public class Main {

    public static String[] opcoes = {"sair","colaboradores","clientes", "fornecedor"};
    public static String[] acoes = {"retornar","cadastrar","excluir", "imprimir"};

    public static Colaborador[] colaboradores = new Colaborador[100];
    public static int count_colab = 0;

    public static Cliente[] clientes = new Cliente[100];
    public static int count_cliente = 0;

    public static Fornecedor[] fornecedores = new Fornecedor[100];
    public static int count_fornecedor = 0;

    public static void main(String[] args) {
      do{
       int opcao = getOpcao(); 
       if(opcao == 0)
         return;
       int acao = getAcao(opcao); 
       if(acao>10)
         controller(acao);
      }while(true);
    }
    
    public static void legend(String _legend){
      _legend = (_legend != "")? ">>"+_legend: "";
      System.out.println("\n::Menu"+_legend+"::");
    }

    public static int getOpcao(){
      legend("");
      for(int i = 0; i < Main.opcoes.length; i++)
        System.out.println("  ["+(i)+"] "+ opcoes[i]);
      int opcao = inputInt("digite o numero");
      return opcao;
    }

    public static int getAcao(int opcao){
      
      legend(opcoes[opcao]);

      for(int i = 0; i < Main.acoes.length; i++)
        System.out.println("  ["+(i)+"] "+ acoes[i]);

      int acao = inputInt("o que deseja?");
      return 10*opcao+acao;
    }

    public static int inputInt(String label){
        Scanner leia = new Scanner(System.in);
        System.out.print(label+":");
        int valor = leia.nextInt();
        return valor;
    }
    
    public static String inputText(String label){
        Scanner leia = new Scanner(System.in);
        System.out.print(label+":");
        String valor = leia.nextLine();
        return valor;
    }

    public static void controller(int acao){
      System.out.println("debug:::::"+acao);
      switch(acao){
        case 11:
            cadastrarColaborador();
            break;
        case 12:
            excluirColaborador();
            break;
        case 13:
            imprimirPessoa(colaboradores,1);
            break;
        case 21:
            cadastrarCliente();
            break;
        case 22:
           // excluirPessoa(clientes);
            break;
        case 23:
            imprimirPessoa(clientes,2);
            break;
        case 31:
            cadastrarFornecedor();
            break;
        case 32:
           // excluirPessoa(clientes);
            break;
        case 33:
            imprimirPessoa(fornecedores,3);
            break;
      }
    }

    public static void cadastrarColaborador(){
      legend(opcoes[1]+">>cadastrar");
			String[] pessoa = readPessoa(1);
      String celular = inputText("celular");
      String data_nascimento = inputText("data de nascimentor");
      String desc_cursos = inputText("informe os cursos que participou");
      Colaborador novo = new Colaborador();
      novo.setNome(pessoa[0]);   
      novo.setCpf(pessoa[1]);   
      novo.setEndereco(pessoa[2]);   
      novo.setBairro(pessoa[3]);   
      novo.setCidade(pessoa[4]);   
      novo.setEstado(pessoa[5]);   
      novo.setCep(pessoa[6]);   
      novo.setTelefone(pessoa[7]);   
      novo.setEmail(pessoa[8]);          
       novo.setCelular(celular);   
       novo.setData_nascimento(data_nascimento);   
       colaboradores[count_colab]= novo;
       count_colab++;
    }

    public static String[] readPessoa(int tipo){  
			String[] pessoa= new String[9];
			String nome, doc;
			if(tipo==3){
				doc = "cnpj";
				nome = "nome fantasia";
			}else{
				doc = "cpf";
				nome = "nome";
			}
			
      pessoa[0] = inputText(nome); 
      pessoa[1] = inputText(doc); 
      pessoa[2] = inputText("endereco");
      pessoa[3] = inputText("bairro");
      pessoa[4] = inputText("cidade");
      pessoa[5] = inputText("estado");
      pessoa[6] = inputText("cep");
      pessoa[7] = inputText("telefone");
      pessoa[8] = inputText("email");
			return pessoa;
		}
    
		public static void cadastrarCliente(){    
			legend(opcoes[2]+">>cadastrar");
			String[] pessoa = readPessoa(2);
      Cliente novo = new Cliente();
      novo.setNome(pessoa[0]);   
      novo.setCpf(pessoa[1]);   
      novo.setEndereco(pessoa[2]);   
      novo.setBairro(pessoa[3]);   
      novo.setCidade(pessoa[4]);   
      novo.setEstado(pessoa[5]);   
      novo.setCep(pessoa[6]);   
      novo.setTelefone(pessoa[7]);   
      clientes[count_cliente]= novo;
      count_cliente++;
    }

		public static void cadastrarFornecedor(){
			legend(opcoes[3]+">>cadastrar");
			String[] pessoa = readPessoa(3);
      Fornecedor novo = new Fornecedor();
	    String razao_social = inputText("razão social");
	    String fundacao = inputText("fundação");
	    String email = inputText("email");
	    String fax = inputText("fax");

      novo.setNome(pessoa[0]);
      novo.setCnpj(pessoa[1]);
      novo.setEndereco(pessoa[2]);
      novo.setBairro(pessoa[3]);
      novo.setCidade(pessoa[4]);
      novo.setEstado(pessoa[5]);
      novo.setCep(pessoa[6]);
      novo.setTelefone(pessoa[7]);
      novo.setEmail(email);
      novo.setRazao_social(razao_social);
      novo.setFundacao(fundacao);
      novo.setFax(fax);
      fornecedores[count_fornecedor]= novo;
      count_fornecedor++;
			
		}

    public static void excluirColaborador(){
      int id = readId(opcoes[1],"excluir");
      colaboradores[id] = colaboradores[count_colab - 1];
      colaboradores[count_colab - 1] = null;
      count_colab--;
    }
    
    public static int readId(String _legend, String label){
      legend(_legend+">>"+label);
      int id = inputInt("informe o ID: ");
      return id;
    }

    public static void imprimirPessoa(Pessoa[] quem, int key){
      int id = readId(opcoes[key],"imprimir");
      try{
        System.out.println("Nome:"+quem[id].getNome());
      }catch(NullPointerException e){
        System.out.println("Id não encontrado");
      }
    }

}
