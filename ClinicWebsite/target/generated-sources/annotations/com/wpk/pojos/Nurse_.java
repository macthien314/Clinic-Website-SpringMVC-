package com.wpk.pojos;

import com.wpk.pojos.Invoice;
import com.wpk.pojos.Medical;
import com.wpk.pojos.MedicalExaminationCard;
import com.wpk.pojos.ServiceInvoice;
import com.wpk.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Nurse.class)
public class Nurse_ { 

    public static volatile SingularAttribute<Nurse, String> lastName;
    public static volatile SingularAttribute<Nurse, String> image;
    public static volatile SingularAttribute<Nurse, Medical> medical;
    public static volatile SingularAttribute<Nurse, String> gender;
    public static volatile SingularAttribute<Nurse, Date> birthDate;
    public static volatile SingularAttribute<Nurse, String> firstName;
    public static volatile ListAttribute<Nurse, Invoice> invoices;
    public static volatile SingularAttribute<Nurse, String> phone;
    public static volatile ListAttribute<Nurse, ServiceInvoice> serviceInvoiceList;
    public static volatile ListAttribute<Nurse, MedicalExaminationCard> medicalExaminationCardList;
    public static volatile SingularAttribute<Nurse, Integer> id;
    public static volatile SingularAttribute<Nurse, User> user;
    public static volatile SingularAttribute<Nurse, String> email;

}