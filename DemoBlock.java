public class DemoBlock{
    public static void main(String[] args){
       System.out.println(" Demonstrating block scope ");
       int x = 1111;
       System.out.println(" In first block x is " + x);
       {
        int y = 2222;
        System.out.println(" In second block x is " + x);
        System.out.println(" in second block y is " + y);        
       } 
       {
        int y = 3333;
        System.out.println(" In third block x is " + x);
        System.out.println(" In tird block y is " + y);
        System.out.println(" After method x is" + x);
        System.out.println(" After method block y is " + y);
        System.out.println(" At the end x is 1111");
       }
    }
}

    



    

     
    
    
    
