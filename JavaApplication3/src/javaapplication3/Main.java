

package javaapplication3;

import javax.swing.JOptionPane;


public class Main {


   public static void main(String[] args) {
String eingabe=JOptionPane.showInputDialog("Rechnung eingeben");
int marker=0;
int i=0;
int j=0;
int k=1;
int v=1;
String zahl1="";
String zahl2="";
String rest="";
int neurest=0;
for(j=0;j<k;j++){
while(eingabe.substring(0,1).matches("[+*/-]")){
    i=0;
    v=0;
    zahl1="";
    zahl2="";
    while(i<eingabe.length()){
        if( eingabe.substring(i,i+1).matches("[+*/-]")){
        if(j==0){
            k++;
        }
        marker=i;
        /**i++;**/
        }
       /****/ i++;
    }
    //System.out.println(marker);
        rest=eingabe.substring(marker+2/**i**/,eingabe.length());
        System.out.println(rest);

        while(/**zahl1.equals("") &&**/ !rest.substring(v,v+1).equals(" ")){
        if(!rest.substring(v,v+1).equals(" ")){
            zahl1=zahl1+rest.substring(v,v+1);
        }
        v++;
    //}
    }
        v=v+1;
                while(/**zahl2.equals("")   &&**/ (v<rest.length()) && !rest.substring(v,v+1).equals(" ") ){
        if(!rest.substring(v,v+1).equals(" ")){
            zahl2=zahl2+rest.substring(v,v+1);
        }
        v++;
        }
        System.out.println(zahl1 + zahl2);
        if(eingabe.substring(marker,marker+1).equals("+")){
            neurest=Integer.parseInt(zahl1)+Integer.parseInt(zahl2);
        }
        else if(eingabe.substring(marker, marker + 1).equals("-"))
        {
            neurest=Integer.parseInt(zahl1)-Integer.parseInt(zahl2);
        }
         else if(eingabe.substring(marker, marker + 1).equals("*"))
        {
            neurest=Integer.parseInt(zahl1)*Integer.parseInt(zahl2);
        }
         else if(eingabe.substring(marker, marker + 1).equals("/"))
        {
            neurest=Integer.parseInt(zahl1)/Integer.parseInt(zahl2);
        }
        eingabe=eingabe.substring(0,marker)+ " " +neurest+rest.substring(v,rest.length())+" ";
System.out.println(eingabe);
        }
       }
JOptionPane.showMessageDialog(null, eingabe);
}
}

