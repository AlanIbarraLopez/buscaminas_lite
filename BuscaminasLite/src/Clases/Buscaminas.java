/*
La logica del juego del Buscaminas

 */
package Clases;

/**
 *
 * @author Alan E. Ibarra López
 */
public class Buscaminas {
 
    private Object m[][]; //guardaremos los resultados true = palomita , false = bomba
    private int marcador,aciertos;
   public Buscaminas(){
        initM();
    }//constructor
   
   public void setAcierto(){
       aciertos++;
       marcador +=aciertos*aciertos;
   }//enviar que le atino a un boton correcto y sumar putos al marcador
   
   public int getMarcador(){
       return marcador;
   }//retornamos el marcador
   public int getAciertos(){
       return aciertos;
   }//retornamos el 
   
   public boolean getValor(int r,int c){
       return (boolean)m[r][c];
   }//retornamos el valor de la matriz segun el boton oprimido en la interfaz
   
   public boolean getResultado(boolean valor){
       if(valor){
           return true; //seguimos en juego
       }
       return false;//perdimos
   }//saber si perdiste o sigues en juego
   
   public void resetear(){
        initM();
   }//reiniciar el juego
   public boolean gameOver(){
       if(aciertos==8){
           return true;
       }
       return false;
   }//para saber si ganamos el juego

    private void initM() {
        m= new Object[4][3];
        marcador = 0; //puntos acomulados
        aciertos = 0; //numero de flechas acertadas 
        
        int r=0;
        int c=0;
        for(int i=1;i<=4;i++){
            do{
                r=(int)(Math.random()*(3-0+1)+0); //(maximo - minimo +1)+minimo  (sumandole 1 lo incluye al minimo)
                c=(int)(Math.random()*(2-0+1)+0);
                
            }while(m[r][c]!= null);
            m[r][c]=false;//ponemos una bomba
            
            
        }//for
         //llenar lo que falta con true que seran los check
        for(int i=0;i<4;i++){
            for(int o=0;o<3;o++){
                if(m[i][o]==null){
                    m[i][o]=true;                   
                }
            }
        }
       
        //pruebas();
    }//para asignar las bombas y flechas a los botones
    
   
    private Object[][] getMatriz(){
        return this.m;
    }//retornar matriz
    
    
    
    private void pruebas(){
        
                
        System.out.println(""+m[0][0]);
        System.out.println(""+m[0][1]);
        System.out.println(""+m[0][2]);
        
        System.out.println(""+m[1][0]);
        System.out.println(""+m[1][1]);
        System.out.println(""+m[1][2]);
        
        System.out.println(""+m[2][0]);
        System.out.println(""+m[2][1]);
        System.out.println(""+m[2][2]);
        
        System.out.println(""+m[3][0]);
        System.out.println(""+m[3][1]);
        System.out.println(""+m[3][2]);
    }
    
}//class
