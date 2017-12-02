
/**
 * Write a description of class Calculation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculation
{
    private int x;
    private int y;
    
    public Calculation(){
        x=0;
        y=0;
    }
    public int hw(){
        return 24*7;
    }
    public int sy(){
        return 60*60*24*365;
    }
    public void get(){
        System.out.print("x = "+x);
        System.out.print("     y = "+y);
    }
    public void set(int newx, int newy){
        x=newx;
        y=newy;
    }
    public int average(){
        return (x+y)/2;
    }
    public int max(){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public void swap(){
        int hold;
        hold=x;
        x=y;
        y=hold;
    }
    public void convert(){
        y=(9*x/5)+32;
    }  
    public String oe(int a){
        if((a%2)==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public int dd(String date){
        return date.codePointBefore(3);
    }
    public int coins(int pence){
        int p;
        int count;
        p=pence;
        count=0;
        while(p>199){
            p=p-200;
            count++;
        }
        while(p>99){
            p=p-100;
            count++;
        }
        while(p>49){
            p=p-50;
            count++;
        }
        while(p>19){
            p=p-20;
            count++;
        }
        while(p>9){
            p=p-10;
            count++;
        }
        while(p>4){
            p=p-5;
            count++;
        }
        while(p>1){
            p=p-2;
            count++;
        }
        while(p>0){
            p=p-1;
            count++;
        }
        return count;
    } 
    //public void quadratic(double a, double b, double c){
      //  x=((-b+Math.pow((b^2)-4*a*c, 0.5))/(2*a));
        //y=(-b-Math.pow((b^2)-4*a*c, 0.5))/(2*a);
    //}
    public void runAll(){
        hw();
        sy();
        set(134,428);
        get();
        average();
        max();
        coins(x+y);
        swap();
        get();
        convert();
        oe(x);
    }
   
    
      
}
    
            
   

