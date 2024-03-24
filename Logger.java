package oop7_hw;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private static String fname="CalculatorOperations.log";

    public static void setFileName(String newFileName){
           fname=newFileName;
    }

    public static void WriteLog(String str){
        try(FileWriter writer = new FileWriter(fname, true))
        {
           // запись всей строки
            //String text = "Hello Gold!";
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

            writer.write(timeStamp+" : "+str);
            // запись по символам
            writer.append('\n');
           // writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }

     public static String getFileName()
     {
        return fname;
     }

}


