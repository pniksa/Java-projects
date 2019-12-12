

package javaapplication2;

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
for(j=0;j<=k;j++){
    i=0;
    v=1;
    while(i<eingabe.length()){
        if( eingabe.substring(i,i+1).matches("[+*/-]")){
        if(j==0){
            k++;
        }
        marker=i;

        }
        i++;
    }
        rest=eingabe.substring(marker,eingabe.length());
        while(!zahl1.equals("") && rest.substring(v,v+1).equals(" ")){
        if(!rest.substring(v,v+1).equals(" ")){
            zahl1=zahl1+rest.substring(v,v+1);
        }
        v++;
    }
    
                while(!zahl2.equals("")   && v<rest.length()){
        if(!rest.substring(v,v+1).equals(" ")){
            zahl2=zahl2+rest.substring(v,v+1);
        }
        v++;
        }
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
        eingabe=eingabe.substring(0,marker)+neurest;

        }
JOptionPane.showMessageDialog(null, eingabe);
}
}

