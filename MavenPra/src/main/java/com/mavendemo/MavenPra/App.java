package com.mavendemo.MavenPra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("初始化驱动成功");
    }
}
