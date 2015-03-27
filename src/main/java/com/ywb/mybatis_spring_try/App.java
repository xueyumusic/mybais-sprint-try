package com.ywb.mybatis_spring_try;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StudentService service = (StudentService)context.getBean("studentService");
        
        service.InsertNewStudent("zhanglia", 7);
        service.GetAllStudent();
        context.close();
    }
}
