package Demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component//to use annotations we need to mark it as a spring component
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }

//       assist();
//   }
}
