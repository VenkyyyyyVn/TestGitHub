package entity;

import entity.AccountDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-08-05T10:28:36")
@StaticMetamodel(Groups.class)
public class Groups_ { 

    public static volatile SingularAttribute<Groups, String> groupName;
    public static volatile SingularAttribute<Groups, String> groupID;
    public static volatile SingularAttribute<Groups, String> description;
    public static volatile CollectionAttribute<Groups, AccountDetails> accountDetailsCollection;

}