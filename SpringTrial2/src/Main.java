import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springtrial2.beans.Student;
import com.springtrial2.resources.SpringConfig;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Student studnet1 =(Student)context.getBean("student1");
    	Student studnet2 =(Student)context.getBean("student2");
    	studnet1.display();
    	System.out.println("=================================================================================================");
    	studnet2.display();
    	
    	
    	
    	//Other Ways
    	Student student01= (Student) context.getBean(Student.class);  // <- this will show a compiletime exeption as this approact expects single Bean configured
    	Student student001 = context.getBean("student1", Student.class); //<- this can be used insted above then 
    	student01.display();
    	
    	
    	System.out.println("=================================================================================================");
    	Student student3= (Student) context.getBean("student3");
    	student3.display();
    	
    	
    	
    	
    }
}
