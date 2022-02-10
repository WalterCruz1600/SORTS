import java.util.Vector;
import java.io.*;
import java.util.*;

public class Bubble implements ISort{

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


    public void ordenar(){

        for(int i=0;i<vector1.size();i++){


            for(int j=0;j<vector1.size();j++){

                int x=Integer.parseInt(vector1.get(i).toString());
                int y=Integer.parseInt(vector1.get(j).toString());
                
                if(x<y){

                    vector1.set(i,y);
                    vector1.set(j,x);
                }
                
            }

        }

        for(int i=0;i<vector1.size();i++){
            System.out.print(vector1.get(i)+" ");
        }



    }

    @Override
    public void orden() {
        // TODO Auto-generated method stub
        
    }


	@Override
	public Object sort(Object listToOrder) {
		// TODO Auto-generated method stub
		return null;
	}

    
}