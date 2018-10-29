/* package codechef; // don't place package name! */

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
   
	public static void main (String[] args)throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 List<String> list=new ArrayList<String>();
    System.out.println("do you want to donate blood");
    String answer=br.readLine();
    if(answer=="yes")
    {
        System.out.println("donor name:");
        String donorname=br.readLine();
        list.add(donorname);
        System.out.println("donor age:");
        String age=br.readLine();
    
        int agein=Integer.parseInt(age);
        list.add(age);
         System.out.println("donor address:");
          String address=br.readLine();
          list.add(address);
          System.out.println("donor mailid:");
          String mailid=br.readLine();
          list.add(mailid);
    }
    Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		 try
    {
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into users (donor_name, age, address, emailid)"
        + " values (?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString ("ram",34, "agty","ghtydj@gmail.com");
      preparedStmt.setString ("ram",34, "agty","ghtydj@gmail.com);
      preparedStmt.setString("ram",34, "agty","ghtydj@gmail.com);
     

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
         System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
	}
}