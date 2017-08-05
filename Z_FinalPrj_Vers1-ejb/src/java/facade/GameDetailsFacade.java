package facade;

import entity.GameDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class GameDetailsFacade extends AbstractFacade<GameDetails> implements GameDetailsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameDetailsFacade() {
        super(GameDetails.class);
    }

}
