package com.wpk.pojos;

import com.wpk.pojos.Doctor;
import com.wpk.pojos.Nurse;
import com.wpk.pojos.Patient;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-04-12T13:37:37")
@StaticMetamodel(MedicalExaminationCard.class)
public class MedicalExaminationCard_ { 

    public static volatile SingularAttribute<MedicalExaminationCard, Date> date;
    public static volatile SingularAttribute<MedicalExaminationCard, Doctor> doctor;
    public static volatile SingularAttribute<MedicalExaminationCard, String> sympton;
    public static volatile SingularAttribute<MedicalExaminationCard, Boolean> receive;
    public static volatile SingularAttribute<MedicalExaminationCard, Patient> patient;
    public static volatile SingularAttribute<MedicalExaminationCard, Integer> num;
    public static volatile SingularAttribute<MedicalExaminationCard, BigDecimal> fee;
    public static volatile SingularAttribute<MedicalExaminationCard, Nurse> nurse;
    public static volatile SingularAttribute<MedicalExaminationCard, String> diagnosis;
    public static volatile SingularAttribute<MedicalExaminationCard, Integer> id;

}