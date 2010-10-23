
public class Pessoa {

    private String nome;

    private int cpf;

    private String endereco;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String telefone;

    private String email;

    public Pessoa () {
    }

    public String getBairro () {
        return bairro;
    }

    public void setBairro (String val) {
        this.bairro = val;
    }

    public String getCep () {
        return cep;
    }

    public void setCep (String val) {
        this.cep = val;
    }

    public String getCidade () {
        return cidade;
    }

    public void setCidade (String val) {
        this.cidade = val;
    }

    public int getCpf () {
        return cpf;
    }

    public void setCpf (int val) {
        this.cpf = val;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String val) {
        this.email = val;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String val) {
        this.endereco = val;
    }

    public String getEstado () {
        return estado;
    }

    public void setEstado (String val) {
        this.estado = val;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String val) {
        this.nome = val;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String val) {
        this.telefone = val;
    }

}

