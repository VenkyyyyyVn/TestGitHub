package facade;

import entity.Teams;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class TeamsFacade extends AbstractFacade<Teams> implements TeamsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeamsFacade() {
        super(Teams.class);
    }

}
