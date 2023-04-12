package com.wpk.pojos;

import com.wpk.pojos.Doctor;
import com.wpk.pojos.Nurse;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Medical.class)
public class Medical_ { 

    public static volatile ListAttribute<Medical, Doctor> doctor;
    public static volatile SingularAttribute<Medical, String> image;
    public static volatile SingularAttribute<Medical, String> name;
    public static volatile ListAttribute<Medical, Nurse> nurse;
    public static volatile SingularAttribute<Medical, String> description;
    public static volatile SingularAttribute<Medical, Integer> id;

}