// Example to use ApplicationContext

package myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest1 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student std = (Student) context.getBean("studentbean");
		std.displayInfo();
	}

}
