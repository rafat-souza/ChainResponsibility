package SuporteCliente.Atendentes;

import SuporteCliente.Atendente;
import SuporteCliente.Chamados.TipoChamadoCobranca;

public class AtendenteFinanceiro extends Atendente {

    public AtendenteFinanceiro(Atendente superior) {
        listaChamados.add(TipoChamadoCobranca.getTipoChamadoCobranca());
        setAtendenteSuperior(superior);
    }

    public String getNivelAtendimento() {
        return "Atendimento Financeiro";
    }

}
