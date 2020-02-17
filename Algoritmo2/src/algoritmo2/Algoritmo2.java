package algoritmo2;
public class Algoritmo2 {
    public static void main(String[] args) {
       int matriz[][]={{10,1,34},{9,5,4},{2,7,23}},diag1=0,diag2=0,resta;
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(matriz[i][j]+"\t");   
           }
           System.out.println();
       }
        for(int i=0;i<3;i++)//suma de la diagonal principal
       {
           for(int j=0;j<3;j++)
           {
               if(i==1 && j==1)
               {
                   diag1=diag1+matriz[i][j];
                   diag2=diag2+matriz[i][j];
               }else if((i==2 && j==0)||(i==0 && j==2))
                {
                     diag2=diag2+matriz[i][j];
                }else if(i==j)
                {
                    diag1=matriz[i][j]+diag1;
                }  
           }
       }
  resta=diag1-diag2; 
  System.out.println("\nel valor absoluto de la resta entre las diagnoales es:"+Math.abs(resta));    
    }
    
}
