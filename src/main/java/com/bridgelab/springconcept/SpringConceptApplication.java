package com.bridgelab.springconcept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelab.springconcept.component.DemoBean;
import com.bridgelab.springconcept.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringConceptApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean);
		logger.debug("Demo Bean : "+context.getBean(DemoBean.class));
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		employee.setEid(101);
		employee.setEname("Amit");
		employee.showDetails();
		
	}

}
