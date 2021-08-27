package intern;

import java.sql.*;
import java.lang.*;
public class Intern {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//   Class.forName("Oracle.jdbc.driver.OracleDriver");
  try {
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sam123");
   Statement s=c.createStatement();
  
   System.out.println("created");


Statement st = c.createStatement();

st.execute("create table Movie(actor varchar2(25) , actress varchar2(25) , movieName varchar2(25) , yearOfRelease number)");

 




 
st.executeUpdate("INSERT INTO Movie VALUES('vijay' , 'samantha' , 'kathi' ,2019)");

st.executeUpdate("insert into Movie values('ajith' , 'kajal ' , 'arambam ' ,2017)");

st.executeUpdate("insert into Movie values('siva' , 'keerthy ' , 'remo ' , 2015)"); 
st.executeUpdate("insert into Movie values('suriya' , 'anushka ' , 'singam' , 2014)");
ResultSet r = st.executeQuery("select * from Movie");
System.out.println("ALL DATA IN TABLE"); while(r.next()) {
 

System.out.println(r.getString(2));
}


}catch(Exception e) {


 
System.out.println(e);
}
}
}
