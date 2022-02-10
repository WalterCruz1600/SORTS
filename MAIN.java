import java.util.Random;
import java.util.Vector;

public class MAIN{

    public static Vector vector1= new Vector<>();


    public static void main(String[]args){

        System.out.println("hola");

        Random random=new Random();
        Bubble bubble= new Bubble();
        Merge merge=new Merge();

        int largo=random.nextInt(10)+1;

        System.out.println("La lista ordenada es: ");

        for(int i=0;i<=largo;i++){
            int x=random.nextInt(100)+1;
            vector1.add(x);
            bubble.add(x);
            merge.add(x);
            System.out.println(vector1.get(i));


        }
        System.out.println("Ordenamiento Bubble: ");
        bubble.ordenar();

        System.out.println("\nOrdenamiento Merge: ");
        merge.ordenar(vector1);
        
    }




}