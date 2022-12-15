/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Admin extends Security {
    private int stdID;
    private int tID;
    static Connection c;
    static Statement s;
    Security s1=new Security();
    Admin(){
    }
public void addStudent(String ID,String name,String email,String year,String course) throws SQLException{
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into student(id,[name],email,year,course) values('"+ID+"','"+name+"','"+email+"','"+year+"','"+course+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID already exists");
                   JOptionPane.showMessageDialog(null,"ID Already exists");
                   }
   
    }


    public void addTeacher(int ID,String name,String email) throws SQLException{
        try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into teacher(id,[name],email) values('"+ID+"','"+name+"','"+email+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID already exists");
                   JOptionPane.showMessageDialog(null,"ID already exists");
                   }
    }

    
    
       public void deleteStudent(int sID) throws SQLException{
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from student where id='"+sID+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID doesn't exist");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
   
    }
         public void deleteTeacher(int tID) throws SQLException{
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from teacher where id='"+tID+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID doesn't exist");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
   
    }
    
        public void blockStudent(int stID) throws SQLException {
            try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from student where id='"+stID+"'";
           s.executeUpdate(query);
           System.out.println("Student with the ID "+stID+" has been blocked");
           JOptionPane.showMessageDialog(null,"Student has been blocked");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID doesn't exist");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
   
    }
        
          public void blockTeacher(int tID) throws SQLException {
            try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from student where id='"+tID+"'";
           s.executeUpdate(query);
           System.out.println("Teacher with the ID "+tID+" has been blocked");
           JOptionPane.showMessageDialog(null,"Teacher has been blocked");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("ID doesn't exist");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
   
    }
          
               public void updateStudentName(String ID,String name) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE student SET name='"+name+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Student with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Student information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
               
     public void updateStudentEmail(String ID,String email) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE student SET email='"+email+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Student with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Student information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
     
            public void updateStudentYear(String ID,String year) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE student SET year='"+year+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Student with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Student information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
                           
       public void updateStudentCourse(String ID,String course) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE student SET course='"+course+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Student with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Student information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
                                       
  
                                                   
                                                   
     public void updateTeacherName(String ID,String name) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE teacher SET name='"+name+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Teacher with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Teacher information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
     
       public void updateTeacherEmail(String ID,String email) throws SQLException {
try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE teacher SET email='"+email+"' WHERE id="+ID;

           s.executeUpdate(query);
           System.out.println("Teacher with the ID "+ID+" has been updated");
           JOptionPane.showMessageDialog(null,"Teacher information has been updated");
           c.close();
}
   catch(SQLException e){
           System.out.println("Error");
           JOptionPane.showMessageDialog(null,"Error");
           }
           
   
    }
}

