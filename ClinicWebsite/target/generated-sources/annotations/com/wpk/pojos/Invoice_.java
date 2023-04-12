package com.wpk.pojos;

import com.wpk.pojos.Nurse;
import com.wpk.pojos.Prescription;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Date> createdDate;
    public static volatile SingularAttribute<Invoice, BigDecimal> totalPrice;
    public static volatile SingularAttribute<Invoice, Prescription> prescription;
    public static volatile SingularAttribute<Invoice, Nurse> nurse;
    public static volatile SingularAttribute<Invoice, Integer> id;

}