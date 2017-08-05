package facade;

import entity.Accounts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class AccountsFacade extends AbstractFacade<Accounts> implements AccountsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountsFacade() {
        super(Accounts.class);
    }

    @Override
    public Accounts checkLoginAccounts(String id, String password) {
        Query q = em.createQuery("SELECT a FROM Accounts a WHERE a.accID = :accID AND a.password = :password");
        q.setParameter("accID", id);
        q.setParameter("password", password);
        Accounts account = new Accounts();
        try {
            account = (Accounts) q.getSingleResult();
            return account;
        } catch (Exception e) {
            e.printStackTrace();
            return account;
        }
    }

    @Override
    public boolean changePassword(String id, String password) {
        boolean changePassword = false;
        Accounts account = new Accounts();
        try {
            account = find(id);
            if(account!=null){
                account.setPassword(password);
                edit(account);
                changePassword = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return changePassword;
    }

}
