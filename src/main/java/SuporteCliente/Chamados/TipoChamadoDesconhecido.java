package SuporteCliente.Chamados;

import SuporteCliente.TipoChamado;

public class TipoChamadoDesconhecido implements TipoChamado {

    private static TipoChamadoDesconhecido tipoChamadoDesconhecido = new TipoChamadoDesconhecido();

    private TipoChamadoDesconhecido() {};

    public static TipoChamadoDesconhecido getTipoChamadoDesconhecido() {
        return tipoChamadoDesconhecido;
    }

}
