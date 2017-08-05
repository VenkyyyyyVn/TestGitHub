package entity;

import entity.Accounts;
import entity.Games;
import entity.TeamTrackings;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Teams.class)
public class Teams_ { 

    public static volatile SingularAttribute<Teams, String> teamName;
    public static volatile CollectionAttribute<Teams, Accounts> accountsCollection;
    public static volatile SingularAttribute<Teams, Games> gameID;
    public static volatile SingularAttribute<Teams, String> teamID;
    public static volatile SingularAttribute<Teams, Boolean> win;
    public static volatile CollectionAttribute<Teams, TeamTrackings> teamTrackingsCollection;

}