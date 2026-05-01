package SuporteCliente.Chamados;

import SuporteCliente.TipoChamado;

public class TipoChamadoCobranca implements TipoChamado {

    private static TipoChamadoCobranca tipoChamadoCobranca = new TipoChamadoCobranca();

    private TipoChamadoCobranca() {};

    public static TipoChamadoCobranca getTipoChamadoCobranca() {
        return tipoChamadoCobranca;
    }

}
