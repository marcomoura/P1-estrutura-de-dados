

public class Compra {

    private Fornecedor fornecedor;

    private ItemVenda[] itemVenda;

    private String data;

    private String hora;

    private Colaborador colaborador;

    public Compra () {
    }

    public Colaborador getColaborador () {
        return colaborador;
    }

    public void setColaborador (Colaborador val) {
        this.colaborador = val;
    }

    public String getData () {
        return data;
    }

    public void setData (String val) {
        this.data = val;
    }

    public Fornecedor getFornecedor () {
        return fornecedor;
    }

    public void setFornecedor (Fornecedor val) {
        this.fornecedor = val;
    }

    public String getHora () {
        return hora;
    }

    public void setHora (String val) {
        this.hora = val;
    }

    public ItemVenda[] getItemVenda () {
        return itemVenda;
    }

    public void setItemVenda (ItemVenda[] val) {
        this.itemVenda = val;
    }

}

