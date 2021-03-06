

package com.training.org;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
      new ClassPathXmlApplicationContext("applicationContext.xml");

      // Let us raise a start event.
      context.start();
	  
      helloworld obj = (helloworld) context.getBean("helloBean");

      obj.getMessage();

      // Let us raise a stop event.
      context.stop();
   }
}

