package com.exceptionHandling;

import com.langpackage.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex2Demo {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Customized Exception Handling by using try-catch
         * It is highly recommended to handle exception
         *
         * In our program the code which may raise exception is called risky code,
         * We have to place risky code inside the try block and corresponding handling code inside catch block
         */
        /**
         *
         * Try with multiple catch block
         *
         * The way handling exception is vary from exception Hence every exception type is recommended to take seperate
         * catch block.That is try with multiple catch blocks is possible and recommended to use.
         *
         *
         */


            readDataFromFile();


    }

    private static void readDataFromFile() throws FileNotFoundException {

        File f=new File("C:\\e-logo\\SystemLogo1.bmp");

        FileReader reader = new FileReader(f);
    }
}
