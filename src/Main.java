import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

   pikachu p1 = new pikachu("youssef");
   pikachu p2 = new pikachu("alaa");
   dinosores b1 = new dinosores("mohamad");
   dinosores b2 = new dinosores("nada");


        ArrayList<pokemon> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(b1);
        lista.add(b2);
        

        for (pokemon p:lista){
            p.attack();
        }
    }
}