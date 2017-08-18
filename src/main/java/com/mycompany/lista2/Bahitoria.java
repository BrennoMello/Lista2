/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista2;

/**
 *
 * @author Brenno Mello <brennodemello.bm at gmail.com>
 */
public class Bahitoria {
    public static void main(String[] args) {
        int mapa [][] = {{0,25,0,0,15,0,0},{0,0,15,0,8,0,0},{0,0,0,13,0,0,0},{0,0,0,0,0,10,0},{0,0,0,0,0,0,10},{0,0,0,0,0,0,5},{0,0,0,0,0,0,0}};
        
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
              System.out.print(mapa[i][j]+ "  ");
            }
              System.out.println();   
        }
        
        int start=0;
        int end=6;
        int combustivel = 20;
        
        int reabastecimentos = 0;
        while(start != end){
            int menorCusto = Integer.MAX_VALUE;
            int posicao=0;
            
            for (int i = 0; i < end; i++) {
                if(mapa[start][i] < menorCusto && mapa[start][i]>0){
                    menorCusto = mapa[start][i];
                    posicao = i;
                    
                }
                if (mapa[start][i] <= combustivel ) {
                    combustivel -= mapa[start][i];
                    System.out.println("Saiu: "+start + "para: " +posicao + "Combustivel: "+ combustivel);
                    start = posicao;
                    
                }else{
                    combustivel = 20;
                    reabastecimentos++;
                
                }
            }
   
            System.out.print(reabastecimentos);
            
            
        }
    }
}
