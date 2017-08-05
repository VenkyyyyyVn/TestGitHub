package facade;

import entity.Games;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class GamesFacade extends AbstractFacade<Games> implements GamesFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GamesFacade() {
        super(Games.class);
    }

}
