
public class Pessoa {

    private String nome;

    private String cpf;

    private String endereco;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private String telefone;

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

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String val) {
        this.cpf = val;
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

