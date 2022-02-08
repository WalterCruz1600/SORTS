import java.util.Vector;

public class Bubble implements InterBubble{

    private Vector v1= new Vector<>();


    public void add(Object item){

        v1.add(item);

    };

    public Object remove(){
        Object x=v1.get(v1.size()-1);
        v1.remove(v1.size()-1);
        return x;

    };


    public Object gets(int i){


        return v1.get(i);

    };

    public boolean empty(){
        boolean vacio=false;
        if(v1.size()==0){
            vacio=true;
        }
        return vacio;
    };

    public int size(){
        
        return v1.size();
    };


    public void ordenar(){

        for(int i=0;i<v1.size();i++){


            System.out.println(i);
            for(int j=0;j<v1.size();j++){

                int x=Integer.parseInt(v1.get(i).toString());
                int y=Integer.parseInt(v1.get(j).toString());
                
                if(x<y){

                    v1.set(i,y);
                    v1.set(j,x);
                }
                
            }

        }

        for(int i=0;i<v1.size();i++){
            System.out.print(v1.get(i)+" ");
        }



    }

    @Override
    public void orden() {
        // TODO Auto-generated method stub
        
    }

    
}