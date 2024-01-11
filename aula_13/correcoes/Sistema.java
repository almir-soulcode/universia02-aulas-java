package aula_13.correcoes;

enum StatusSistema {
    EXECUCAO, FALHA, PAUSADO
}

public class Sistema {
    private StatusSistema status;

    public Sistema() {
        this.status = StatusSistema.PAUSADO;
    }

    public void setStatus(StatusSistema novoStatus) {
        status = novoStatus;
    }

    public void notificar() {
        String mensagem = "";

        switch(status) {
            case EXECUCAO:
                mensagem = "O sistema está em execução!";
                break;
            case PAUSADO:
                mensagem = "O sistema está em pausa!";
                break;
            case FALHA:
                mensagem = "O sistema está com problemas";
                break;
        }

        System.out.println(mensagem);
    }
}
