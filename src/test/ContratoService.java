package test;

import dao.IContratoDao;
import service.IContratoService;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }

}
