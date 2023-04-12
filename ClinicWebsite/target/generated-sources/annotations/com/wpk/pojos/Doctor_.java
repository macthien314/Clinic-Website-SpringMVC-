package com.wpk.pojos;

import com.wpk.pojos.Appointment;
import com.wpk.pojos.Medical;
import com.wpk.pojos.MedicalExaminationCard;
import com.wpk.pojos.Prescription;
import com.wpk.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, String> lastName;
    public static volatile SingularAttribute<Doctor, String> image;
    public static volatile SingularAttribute<Doctor, Medical> medical;
    public static volatile SingularAttribute<Doctor, String> gender;
    public static volatile ListAttribute<Doctor, Prescription> prescriptionList;
    public static volatile ListAttribute<Doctor, Appointment> appointmentList;
    public static volatile SingularAttribute<Doctor, String> yearsExperience;
    public static volatile SingularAttribute<Doctor, Date> birthDate;
    public static volatile ListAttribute<Doctor, MedicalExaminationCard> medicalExaminationCards;
    public static volatile SingularAttribute<Doctor, String> firstName;
    public static volatile SingularAttribute<Doctor, String> phone;
    public static volatile SingularAttribute<Doctor, Integer> id;
    public static volatile SingularAttribute<Doctor, User> user;
    public static volatile SingularAttribute<Doctor, String> email;

}