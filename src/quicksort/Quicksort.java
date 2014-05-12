package quicksort;

import interprete.Fila;

public class Quicksort {
    public Quicksort(){
    }
    
  public static void quicksort(Fila A[],int col, int sup, int inf) {
    Fila pivote=A[sup];
    int i=sup; 
    int j=inf; 
    Fila aux;
 
    while(i<j){    
      
     while(A[i].columna(col).compareTo(pivote.columna(col))<0 && i<j)
        i++;
        while(A[i].columna(col).compareTo(pivote.columna(col))>0) 
            j--;         
        if (i<j) {                                         
            aux= A[i];                 
            A[i]=A[j];
            A[j]=aux;
            }
   }
   A[sup]=A[j]; 
   A[j]=pivote; 
   if(sup<j-1)
      quicksort(A,col,sup,j-1); 
   if(j+1 <inf)
      quicksort(A,col,j+1,inf);
    }
}
