public class MergeSort implements ISort{

    public static void ordenar(int[] vector1){

        if(vector1.length<2){
            for(int i=0;i<vector1.length;i++){
                System.out.print(vector1[i]+" ");
            }
        }else{
            int mid=vector1.length/2;

            int[] mitad=new int[mid];
            int[] mitad2=new int[vector1.length-mid];

            for(int i=0;i<mid;i++){
                mitad[i] = vector1[i];
            }

            for(int i=mid;i<vector1.length;i++){
                mitad2[i-mid] = vector1[i];
            }

            ordenar(mitad);
            ordenar(mitad2);

            merge(vector1,mitad,mitad2);

        }

    }

    private static void merge(int[] vector1, int[] mitad, int[] mitad2){

        int mid1=mitad.length;
        int mid2=mitad2.length;

        int i=0;
        int j=0;
        int k=0;

        do{

            if(mitad[i]<=mitad2[j]){

                vector1[k] = mitad[i];
                i++;
            }else{

                vector1[k] = mitad2[j];
                j++;
            }
            k++;

        }while(i<mid1&&j<mid2);

        while(i<mid1){
            vector1[k] = mitad[i];
            i++;
            k++;

        }
        while(j<mid2){
            vector1[k] = mitad2[j];
            j++;
            k++;

        }

    }


    @Override
    public int[] sort(int[] lista) {
    	int[] resultedList = lista.clone();
    	MergeSort.ordenar(resultedList);
		return resultedList;
    }

    
}
