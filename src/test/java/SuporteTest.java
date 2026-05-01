import SuporteCliente.Atendente;
import SuporteCliente.Atendentes.AtendenteFinanceiro;
import SuporteCliente.Atendentes.AtendenteNivel1;
import SuporteCliente.Atendentes.AtendenteNivel2;
import SuporteCliente.Atendentes.AtendenteNivel3;
import SuporteCliente.Chamado;
import SuporteCliente.Chamados.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuporteTest {

    Atendente financeiro;
    Atendente nivel3;
    Atendente nivel2;
    Atendente nivel1;

    @BeforeEach
    void setUp() {
        financeiro = new AtendenteFinanceiro(null);
        nivel3 = new AtendenteNivel3(financeiro);
        nivel2 = new AtendenteNivel2(nivel3);
        nivel1 = new AtendenteNivel1(nivel2);
    }

    @Test
    void deveRetornarAtendimentoNivel1ParaDuvida() {
        Chamado chamado = new Chamado(TipoChamadoDuvida.getTipoChamadoDuvida());
        assertEquals("Atendimento Nível 1 - Triagem", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveRetornarAtendimentoNivel2ParaTecnico() {
        Chamado chamado = new Chamado(TipoChamadoTecnico.getTipoChamadoTecnico());
        assertEquals("Atendimento Nível 2 - Suporte Técnico", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveRetornarAtendimentoNivel3ParaBug() {
        Chamado chamado = new Chamado(TipoChamadoBug.getTipoChamadoBug());
        assertEquals("Atendimento Nível 3 - Desenvolvimento", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveRetornarAtendimentoFinanceiroParaCobranca() {
        Chamado chamado = new Chamado(TipoChamadoCobranca.getTipoChamadoCobranca());
        assertEquals("Atendimento Financeiro", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveRetornarSemSolucaoParaChamadoDesconhecido() {
        Chamado chamado = new Chamado(TipoChamadoDesconhecido.getTipoChamadoDesconhecido());
        assertEquals("Sem solução", nivel1.resolverChamado(chamado));
    }

}
