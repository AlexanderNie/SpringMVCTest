package com.welearn.TestSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Integer i = 10000;
    	Integer j = 10000;
    	if (i.equals(j))
    		System.out.println("s1 equals s2");
    	else 
    		System.out.println("s1 not equals s2");
    	 
    }
}
