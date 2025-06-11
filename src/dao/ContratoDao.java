package dao;

public class ContratoDao implements IContratoDao{

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona no banco: SALVAR");

    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não funciona no banco: BUSCAR");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona no banco: EXCLUIR");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não funciona no banco: ATUALIZAR");
    }

}
