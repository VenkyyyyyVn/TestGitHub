package facade;

import entity.TeamTrackings;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class TeamTrackingsFacade extends AbstractFacade<TeamTrackings> implements TeamTrackingsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeamTrackingsFacade() {
        super(TeamTrackings.class);
    }

}
