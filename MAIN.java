import java.util.Random;

public class MAIN{

    public static void main(String[]args){

        System.out.println("hola");

        Random random=new Random();
        Bubble bubble= new Bubble();

        int largo=random.nextInt(10)+1;

        System.out.println("La lista ordenada es: ");

        for(int i=0;i<=largo;i++){
            int x=random.nextInt(100)+1;
            bubble.add(x);
            System.out.println(bubble.gets(i));


        }

        bubble.ordenar();
        
    }




}