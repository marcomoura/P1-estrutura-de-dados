

public class Colaborador extends Pessoa{

    private String celular;

    private String data_nascimento;

    private String desc_cursos;

    private String email;

    public String getEmail () {
        return email;
    }

    public void setEmail (String val) {
        this.email = val;
    }

    public String getData_nascimento () {
        return data_nascimento;
    }

    public void setData_nascimento (String val) {
        this.data_nascimento = val;
    }

    public String getCelular () {
        return celular;
    }

    public void setCelular (String val) {
        this.celular = val;
    }

    public String getDesc_cursos () {
        return desc_cursos;
    }

    public void setDesc_cursos (String val) {
        this.desc_cursos = val;
    }


}

