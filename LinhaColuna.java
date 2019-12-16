
package linhacoluna;

import java.util.LinkedList;
import java.util.Queue;
import static linhacoluna.LinhaColuna.GEO;

/**
 *
 * @author Breno
 */
public class LinhaColuna {
 static int Linha = 5;
 static int Coluna = 5; 
    private static boolean[][] verificacao;
    private static Ponto pfinal;
    private static Ponto pinicio;

    private static boolean isvalido(int linha, int coluna) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
static class Ponto {
    int x; 
    int y;
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
};    

static class coordenada 
{
    Ponto pt; 
    int distancia; 
    
    public coordenada (Ponto pt, int distancia) {
             this.pt = pt;    
             this.distancia = distancia;
    }
};    

static boolean valida (int linha, int coluna)
{
 return (linha>=0) && (linha < Linha) &&   
         (coluna >=0) && (coluna < Coluna);
}

static int linhaNum[] = {-1,0,0,1};
static int colunaNum[] =  {0,-1,1,0};      

static int GEO (int mat[][],Ponto pinicial, Ponto pfinal)
{
    if(mat[pinicial.x][pinicial.y] == 1 && mat[pfinal.x][pfinal.y] == 1) {
     
        return -1;
     }
    
    boolean [][]validacao = new boolean [Linha][Coluna]; 
            
            validacao[pinicial.x][pinicial.x] = true;
            
     Queue<coor> coo = new LinkedList<>();       
     
     coor c = new coor(pinicial,0);
     coo.add(c);
     
     while (!coo.isEmpty())
     {
       coor ini = coorder.peek();
       Ponto pt = coorder.pt;       
       
       if(pt.x == pfinal.x && pt.y == pfinal.y)
           return ini.distancia;
       
       
       c.remove();
       
       for(int i = 0; i < 4; i++){
           int linha = pt.x + linhaNum[i];
           int coluna = pt.y + colunaNum[i];
           
           if(isvalido(linha,coluna)&& mat[linha][coluna] == 1 && !verificacao[linha][coluna])
           {
               verificacao[linha][coluna] = true;
               coor Adjcell = new coor (new Ponto(linha,coluna),coorder.distancia);
               c.add(Adjcell);
    
}
       }
     }
     return -1;
}
    
    public static void main(String[] args) {
       
        int [][] mat = {{1,1,1,1},
                        {0,1,1,0},
                        {0,1,0,1},
                        {0,1,9,1},
                        {1,1,1,1}};
                      
           Ponto inicio = new Ponto(0,0);           
           Ponto finall = new Ponto(2,3);
          
           
           int distancia = GEO (mat, inicio,finall);
           
           if(distancia != Integer.MAX_VALUE){
               System.out.println("As coordenadas sao" + distancia);
           }
           else{
               System.out.println("Não existe coordenadas");
        }
           }
    }
    
             
    

   

