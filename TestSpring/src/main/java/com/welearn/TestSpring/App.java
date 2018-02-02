package com.welearn.TestSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	 Student s1 = (Student)context.getBean("student");
    	 System.out.println("s1 = >" + s1);
    	 
    	 Student s2 = (Student)context.getBean("student");
    	 System.out.println("change " +  s2);
    	 s2.setStudentid(32);
    	 
    	 System.out.println(s1);
    	 context.registerShutdownHook();
    }
}
