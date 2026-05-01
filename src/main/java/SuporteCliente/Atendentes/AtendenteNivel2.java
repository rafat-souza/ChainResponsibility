package SuporteCliente.Atendentes;

import SuporteCliente.Atendente;
import SuporteCliente.Chamados.TipoChamadoTecnico;

public class AtendenteNivel2 extends Atendente {

    public AtendenteNivel2(Atendente superior) {
        listaChamados.add(TipoChamadoTecnico.getTipoChamadoTecnico());
        setAtendenteSuperior(superior);
    }

    public String getNivelAtendimento() {
        return "Atendimento Nível 2 - Suporte Técnico";
    }

}
