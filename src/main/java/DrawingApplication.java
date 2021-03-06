import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

    public static void main(String[] args)
    {
        //Triangle triangle = new Triangle();
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        Triangle triangle = (Triangle)factory.getBean("triangle");
        triangle.draw();

    }
}
