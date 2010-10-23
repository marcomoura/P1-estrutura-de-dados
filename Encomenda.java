
public class Encomenda {

    private ItemVenda[] itemVenda;

    private String data;

    private String hora;

    private String endereco;

    private Colaborador colaborador;

    private Cliente cliente;

    public Encomenda () {
    }

    public Cliente getCliente () {
        return cliente;
    }

    public void setCliente (Cliente val) {
        this.cliente = val;
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

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String val) {
        this.endereco = val;
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

