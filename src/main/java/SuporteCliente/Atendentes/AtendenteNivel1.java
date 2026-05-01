package SuporteCliente.Atendentes;

import SuporteCliente.Atendente;
import SuporteCliente.Chamados.TipoChamadoDuvida;

public class AtendenteNivel1 extends Atendente {

    public AtendenteNivel1(Atendente superior) {
        listaChamados.add(TipoChamadoDuvida.getTipoChamadoDuvida());
        setAtendenteSuperior(superior);
    }

    public String getNivelAtendimento() {
        return "Atendimento Nível 1 - Triagem";
    }

}
