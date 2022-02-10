import java.util.Vector;

public class Merge implements InterBubble{

    private Vector vector1= new Vector<>();


    public void add(Object item){

        vector1.add(item);

    };


    public Object gets(int i){


        return vector1.get(i);

    };

    public boolean empty(){
        boolean vacio=false;
        if(vector1.size()==0){
            vacio=true;
        }
        return vacio;
    };

    public int size(){
        
        return vector1.size();
    };


    public void ordenar(Vector vector1){

        if(vector1.size()<2){
            for(int i=0;i<vector1.size();i++){
                System.out.print(vector1.get(i)+" ");
            }
        }else{
            int mid=vector1.size()/2;

            Vector mitad=new Vector<>(mid);
            Vector mitad2=new Vector<>(vector1.size()-mid);

            for(int i=0;i<mid;i++){
                mitad.add(i, vector1.get(i));
            }

            for(int i=mid;i<vector1.size();i++){
                mitad2.add(i-mid, vector1.get(i));
            }

            ordenar(mitad);
            ordenar(mitad2);

            merge(vector1,mitad,mitad2);

            for(int i=0;i<vector1.size();i++){
                System.out.print(vector1.get(i)+" ");
            }
            System.out.println("");


        }

    }

    private static void merge(Vector vector1, Vector mitad, Vector mitad2){

        int mid1=mitad.size();
        int mid2=mitad2.size();

        int i=0;
        int j=0;
        int k=0;

        do{

            if(Integer.parseInt(mitad.get(i).toString())<=Integer.parseInt(mitad2.get(j).toString())){

                vector1.set(k, mitad.get(i));
                i++;
            }else{

                vector1.set(k, mitad2.get(j));
                j++;
            }
            k++;

        }while(i<mid1&&j<mid2);

        while(i<mid1){
            vector1.set(k,mitad.get(i));
            i++;
            k++;

        }
        while(j<mid2){
            vector1.set(k,mitad2.get(j));
            j++;
            k++;

        }

    }


    @Override
    public void orden() {
        // TODO Auto-generated method stub
        
    }

    
}
