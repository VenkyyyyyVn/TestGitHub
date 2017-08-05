package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Feedbacks.class)
public class Feedbacks_ { 

    public static volatile SingularAttribute<Feedbacks, String> sender;
    public static volatile SingularAttribute<Feedbacks, String> content;
    public static volatile SingularAttribute<Feedbacks, Integer> flag;
    public static volatile SingularAttribute<Feedbacks, String> receiver;
    public static volatile SingularAttribute<Feedbacks, String> subject;
    public static volatile SingularAttribute<Feedbacks, Date> sentDate;
    public static volatile SingularAttribute<Feedbacks, String> feedBackID;

}