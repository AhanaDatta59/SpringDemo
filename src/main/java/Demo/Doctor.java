package Demo;

import org.springframework.stereotype.Component;

//@Component//to use annotations we need to mark it as a spring component
public class Doctor implements Staff {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


//       assist();
//   }
}
