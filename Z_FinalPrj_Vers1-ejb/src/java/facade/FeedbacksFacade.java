package facade;

import entity.Feedbacks;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class FeedbacksFacade extends AbstractFacade<Feedbacks> implements FeedbacksFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FeedbacksFacade() {
        super(Feedbacks.class);
    }

}
