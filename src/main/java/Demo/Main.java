package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //we are using XML based configuration only
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");

        //using annotation based config
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        //way 1
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor);
        System.out.println(doctor.getQualification());
        doctor.setQualification("MBBS");
        System.out.println(doctor.getQualification());
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);
//        //way2
//        Nurse nurse =(Nurse) context.getBean("nurse");
//        doctor.assist();
//        nurse.assist();
//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();
    }
}
