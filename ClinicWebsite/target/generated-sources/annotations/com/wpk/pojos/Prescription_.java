package com.wpk.pojos;

import com.wpk.pojos.Doctor;
import com.wpk.pojos.Patient;
import com.wpk.pojos.PrescriptionDrug;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(Prescription.class)
public class Prescription_ { 

    public static volatile SingularAttribute<Prescription, Doctor> doctor;
    public static volatile SingularAttribute<Prescription, Date> createdDate;
    public static volatile ListAttribute<Prescription, PrescriptionDrug> prescriptionDrugList;
    public static volatile SingularAttribute<Prescription, Patient> patient;
    public static volatile SingularAttribute<Prescription, String> diagnosis;
    public static volatile SingularAttribute<Prescription, Integer> id;

}