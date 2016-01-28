package main.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class StudentTest {
	
	 public static void main(String[] args) {
		
		 Resource resource = new ClassPathResource("applicationContext.xml");
		 
		 BeanFactory factory = new XmlBeanFactory(resource);
		 
		 Student student =(Student) factory.getBean("studentbean");
		 student.displayInfo();
	}

}
