/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_test;

import java.sql.Connection;
import java.util.Date.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Durgesh Thecool
 */
public class ConnectDB {
    public Connection connect()
    {
        try{
        Class.forName("java.sql.DriverManager");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/widget_corp","root","wxyz");
        return con;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
        return null;
    }
    public String dateFormat(String date)
    {
        try{
            Date dmyFormat =  new SimpleDateFormat("dd-MM-yyyy").parse(date);
            SimpleDateFormat ymdFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ymd = ymdFormat.format(dmyFormat);
            return ymd;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
        }
    public String getDate(String date)
    {
        try{
            Date ymdFormat = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dmy = dmyFormat.format(ymdFormat);
            return dmy;
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    }
    
    

