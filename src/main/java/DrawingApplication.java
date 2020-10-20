import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

    public static void main(String[] args)
    {
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        ApplicationContext ac = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
        Triangle triangle = (Triangle)ac.getBean("triangle");
        // calling triangle classes draw method
        triangle.draw();

    }
}
