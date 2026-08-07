package javaprograms;
class One{
    int x=10,y=20;
    void addition(){
        System.out.println("Addition is: "+(x+y));}
    void smtg(){
        System.out.println("SUPER CLASS");
    }
}
class Two extends One{

    void addition(int z){
       System.out.println("Addition is: "+(x+y+z));}  
    void smt(){
        System.out.println("THis is from sub class");}
 //   void op(){
//        super.addition();
    }
 //   }
public class Single{
    public static void main(String[] args){
        Two T=new Two();
        T.addition(30);
        T.smt();
     //   T.op();
    System.out.println("THis is from main class");    
    }
}
