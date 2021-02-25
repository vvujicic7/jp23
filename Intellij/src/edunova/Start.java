package edunova;

import java.sql.*;

public class Start {

    public Start(){

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection veza = DriverManager.getConnection(
                    "jdbc:mariadb://127.0.0.1/edunovajp23",
                    "edunova",
                    "edunova");

            // bolje je korištenje PreparedStatement
            Statement izraz = veza.createStatement();
            // potencijalni sql injection
            //String uvjet="a';drop database edunovajp23;select * from mysql.users where id like 'a";
            // ResultSet rs = izraz.executeQuery("select * from smjer where naziv ='"+uvjet+"'");
            ResultSet rs = izraz.executeQuery("select * from smjer");
            while(rs.next()){
                System.out.println(rs.getString("naziv"));
            }
            rs.close();
            veza.close();

            // System.out.println(veza.getMetaData().getDatabaseProductName());

        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Start();
    }

}
