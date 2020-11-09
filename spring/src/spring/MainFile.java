package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainFile {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		
		Employee e1=(Employee)factory.getBean("empBean");
		System.out.println(e1);
		
		
	}

}

