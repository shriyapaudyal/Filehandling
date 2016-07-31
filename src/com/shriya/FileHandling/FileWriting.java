/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shneha
 */
public class FileWriting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{
        FileWriter writer=new FileWriter("C:/Users/shneha/Desktop/first.txt");
        writer.write("Hello World");
        writer.close();
    }catch(IOException ioe){
        System.out.println(ioe.getMessage());
        
    }
    }
        }

    

