/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import entity.AccountDetails;
import entity.Groups;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author venky
 */
@Local
public interface AccountDetailsFacadeLocal {

    void create(AccountDetails accountDetails);

    void edit(AccountDetails accountDetails);

    void remove(AccountDetails accountDetails);

    AccountDetails find(Object id);

    List<AccountDetails> findAll();

    List<AccountDetails> findRange(int[] range);

    int count();
    
    boolean updateAccountDetails(String accID, String fName, String lName, boolean gender, String dob, String email, String phone, String address, String company, String group);
    
}
