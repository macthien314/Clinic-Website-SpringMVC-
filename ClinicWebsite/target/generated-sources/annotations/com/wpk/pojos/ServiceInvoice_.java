package com.wpk.pojos;

import com.wpk.pojos.Nurse;
import com.wpk.pojos.Patient;
import com.wpk.pojos.Services;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(ServiceInvoice.class)
public class ServiceInvoice_ { 

    public static volatile SingularAttribute<ServiceInvoice, Date> createdDate;
    public static volatile SingularAttribute<ServiceInvoice, Patient> patient;
    public static volatile SingularAttribute<ServiceInvoice, Services> service;
    public static volatile SingularAttribute<ServiceInvoice, BigDecimal> fee;
    public static volatile SingularAttribute<ServiceInvoice, Nurse> nurse;
    public static volatile SingularAttribute<ServiceInvoice, Integer> id;

}