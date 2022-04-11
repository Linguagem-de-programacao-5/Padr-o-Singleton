import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Configuracao_VencimentoTest {

    @Test
    public  void deveRetornarTempoMininoTroca(){
        Configuracao_Vencimento.getConfigVencimento().setTempoMinParaTroca(6);
        assertEquals(6, Configuracao_Vencimento.getConfigVencimento().getTempoMinParaTroca());
    }

    @Test
    public  void deveRetornarLimiteTrocaUsuario(){
        Configuracao_Vencimento.getConfigVencimento().setLimiteTrocaUsuario(1);
        assertEquals(1, Configuracao_Vencimento.getConfigVencimento().getLimiteTrocaUsuario());
    }

    @Test
    public  void deveRetornarLimiteTrocaEmpresa(){
        Configuracao_Vencimento.getConfigVencimento().setLimiteTrocaEmpresa(2);
        assertEquals(2, Configuracao_Vencimento.getConfigVencimento().getLimiteTrocaEmpresa());
    }

}