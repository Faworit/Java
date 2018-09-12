import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Poly {

    public String input() throws IOException {
        BufferedReader rd  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = rd.readLine();
        return text;
    }

    public ArrayList<String> words(String a){

        String[] word = a.split(" ");
        ArrayList<String> str = new ArrayList<String>(Arrays.asList(word));

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
         polys.forEach((String e)-> System.out.print(e + ", "));

     }

    public static void main(String[] args) throws IOException {
        Poly poly1 = new Poly();
        String text = poly1.input();
        ArrayList<String> str;
        str = poly1.words(text);
        ArrayList<String> rev;
        rev = poly1.reverse(str);
        poly1.check(str, rev);


    }
}
