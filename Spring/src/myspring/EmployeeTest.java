//Dependency Injection by Constructor 

package myspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext1.xml");

		BeanFactory factory = new XmlBeanFactory(resource);

		Employee emp = (Employee) factory.getBean("id1");
		emp.show();

	}

}
