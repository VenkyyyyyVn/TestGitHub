package entity;

import entity.Stations;
import entity.TeamTrackingsPK;
import entity.Teams;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(TeamTrackings.class)
public class TeamTrackings_ { 

    public static volatile SingularAttribute<TeamTrackings, Date> startTime;
    public static volatile SingularAttribute<TeamTrackings, Teams> teams;
    public static volatile SingularAttribute<TeamTrackings, Stations> stations;
    public static volatile SingularAttribute<TeamTrackings, Integer> score;
    public static volatile SingularAttribute<TeamTrackings, TeamTrackingsPK> teamTrackingsPK;
    public static volatile SingularAttribute<TeamTrackings, Date> endTime;

}