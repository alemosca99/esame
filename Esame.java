package codice;


import java.util.ArrayList;
import java.util.List;

public class Esame {

    private Esame() {
         throw new IllegalStateException("Utility class");
    }
   
    public static int somiglianza(String s1, String s2){
        int k=0;
        int min=minimaStringa(s1, s2).length();
        for(int i=0; i<min; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                k++;
            }
        }
        return k;
    }
    public static String minimaStringa(String s1, String s2){
        if(s1.length() >= s2.length()){
            return s1;
        }
        else{
            return s2;
        }
    }
    public static String palindroma(String s){
        int len=s.length();
        for(int i=0; i<len/2; i++){
            s=scambia(s, i, len-i-1);
        }
        return s;
    }
    public static String scambia(String s, int i1, int i2){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i == i1) {
                builder.append(s.charAt(i2));
            }
            else if(i == i2){
                    builder.append(s.charAt(i1));
            }
            else{
                    builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
    public static int contaCaratteri(String s, char c){
        int k=0;
        int len=s.length();
        for(int i=0; i<len; i++){
            if(s.charAt(i) == c){
                k++;
            }
        }
        return k;
    }
    public static String eliminaCarattere(String s, char c){
        int len=s.length();
        StringBuilder builder= new StringBuilder();
        for(int i=0; i<len; i++){
            if(s.charAt(i) != c){
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
    public static String  dividiStringhe(String s, int d){
        StringBuilder builder= new StringBuilder();
        if(d >= s.length()){
            return "";
        }
        for(int i=0; i<=d; i++) {
            builder.append(s.charAt(i));
        }
        builder.append(" ");
        for(int i=d+1; i<s.length(); i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
    public static List<String> pezziStringa(String s){
        int len=s.length();
        StringBuilder builder=new StringBuilder();
        List<String> list=new ArrayList<>();
        for(int i=0; i<len; i++) {
            String s1 = "";
            for (int j = 0; j <= i; j++) {
                builder.append(s.charAt(j));
            }
            list.add(s1);
        }
        return list;
    }
}

