
public class Fornecedor extends Pessoa{

    private String nome_fantasia;

    private String razao_social;

    private int cnpj;

    private String fundacao;

    private String telefone;

    private String fax;

    public Fornecedor () {
    }

    public int getCnpj () {
        return cnpj;
    }

    public void setCnpj (int val) {
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

    public String getNome_fantasia () {
        return nome_fantasia;
    }

    public void setNome_fantasia (String val) {
        this.nome_fantasia = val;
    }

    public String getRazao_social () {
        return razao_social;
    }

    public void setRazao_social (String val) {
        this.razao_social = val;
    }
}

