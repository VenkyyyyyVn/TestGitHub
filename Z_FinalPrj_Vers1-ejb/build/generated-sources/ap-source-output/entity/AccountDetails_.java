package entity;

import entity.Accounts;
import entity.Groups;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(AccountDetails.class)
public class AccountDetails_ { 

    public static volatile SingularAttribute<AccountDetails, String> accLastN;
    public static volatile SingularAttribute<AccountDetails, String> phone;
    public static volatile SingularAttribute<AccountDetails, Groups> groupID;
    public static volatile SingularAttribute<AccountDetails, Accounts> accounts;
    public static volatile SingularAttribute<AccountDetails, String> accFirstN;
    public static volatile SingularAttribute<AccountDetails, String> doB;
    public static volatile SingularAttribute<AccountDetails, String> email;
    public static volatile SingularAttribute<AccountDetails, String> address;
    public static volatile SingularAttribute<AccountDetails, String> company;
    public static volatile SingularAttribute<AccountDetails, Boolean> gender;
    public static volatile SingularAttribute<AccountDetails, String> accID;

}