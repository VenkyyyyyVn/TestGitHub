package facade;

import entity.AccountDetails;
import entity.Groups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless

public class AccountDetailsFacade extends AbstractFacade<AccountDetails> implements AccountDetailsFacadeLocal {
    @PersistenceContext(unitName = "Z_FinalPrj_Vers1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountDetailsFacade() {
        super(AccountDetails.class);
    }
    
    private GroupsFacadeLocal groupsFacadeLocal;

    //TODO do it later
    @Override
    public boolean updateAccountDetails(String accID, String fName, String lName, boolean gender, String dob, String email, String phone, String address, String company, String group) {
        boolean ckUpdate = false;
        AccountDetails account = new AccountDetails();
        Groups groups = groupsFacadeLocal.find(group);
        try {
            account = find(accID);
            
            if(account!=null){
                account.setAccFirstN(fName);
                account.setAccLastN(lName);
                account.setGender(gender);
                account.setDoB(dob);
                account.setEmail(email);
                account.setPhone(phone);
                account.setAddress(address);
                account.setCompany(company);
                account.setGroupID(groups);
                
                edit(account);
                ckUpdate = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return ckUpdate;
    }

}
