package com.java.Programs;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<Integer> list=new ArrayList<>();
        list.add(33);
        list.add(22);
        list.add(99);
        
        list.forEach(System.out::println);
        Collections.sort(list);
        
        System.out.print(list);
        
        
        		
        
    }
}
