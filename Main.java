/*
 * p1 de ED 
 * @author Marco Moura <email at marcomoura dot com>
 */

import java.util.Scanner;

public class Main {

    public static String[] opcoes = {"colaboradores","clientes"};
    public static String[] acoes = {"cadastrar","excluir", "imprimir"};

    public static void main(String[] args) {
     int opcao = getOpcao(); 
     int acao = getAcao(opcao); 
     controller(acao);
    }

    public static int getOpcao(){
    
      System.out.println("Menu:");
      for(int i = 0; i < Main.opcoes.length; i++)
        System.out.println("  ["+(i+1)+"] "+ opcoes[i]);
      int opcao = inputInt("digite o numero");
      return opcao-1;
    }

    public static int getAcao(int opcao){
      
      System.out.println(">>"+opcoes[opcao]);
      for(int i = 0; i < Main.acoes.length; i++)
        System.out.println("  ["+(i+1)+"] "+ acoes[i]);

      int acao = inputInt("o que deseja?");
      return acao;
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
      cadastrarColaborador();
    }

    public static void cadastrarColaborador(){
       String nome = inputText("nome");
       String cpf = inputText("cpf");
       String endereco = inputText("endereco");
       String bairro = inputText("bairro");
       String cidade = inputText("cidade");
       String estado = inputText("estado");
       String cep = inputText("cep");
       String telefone = inputText("telefone");
       String email = inputText("email");
    }
}
