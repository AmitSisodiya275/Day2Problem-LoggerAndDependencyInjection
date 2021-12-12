package com.bridgelab.springconcept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelab.springconcept.component.DemoBean;

@SpringBootApplication
public class SpringConceptApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringConceptApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean);
		logger.debug("Demo Bean : "+context.getBean(DemoBean.class));
	}

}
