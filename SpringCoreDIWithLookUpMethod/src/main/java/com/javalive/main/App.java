package com.javalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalive.beans.PrototypeBean;
import com.javalive.beans.SingletonBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    		       new ClassPathXmlApplicationContext("spring-config.xml");
    		       SingletonBean singleton = (SingletonBean)context.getBean("singletonBean");             
    		       PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
    		       PrototypeBean prototypeBeanB = singleton.getPrototypeBean();             
    		       System.out.println(prototypeBeanA);
    		       System.out.println(prototypeBeanB);             
    		       System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA==prototypeBeanB));
    		       }    
}
