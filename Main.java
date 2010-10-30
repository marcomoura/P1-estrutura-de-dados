/*
 * p1 de ED
 *
 * desenvolver um programa na linguagem Java que permita ao usuário
 * cadastrar, excluir e imprimir
 * colaboradores, clientes, fornecedores, produtos, compras, vendas,  e encomendas.
 * @author Marco Moura <email at marcomoura dot com>
 */

import java.util.Scanner;

public class Main {

    public static String[] opcoes = {"sair","colaboradores","clientes", "fornecedor", "cargo", "produto", "compras","vendas","encomendas"};
    public static String[] acoes = {"retornar","novo","excluir", "mostrar"};
    public static int opcao;
    public static int acao;

    public static Colaborador[] colaboradores = new Colaborador[100];
    public static int count_colab = 0;

    public static Cliente[] clientes = new Cliente[100];
    public static int count_cliente = 0;

    public static Fornecedor[] fornecedores = new Fornecedor[100];
    public static int count_fornecedor = 0;

    public static CargoColaborador[] cargoColaboradores = new CargoColaborador[100];
    public static int count_cargo_colaboradores = 0;

    public static Cargo[] cargos = new Cargo[100];
    public static int count_cargo = 0;

    public static Produto[] produtos = new Produto[100];
    public static int count_produto = 0;

    public static Compra[] compra = new Compra[100];
    public static int count_compra = 0;

    public static Venda[] vendas = new Venda[100];
    public static int count_vendas = 0;

    public static Encomenda[] encomendas = new Encomenda[100];
    public static int count_encomendas = 0;

    public static void main(String[] args) {
      do{
      legend();
       opcao = getOpcao(); 
       if(opcao == 0)
         return;
      legend(opcoes[opcao]);
       acao = getAcao(opcao); 
       if(acao>10){
         legend(opcoes[opcao]+">>"+acoes[acao-10*opcao]);
         controller();
       }
      }while(true);
    }
    
    public static void legend(){
      System.out.println("\n::Menu");
    }

    public static void legend(String _legend){
      legend();
      System.out.println(">>"+_legend);
    }

    public static int getOpcao(){
      for(int i = 0; i < Main.opcoes.length; i++)
        System.out.println("  ["+(i)+"] "+ opcoes[i]);
      return inputInt("digite o numero");
    }

    public static int getAcao(int opcao){
      for(int i = 0; i < Main.acoes.length; i++)
        System.out.println("  ["+(i)+"] "+ acoes[i]);
      int _acao = inputInt("   ^ qual ação?");
      return 10*opcao+_acao;
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

    public static void controller(){
      switch(acao){
        case 11:
            cadastrarColaborador();  break;
        case 12:
            excluirColaborador();    break;
        case 13:
            imprimirColaborador();   break;
        case 21:
            cadastrarCliente();      break;
        case 22:
            excluirCliente();        break;
        case 23:
            imprimirCliente();       break;
        case 31:
            cadastrarFornecedor();   break;
        case 32:
            excluirFornecedor();     break;
        case 33:
            imprimirFornecedor();    break;
        case 41:
            cadastrarCargo();        break;
        case 42:
            excluirCargo();          break;
        case 43:
            imprimirCargo();         break;
        case 51:
            cadastrarProduto();      break;
        case 52:
            excluirProduto();        break;
        case 53:
            imprimirProduto();       break;
        case 61:
            cadastrarCompra();      break;
        case 62:
            excluirCompra();        break;
        case 63:
            imprimirCompra();       break;
        case 71:
            cadastrarVenda();      break;
        case 72:
            excluirVenda();        break;
        case 73:
            imprimirVenda();       break;
        case 81:
            cadastrarEncomenda();      break;
        case 82:
            excluirEncomenda();        break;
        case 83:
            imprimirEncomenda();       break;
        case 151:
            cargoColaborador();      break;
      }
    }

    public static void cargoColaborador(){
      int id_colaborador = readId("do colaborador");
      int id_cargo = readId("do cargo");
      String inicio = inputText("data inicial");
      String fim = inputText("data final");
      CargoColaborador novo = new CargoColaborador();
      novo.setColaborador(colaboradores[id_colaborador]);
      novo.setCargo(cargos[id_cargo]);
      novo.setInicio(inicio);
      novo.setFim(fim);
      cargoColaboradores[count_cargo] = novo;
      count_cargo++;
    }

    public static void cadastrarColaborador(){
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
      int id = readId();
      colaboradores[id] = colaboradores[count_colab - 1];
      colaboradores[count_colab - 1] = null;
      count_colab--;
    }

    public static void excluirCliente(){
      int id = readId();
      clientes[id] = clientes[count_cliente - 1];
      clientes[count_cliente - 1] = null;
      count_cliente--;
    }

    public static void excluirFornecedor(){
      int id = readId();
      fornecedores[id] = fornecedores[count_fornecedor - 1];
      fornecedores[count_fornecedor - 1] = null;
      count_fornecedor--;
    }

    public static int readId(){
      int id = inputInt("informe o ID : ");
      return id;
    }

    public static int readId(String label){
      int id = inputInt("informe o ID "+label+": ");
      return id;
    }

    public static void imprimirColaborador(){
      try{
        int id = imprimirPessoa(colaboradores);
        System.out.println(
                "Cpf:"+colaboradores[id].getCpf()+"\n"+
                "Email:"+colaboradores[id].getEmail()+"\n"+
                "Celular:"+colaboradores[id].getCelular()+"\n"+
                "Data nascimento:"+colaboradores[id].getData_nascimento()+"\n"+
                "Cursos:"+colaboradores[id].getDesc_cursos()+"\n"
                );
      }catch(NullPointerException e){
        System.out.println("Id não encontrado");
      }
    }

    public static void imprimirCliente(){
      try{
        int id = imprimirPessoa(clientes);
        System.out.println("Cpf:"+clientes[id].getCpf()+"\n");
      }catch(NullPointerException e){
        System.out.println("Id não encontrado");
      }
    }

    public static void imprimirFornecedor(){
      try{
        int id = imprimirPessoa(fornecedores);
        System.out.println(
                "CNPJ:"+fornecedores[id].getCnpj()+"\n"+
                "Email:"+fornecedores[id].getEmail()+"\n"+
                "Razao_social:"+fornecedores[id].getRazao_social()+"\n"+
                "Fundacao:"+fornecedores[id].getFundacao()+"\n"+
                "Fax:"+fornecedores[id].getFax()
                );
      }catch(NullPointerException e){
        System.out.println("Id não encontrado");
      }
    }

    public static int imprimirPessoa(Pessoa[] quem){
      int id = readId();
      try{
        System.out.println(
                "Nome:"+quem[id].getNome()+"\n"+
                "Endereco:"+quem[id].getEndereco()+"\n"+
                "Bairro:"+quem[id].getBairro()+"\n"+
                "Cidade:"+quem[id].getCidade()+"\n"+
                "Estado:"+quem[id].getEstado()+"\n"+
                "Cep:"+quem[id].getCep()+"\n"+
                "Telefone:"+quem[id].getTelefone()+"\n"
                );
      }catch(NullPointerException e){
        System.out.println("Id não encontrado");
      }
      return id;
    }

    public static void cadastrarCargo(){
      String descricao = inputText("descrição");
      int bonificacao = inputInt("bonificação");

      Cargo novo = new Cargo();
      novo.setDescricao(descricao);
      novo.setBonificacao(bonificacao);
      cargos[count_cargo]= novo;
      count_cargo++;
    }

    public static void imprimirCargo(){
      int id = readId();
      try{
        System.out.println("\nNome:"+cargos[id].getDescricao()+
                "\nBonificacao:"+cargos[id].getBonificacao());
      }catch(NullPointerException e){
        notFound();
      }
    }

    public static void excluirCargo(){
      try{
          int id = readId();
          cargos[id] = cargos[count_cargo - 1];
          cargos[count_cargo - 1] = null;
          count_cargo--;
      }catch(ArrayIndexOutOfBoundsException e){
        notFound();
      }
    }

    public static void cadastrarProduto(){
      String nome = inputText("nome");
      int preco = inputInt("preco");

      Produto novo = new Produto();
      novo.setNome(nome);
      novo.setPreco(preco);
      produtos[count_produto]= novo;
      count_produto++;
    }

    public static void imprimirProduto(){
      int id = readId();
      try{
        System.out.println("\nNome:"+produtos[id].getNome()+
                "\nPreço:"+produtos[id].getPreco());
      }catch(NullPointerException e){
        notFound();
      }
    }

    public static void excluirProduto(){
      try{
          int id = readId();
          produtos[id] = produtos[count_produto - 1];
          produtos[count_produto - 1] = null;
          count_produto--;
      }catch(ArrayIndexOutOfBoundsException e){
        notFound();
      }
    }

    public static ItemVenda[] cadastrarItemVenda(){
        ItemVenda[] itens = new ItemVenda[100];
        boolean loop = true;
        do{
            int id_prod = readId("produto");
            int quant = inputInt("quantidade");

            ItemVenda novo = new ItemVenda();
            novo.setProduto(produtos[id_prod]);
            novo.setQuantidade(quant);
            if(0==inputInt("0=continuar cadastro de compra || 1=adicionar outro produto"))
                loop = false;

        }while(loop==true);
        return itens;
    }

    public static void cadastrarCompra(){

    ItemVenda[] itemVenda = cadastrarItemVenda();


    int id_forn = readId("fornecedor");
    int id_cola = readId("colaborador");
    String data = inputText("data");
      String hora = inputText("hora");

      Compra novo = new Compra();
      novo.setData(data);
      novo.setHora(hora);
      novo.setFornecedor(fornecedores[id_forn]);
      novo.setColaborador(colaboradores[id_cola]);
      novo.setItemVenda(itemVenda);
      compra[count_compra]= novo;
      count_compra++;
    }

    public static void imprimirCompra(){
      int id = readId();
      try{
        System.out.println("\nNome:"+produtos[id].getNome()+
                "\nPreço:"+produtos[id].getPreco());
      }catch(NullPointerException e){
        notFound();
      }
    }

    public static void excluirCompra(){
      try{
          int id = readId();
          produtos[id] = produtos[count_produto - 1];
          produtos[count_produto - 1] = null;
          count_produto--;
      }catch(ArrayIndexOutOfBoundsException e){
        notFound();
      }
    }

    public static void cadastrarVenda(){

    ItemVenda[] itemVenda = cadastrarItemVenda();


    int id_cola = readId("colaborador");
    String data = inputText("data");
      String hora = inputText("hora");

      Venda novo = new Venda();
      novo.setData(data);
      novo.setHora(hora);
      novo.setColaborador(colaboradores[id_cola]);
      novo.setItemVenda(itemVenda);
      vendas[count_vendas]= novo;
      count_vendas++;
    }

    public static void imprimirVenda(){
      int id = readId();
      try{
        System.out.println("\nColaborador:"+vendas[id].getColaborador()+
                "\nHora:"+vendas[id].getHora());
      }catch(NullPointerException e){
        notFound();
      }
    }

    public static void excluirVenda(){
      try{
          int id = readId();
          vendas[id] = vendas[count_vendas - 1];
          vendas[count_vendas - 1] = null;
          count_vendas--;
      }catch(ArrayIndexOutOfBoundsException e){
        notFound();
      }
    }

    public static void cadastrarEncomenda(){

    ItemVenda[] itemVenda = cadastrarItemVenda();


    int id_cola = readId("colaborador");
    int id_cliente = readId("cliente");
    String data = inputText("data");
      String hora = inputText("hora");

      Encomenda novo = new Encomenda();
      novo.setData(data);
      novo.setHora(hora);
      novo.setCliente(clientes[id_cliente]);
      novo.setColaborador(colaboradores[id_cola]);
      novo.setItemVenda(itemVenda);
      encomendas[count_encomendas]= novo;
      count_encomendas++;
    }

    public static void imprimirEncomenda(){
      int id = readId();
      try{
        System.out.println("\nColaborador:"+encomendas[id].getColaborador()+
                "\nHora:"+encomendas[id].getHora());
      }catch(NullPointerException e){
        notFound();
      }
    }

    public static void excluirEncomenda(){
      try{
          int id = readId();
          encomendas[id] = encomendas[count_encomendas - 1];
          encomendas[count_encomendas - 1] = null;
          count_encomendas--;
      }catch(ArrayIndexOutOfBoundsException e){
        notFound();
      }
    }

    public static void notFound(){
        System.out.println("Não encontrado registo com este ID");
    }
}
