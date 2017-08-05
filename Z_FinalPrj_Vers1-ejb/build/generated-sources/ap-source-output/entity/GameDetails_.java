package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(GameDetails.class)
public class GameDetails_ { 

    public static volatile SingularAttribute<GameDetails, Date> startTime;
    public static volatile SingularAttribute<GameDetails, String> locationEnd;
    public static volatile SingularAttribute<GameDetails, String> gameID;
    public static volatile SingularAttribute<GameDetails, Date> endTime;
    public static volatile SingularAttribute<GameDetails, String> locationStart;
    public static volatile SingularAttribute<GameDetails, Integer> amtS;
    public static volatile SingularAttribute<GameDetails, Integer> amtP;

}