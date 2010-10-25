
public class Fornecedor extends Pessoa{

    private String nome_fantasia;

    private String razao_social;

    private String cnpj;

    private String fundacao;

    private String fax;

    private String email;

    public String getEmail () {
        return email;
    }

    public void setEmail (String val) {
        this.email = val;
    }
    public String getCnpj () {
        return cnpj;
    }

    public void setCnpj (String val) {
        this.cnpj = val;
    }

    public String getFax () {
        return fax;
    }

    public void setFax (String val) {
        this.fax = val;
    }

    public String getFundacao () {
        return fundacao;
    }

    public void setFundacao (String val) {
        this.fundacao = val;
    }

    public String getNome() {
        return nome_fantasia;
    }

    public void setNome (String val) {
        this.nome_fantasia = val;
    }

    public String getRazao_social () {
        return razao_social;
    }

    public void setRazao_social (String val) {
        this.razao_social = val;
    }
}

