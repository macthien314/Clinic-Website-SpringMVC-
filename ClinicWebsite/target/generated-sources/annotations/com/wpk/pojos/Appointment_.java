package com.wpk.pojos;

import com.wpk.pojos.Doctor;
import com.wpk.pojos.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, Doctor> doctor;
    public static volatile SingularAttribute<Appointment, String> firstName;
    public static volatile SingularAttribute<Appointment, String> lastName;
    public static volatile SingularAttribute<Appointment, String> phone;
    public static volatile SingularAttribute<Appointment, Integer> appointmentId;
    public static volatile SingularAttribute<Appointment, Patient> patient;
    public static volatile SingularAttribute<Appointment, String> description;
    public static volatile SingularAttribute<Appointment, Date> appointmentDate;
    public static volatile SingularAttribute<Appointment, String> email;

}