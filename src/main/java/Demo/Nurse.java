package Demo;

import org.springframework.stereotype.Component;

@Component//annotation bases config
public class Nurse implements Staff{
    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
