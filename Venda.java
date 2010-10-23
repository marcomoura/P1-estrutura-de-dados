
public class Venda {

    private ItemVenda[] itemVenda;

    private String data;

    private String hora;

    private Colaborador colaborador;

    public Venda () {
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

    public String getHora () {
        return hora;
    }

    public void setHora (String val) {
        this.hora = val;
    }

    public Produto[] getItemVenda () {
        return itemVenda;
    }

    public void setItemVenda (ItemVenda[] val) {
        this.itemVenda = val;
    }

}

