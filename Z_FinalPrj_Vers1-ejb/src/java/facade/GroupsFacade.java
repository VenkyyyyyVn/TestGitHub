package facade;

import entity.Groups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class GroupsFacade extends AbstractFacade<Groups> implements GroupsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupsFacade() {
        super(Groups.class);
    }

}
