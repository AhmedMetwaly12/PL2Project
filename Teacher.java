


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ahmed
 */
public class Teacher {
    static Connection c;
    static Statement s;
    Security s1=new Security();
    private String num;
    private String name;
    private String cID;
    private String deadline;
    private String type;
    private String ID;
    private String noOfQues;
    private String grade;
    private String gradeInLetters;
    private String eNum;

    
Teacher(){
}
    
    public void addCourse(String ID,String name,String tID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into course(id,[name],tID) values('"+ID+"','"+name+"','"+tID+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void deleteCourse(String ID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from course where id='"+ID+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateCourseName(String ID,String name){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE course SET name='"+name+"' WHERE id="+ID;
           s.executeUpdate(query);
           System.out.println("Course information has been updated");
           JOptionPane.showMessageDialog(null,"Course information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateCoursetID(String ID,String tID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE course SET tID='"+tID+"' WHERE id="+ID;
           s.executeUpdate(query);
           System.out.println("Course information has been updated");
           JOptionPane.showMessageDialog(null,"Course information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
    
    //-------------------Lecture-------------------//
    public void addLecture(String num,String name,String cID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into lecture(num,name,cID) values('"+num+"','"+name+"','"+cID+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void deleteLecture(String num){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from lecture where num='"+num+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateLecutreName(String num, String name){
     try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE lecture SET name='"+name+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Lecture information has been updated");
           JOptionPane.showMessageDialog(null,"Lecutre information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}


public void updateLecturecID(String num, String cID){
     try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE lecture SET cID='"+cID+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Lecture information has been updated");
           JOptionPane.showMessageDialog(null,"Lecture information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

//-------------------Assignment-------------------//
public void addAssignment(String num,String deadline,String type,String cID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into assignment(num,deadline,type,cID) values('"+num+"','"+deadline+"','"+type+"','"+cID+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void deleteAssignment(String num){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from assignment where num='"+num+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateAssignmentDeadline(String num, String deadline){
     try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE assignment SET deadline='"+deadline+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Assignment information has been updated");
           JOptionPane.showMessageDialog(null,"Assignment information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateAssignmentType(String num, String Type){
     try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE assignment SET type='"+Type+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Assignment information has been updated");
           JOptionPane.showMessageDialog(null,"Assignment information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateAssignmentcID(String num, String cID){
     try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE assignment SET cID='"+cID+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Assignment information has been updated");
           JOptionPane.showMessageDialog(null,"Assignment information has been updated");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

//-----------------------Exam------------------------//
  public void addExam(String num,String noOfQues,String stdID,String cID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into exam(num,[noOfQues,stdID,cID) values('"+num+"','"+noOfQues+"','"+stdID+"','"+cID+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
    public void deleteExam(String num){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from exam where num="+num;
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
    
    public void updateExamNoQues(String num,String noOfQues){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE exam SET noOfQues='"+noOfQues+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Exam information has been updated");
           JOptionPane.showMessageDialog(null,"Success");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
        public void updateExamcID(String num,String cID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE exam SET cID='"+cID+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Exam information has been updated");
           JOptionPane.showMessageDialog(null,"Success");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
        public void updateExamstdID(String num,String stdID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE exam SET stdID='"+stdID+"' WHERE num="+num;
           s.executeUpdate(query);
           System.out.println("Exam information has been updated");
           JOptionPane.showMessageDialog(null,"Success");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}
//--------------------------------------------Exam Score----------------------///
public void insertExamScore(String stdID, String cID,String grade,String gradeInLetters){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="insert into examScore(stdID,cID,grade,gradeInLetters) values('"+stdID+"','"+cID+"','"+grade+"','"+gradeInLetters+"')";
           s.executeUpdate(query);
           System.out.println("Insertion Successful");
           JOptionPane.showMessageDialog(null,"Insert Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void deleteExamScore(String stdID,String cID){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="delete from examScore where stdID='"+stdID+"' AND cID='"+cID+"'";
           s.executeUpdate(query);
           System.out.println("Deletion Successful");
           JOptionPane.showMessageDialog(null,"Deletion Successful");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateExamScoreGrade(String stdID, String cID,String grade){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE examScore SET grade='"+grade+"' WHERE stdID='"+stdID+"' AND cId="+cID;
           s.executeUpdate(query);
           System.out.println("Exam Score information has been updated");
           JOptionPane.showMessageDialog(null,"Success");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

public void updateExamScoreGradeL(String stdID, String cID,String gradeInLetters){
    try{
        c = s1.connect();
        s = c.createStatement();
        String query="UPDATE examScore SET gradeInLetters='"+gradeInLetters+"' WHERE stdID='"+stdID+"'AND cId="+cID;
           s.executeUpdate(query);
           System.out.println("Exam Score information has been updated");
           JOptionPane.showMessageDialog(null,"Success");
           c.close();
    }
           catch(SQLException e){
                   System.out.println("Error");
                   JOptionPane.showMessageDialog(null,"Error");
                   }
}

}
