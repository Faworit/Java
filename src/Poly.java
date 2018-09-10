import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Poly {

    public String vvod() throws IOException {
        BufferedReader rd  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = rd.readLine();
        return text;
    }

    public ArrayList<String> words(String a){
        ArrayList<String> str = new ArrayList<>();
        String[] word = a.split(" ");
        for(int i =0; i<word.length; i++){
            str.add(word[i]);
        }
        return str;
     }
     public ArrayList<String> reverse(ArrayList<String> a){
        ArrayList<String> rev = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
          StringBuilder r = new StringBuilder(a.get(i));
          r.reverse();
          String nr = r.toString();
          rev.add(nr);

        }
         System.out.println(rev.get(0));
        return rev;
     }
     public void check(ArrayList<String> first, ArrayList<String> rev){
        ArrayList<String> polys = new ArrayList<>();
        for(int i=0; i<rev.size(); i++){
            if(first.get(i).equals(rev.get(i))){
                polys.add(first.get(i));
            }
        }
         System.out.println("Полимдромные слова: ");
        for(int a=0; a<polys.size(); a++){
            System.out.print(polys.get(a) + ", ");
        }
     }



    public static void main(String[] args) throws IOException {
        Poly poly1 = new Poly();
        String text = poly1.vvod();
        ArrayList<String> str;
        str = poly1.words(text);
        ArrayList<String> rev;
        rev = poly1.reverse(str);
        poly1.check(str, rev);


    }
}
