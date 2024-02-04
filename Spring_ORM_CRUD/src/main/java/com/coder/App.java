package com.coder;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coder.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "!!!!!!!!!" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/coder/config.xml");
        
         StudentDao dao = context.getBean("stDao", StudentDao.class);
         
         
         //Step-1(to add student into database)
//         Student st = new Student();
//         st.setId(50);
//         st.setName("ManMohan Singh");
//         st.setAddress("Delhi");
         
         
         
         //for this save, update, delete we need transaction--- so we need to create bean of it
//         int i = dao.saveStudent(st);
//         
//         System.out.println("Insert sucessfully : "+i);
         
         
         //step-2(to get particular student details,so we use toString() in student.java class )
//          Student st=dao.getStudent(50);
//          System.out.println(st);
//          
//         // step-3(to get allStudent details)
//          List<Student> listOfStudnets = dao.getAllStudent();
//          for(Student s: listOfStudnets) {
//        	  System.out.println(s);
//          }
          
         //step-4 (to update student)
          Student st = new Student();
          st.setId(111);
          st.setName("Narendra modi");
          st.setAddress("Gujarat");
          
          dao.updateStudent(st);
          System.out.println("update successfull****");
          
          
          
          
          
        
        
    }
}
