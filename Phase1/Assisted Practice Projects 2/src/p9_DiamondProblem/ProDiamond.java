package p9_DiamondProblem;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First Inteface"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second Interface"); 
    } 
}  
public class ProDiamond implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        ProDiamond ob = new ProDiamond(); 
        ob.show(); 
    } 
}
