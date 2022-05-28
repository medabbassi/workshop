package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myDB {
    final private String URL= "jdbc:mysql://127.0.0.1:3306/testesprit";
    final private String USERNAME ="root";
    final  private String PWD= "";
   static private Connection cnx;
    static  private  myDB instance;
    private   myDB() {
        try {
            cnx = DriverManager.getConnection(URL,USERNAME,PWD);
        }  catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static  public myDB getInstance(){
        if (instance == null)
            instance= new myDB();
      return  instance;
    }
    static public  Connection getCnx()
    {
        return  cnx;
    }
}
