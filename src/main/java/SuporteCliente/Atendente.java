package SuporteCliente;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaChamados = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getNivelAtendimento();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getNivelAtendimento();
        }
        else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.resolverChamado(chamado);
            }
            else
            {
                return "Sem solução";
            }
        }
    }

}
