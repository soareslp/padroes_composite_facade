package facade;

public class Cliente {

    public boolean alta() {
        return ClienteFacade.verificarPendenciasDeAlta(this);
    }
}
