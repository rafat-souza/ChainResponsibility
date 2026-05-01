package SuporteCliente.Atendentes;

import SuporteCliente.Atendente;
import SuporteCliente.Chamados.TipoChamadoBug;

public class AtendenteNivel3 extends Atendente {

    public AtendenteNivel3(Atendente superior) {
        listaChamados.add(TipoChamadoBug.getTipoChamadoBug());
        setAtendenteSuperior(superior);
    }

    public String getNivelAtendimento() {
        return "Atendimento Nível 3 - Desenvolvimento";
    }

}
