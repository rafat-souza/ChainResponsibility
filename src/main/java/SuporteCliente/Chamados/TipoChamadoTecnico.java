package SuporteCliente.Chamados;

import SuporteCliente.TipoChamado;

public class TipoChamadoTecnico implements TipoChamado {

    private static TipoChamadoTecnico tipoChamadoTecnico = new TipoChamadoTecnico();

    private TipoChamadoTecnico() {};

    public static TipoChamadoTecnico getTipoChamadoTecnico() {
        return tipoChamadoTecnico;
    }

}
