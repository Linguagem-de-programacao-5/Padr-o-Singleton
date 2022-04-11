public class Configuracao_Vencimento {

    private Configuracao_Vencimento(){}

    private static Configuracao_Vencimento configVencimento = new Configuracao_Vencimento();

    public static Configuracao_Vencimento getConfigVencimento(){
        return configVencimento;
    }

    private int tempoMinParaTroca;
    private int limiteTrocaUsuario;
    private int limiteTrocaEmpresa;

    public int getTempoMinParaTroca() {
        return tempoMinParaTroca;
    }

    public void setTempoMinParaTroca(int tempoMinParaTroca) {
        this.tempoMinParaTroca = tempoMinParaTroca;
    }

    public int getLimiteTrocaUsuario() {
        return limiteTrocaUsuario;
    }

    public void setLimiteTrocaUsuario(int limiteTrocaUsuario) {
        this.limiteTrocaUsuario = limiteTrocaUsuario;
    }

    public int getLimiteTrocaEmpresa() {
        return limiteTrocaEmpresa;
    }

    public void setLimiteTrocaEmpresa(int limiteTrocaEmpresa) {
        this.limiteTrocaEmpresa = limiteTrocaEmpresa;
    }
}
