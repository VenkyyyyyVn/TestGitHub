package entity;

import entity.AccountDetails;
import entity.Games;
import entity.Stations;
import entity.Teams;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Accounts.class)
public class Accounts_ { 

    public static volatile CollectionAttribute<Accounts, Stations> stationsCollection;
    public static volatile CollectionAttribute<Accounts, Teams> teamsCollection;
    public static volatile CollectionAttribute<Accounts, Games> gamesCollection;
    public static volatile SingularAttribute<Accounts, Boolean> status;
    public static volatile SingularAttribute<Accounts, AccountDetails> accountDetails;
    public static volatile SingularAttribute<Accounts, Boolean> roles;
    public static volatile SingularAttribute<Accounts, String> accID;
    public static volatile SingularAttribute<Accounts, String> password;

}