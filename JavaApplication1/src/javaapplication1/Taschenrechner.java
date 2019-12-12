package javaapplication1;


public class Taschenrechner {
public void Addition(String Z1, String Z2){
    Integer ZT1;
    Integer ZT2;
    String Z3;
    String Z4;
    String Summe="";
    String Rest="";
    Integer Teilsumme;
    String Summand="";
    int laenge;
    if(Z1.length()<=Z2.length()){
        laenge=Z1.length();
        Z3=Z2.substring(Z2.length()-laenge, Z2.length()-1);
        Z4=Z1;
    }
    else{
        laenge=Z2.length();
        Z3=Z1.substring(Z1.length()-laenge, Z1.length()-1);
        Z4=Z2;
    }
    for(int i=0;i<laenge;i++){
    if (i<laenge-1){
        ZT1=Integer.parseInt(Z3.substring(i,i+1));
   ZT2=Integer.parseInt(Z4.substring(i,i+1));
   Teilsumme=ZT1+ZT2;
   Summand=String.valueOf(Teilsumme);
   Summe=Summe+Summand.substring(0, 1)+Rest;
 }
    }
       Summe=Summe+Rest;
        
    System.out.println(Summe);
 if(Z1.length()<=Z2.length()){
    Summe=Summe+Z2.substring(laenge-1,(Z2.length())-1);
}
 else{
         Summe=Summe+Z1.substring(laenge-1,(Z1.length())-1);
 }
    System.out.println(Summe);
}
}


