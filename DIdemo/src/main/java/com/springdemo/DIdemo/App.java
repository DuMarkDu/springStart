package com.springdemo.DIdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
    	        new ClassPathXmlApplicationContext("com/springdemo/DIdemo/student.xml");
    	    Student gradeOneStudent = context.getBean("studentOne",Student.class);///这里，需要指定bean id
    	    gradeOneStudent.finishHomeWork();;
    	    context.close();
    }
}
