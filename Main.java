/*
 * p1 de ED 
 * @author Marco Moura <email at marcomoura dot com>
 */

import java.util.Scanner;

public class Main {

    public static String[] opcoes = {"sair","colaboradores","clientes"};
    public static String[] acoes = {"retornar","cadastrar","excluir", "imprimir"};

    public static Colaborador[] colaboradores = new Colaborador[100];
    public static int count_colab = 0;

    public static Cliente[] clientes = new Cliente[100];
    public static int count_cliente = 0;

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

    public static int getOpcao(){
      System.out.println(">>Menu:");
      for(int i = 0; i < Main.opcoes.length; i++)
        System.out.println("  ["+(i)+"] "+ opcoes[i]);
      int opcao = inputInt("digite o numero");
      return opcao;
    }

    public static int getAcao(int opcao){
      
      System.out.println(">>Menu>>"+opcoes[opcao]);
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
            excluirPessoa(colaboradores);
            break;
        case 13:
            imprimirPessoa(colaboradores);
            break;
        case 21:
            cadastrarCliente();
            break;
        case 22:
            excluirPessoa(clientes);
            break;
        case 23:
            imprimirPessoa(clientes);
            break;
      }
    }

    public static void cadastrarColaborador(){
       System.out.println(">>Menu>>"+opcoes[1]+">>cadastrar::informe!\n");
       String nome = inputText("nome");
       String cpf = inputText("cpf");
       String endereco = inputText("endereco");
       String bairro = inputText("bairro");
       String cidade = inputText("cidade");
       String estado = inputText("estado");
       String cep = inputText("cep");
       String telefone = inputText("telefone");
       String email = inputText("email");
       String celular = inputText("celular");
       String data_nascimento = inputText("data de nascimentor");
       String desc_cursos = inputText("informe os cursos que participou");
        
       Colaborador novo = new Colaborador();
       novo.setNome(nome);   
       novo.setCpf(cpf);   
       novo.setEndereco(endereco);   
       novo.setBairro(bairro);   
       novo.setCidade(cidade);   
       novo.setEstado(estado);   
       novo.setCep(cep);   
       novo.setTelefone(telefone);   
       novo.setEmail(email);   
       novo.setCelular(celular);   
       novo.setData_nascimento(data_nascimento);   
        colaboradores[count_colab]= novo;
        count_colab++;
    }

    public static void cadastrarCliente(){
    
    }

    public static void excluirPessoa(Pessoa[] objeto){
       System.out.print(">>Menu>>"+opcoes[1]+">>excluir\n\n::");
      int id = inputInt("qual ID deseja exluir");
      objeto[id]=null;
    }
    
    public static void imprimirPessoa(Pessoa[] quem){
      System.out.print(">>Menu>>"+opcoes[1]+">>imprimir\n\n::");
      int id = inputInt("qual ID deseja imprimir");
      System.out.println("Nome:"+quem[id].getNome());
    }
}
