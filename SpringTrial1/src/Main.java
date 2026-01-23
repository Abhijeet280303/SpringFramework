import com.SpringTrial1.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_location = "com/SpringTrial1/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_location);

        Student student1= (Student) context.getBean("stud1");
        student1.displayInformation();
    }
}

//here explicitely we need to import the jars
// the work will be handled by maven in further course