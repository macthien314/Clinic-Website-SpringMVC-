package com.wpk.pojos;

import com.wpk.pojos.Appointment;
import com.wpk.pojos.MedicalExaminationCard;
import com.wpk.pojos.Prescription;
import com.wpk.pojos.ServiceInvoice;
import com.wpk.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> lastName;
    public static volatile SingularAttribute<Patient, String> image;
    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, String> gender;
    public static volatile ListAttribute<Patient, Prescription> prescriptionList;
    public static volatile ListAttribute<Patient, Appointment> appointmentList;
    public static volatile SingularAttribute<Patient, Date> birthDate;
    public static volatile SingularAttribute<Patient, String> firstName;
    public static volatile SingularAttribute<Patient, String> phone;
    public static volatile ListAttribute<Patient, ServiceInvoice> serviceInvoiceList;
    public static volatile SingularAttribute<Patient, Integer> id;
    public static volatile SingularAttribute<Patient, User> user;
    public static volatile SingularAttribute<Patient, String> email;
    public static volatile ListAttribute<Patient, MedicalExaminationCard> medicalExaminationCard;

}