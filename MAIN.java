import java.util.Random;

public class MAIN{

    public static void main(String[]args){

        System.out.println("hola");

        Random rd=new Random();
        Bubble b= new Bubble();

        int largo=rd.nextInt(5)+1;

        System.out.println("La lista ordenada es: ");

        for(int i=0;i<=largo;i++){
            int x=rd.nextInt(100)+1;
            b.add(x);
            System.out.println(b.gets(i));


        }

        b.ordenar();
        
    }




}