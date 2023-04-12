package com.wpk.pojos;

import com.wpk.pojos.Drug;
import com.wpk.pojos.Prescription;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(PrescriptionDrug.class)
public class PrescriptionDrug_ { 

    public static volatile SingularAttribute<PrescriptionDrug, Integer> quantity;
    public static volatile SingularAttribute<PrescriptionDrug, Prescription> prescription;
    public static volatile SingularAttribute<PrescriptionDrug, String> userGuide;
    public static volatile SingularAttribute<PrescriptionDrug, Integer> id;
    public static volatile SingularAttribute<PrescriptionDrug, Drug> drug;

}