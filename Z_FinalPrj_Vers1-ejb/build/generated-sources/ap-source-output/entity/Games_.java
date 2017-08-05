package entity;

import entity.Accounts;
import entity.Stations;
import entity.Teams;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Games.class)
public class Games_ { 

    public static volatile CollectionAttribute<Games, Stations> stationsCollection;
    public static volatile CollectionAttribute<Games, Teams> teamsCollection;
    public static volatile SingularAttribute<Games, String> gameID;
    public static volatile SingularAttribute<Games, Boolean> status;
    public static volatile SingularAttribute<Games, String> description;
    public static volatile SingularAttribute<Games, Boolean> customWin;
    public static volatile SingularAttribute<Games, String> gameName;
    public static volatile SingularAttribute<Games, Accounts> accID;

}