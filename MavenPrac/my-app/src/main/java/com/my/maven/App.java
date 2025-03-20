package com.my.maven;

import com.my.maven.helper.Helper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Helper.help();
        System.out.println("String hashcodes");
        String str = "Aayush";
        System.out.println(str.hashCode());
        str = str.concat(" Tiwari");
        System.out.println(str.hashCode());
        System.out.println("\n String Builder hashcodes");
        StringBuilder str2 = new StringBuilder("Lalit");
        System.out.println(str2.hashCode());
        str2 = str2.append(" Patel");
        System.out.println(str2.hashCode());
    }
}
