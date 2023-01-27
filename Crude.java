package crud;
import java.sql.*;
import java.util.Scanner;
public class Crude {
	
	   public static void main(String args[]) throws SQLException {
		   
	      Connection c = null;
	      Statement stmt = null;
	      String query;
	      ResultSet rs=null;
	      
	      try {Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
	            "myuser", "123");
	         stmt = c.createStatement();
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	      
	      stmt = c.createStatement();
	      while(true) {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("PSQL CRUD operation");
	      System.out.println("1-INSERT");
	      System.out.println("2-UPDATE");
	      System.out.println("3-DELETE");
	      System.out.println("4-SELECT");
	      System.out.println("5-EXIT");
	      System.out.println("ENTER YOUR CHOICE");
	     String name,add,salary;int id,age;
	      int input=scan.nextInt();
	      switch(input) {
	      
	      case 1:System.out.println("insert new data");
	      System.out.println("enter id");
	      id=scan.nextInt();
	      System.out.println("enter name");
	      name=scan.next();
	      System.out.println("enter age");
	      age=scan.nextInt();
	      System.out.println("enter address");
	      add=scan.next();
	      System.out.println("enter salary in numbers");
	      salary=scan.next();
	      query= "insert into COMPANY values("+id+",'"+name+"',"+age+""+",'"+add+"',"+salary+")";
	      stmt.executeUpdate(query);
	      break;
	      
	      case 2:System.out.println("enter id to update a data");
	      int value=scan.nextInt();
	      System.out.println("enter id");
	      id=scan.nextInt();
	      System.out.println("enter name");
	      name=scan.next();
	      System.out.println("enter age");
	      age=scan.nextInt();
	      System.out.println("enter address");
	      add=scan.next();
	      System.out.println("enter salary in numbers");
	      salary=scan.next();
	      query="UPDATE COMPANY SET ID="+id+",NAME='"+name+"',AGE="+age+",ADDRESS='"+add+"',NETWORTH="+salary+" WHERE ID="+value+";";
	      stmt.executeUpdate(query);
	      break;
	      
	      case 3:System.out.println("enter id to delete a data");
	       value=scan.nextInt();
	      query="DELETE FROM COMPANY WHERE ID="+value+";";
	      stmt.executeUpdate(query);
	      System.out.println("Deleted Succesfully");
	      break;
	      
	      case 4:System.out.println("select data");
	      query= "select * from COMPANY";
	      rs=stmt.executeQuery(query);
	      while(rs.next()) {
	    	  System.out.print("ID="+rs.getInt(1)+",");
	    	  System.out.print("NAME="+rs.getString(2)+",");
	    	  System.out.print("AGE="+rs.getInt(3)+",");
	    	  System.out.print("ADDRESS="+rs.getString(4)+",");
	    	  System.out.print("SALARY="+rs.getString(5)+",");
	    	  System.out.println("");
	      }
	      break;
	      
	      case 5:System.out.println("exit succesfully");
	      System.exit(0);
	      break;
	      
	      default:System.out.println("ENTER PROPER INPUT");
	      }
	   
	   }
	
}}