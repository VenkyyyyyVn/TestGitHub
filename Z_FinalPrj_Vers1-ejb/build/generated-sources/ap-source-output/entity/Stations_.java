package entity;

import entity.Accounts;
import entity.Games;
import entity.TeamTrackings;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Stations.class)
public class Stations_ { 

    public static volatile SingularAttribute<Stations, String> locationStation;
    public static volatile SingularAttribute<Stations, String> keyQuestion;
    public static volatile SingularAttribute<Stations, Games> gameID;
    public static volatile SingularAttribute<Stations, String> stationID;
    public static volatile SingularAttribute<Stations, Accounts> accID;
    public static volatile CollectionAttribute<Stations, TeamTrackings> teamTrackingsCollection;

}