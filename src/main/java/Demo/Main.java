package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //we are using XML based configuration only
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

//        //way 1
//        Doctor doctor = context.getBean(Doctor.class);
//
//        //way2
//        Nurse nurse =(Nurse) context.getBean("nurse");
//        doctor.assist();
//        nurse.assist();
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
    }
}
