package com.wpk.pojos;

import com.wpk.pojos.PrescriptionDrug;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Drug.class)
public class Drug_ { 

    public static volatile SingularAttribute<Drug, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Drug, Integer> quantity;
    public static volatile ListAttribute<Drug, PrescriptionDrug> prescriptionDrugList;
    public static volatile SingularAttribute<Drug, String> name;
    public static volatile SingularAttribute<Drug, Integer> id;
    public static volatile SingularAttribute<Drug, Date> expiry;
    public static volatile SingularAttribute<Drug, Date> manufacturer;

}