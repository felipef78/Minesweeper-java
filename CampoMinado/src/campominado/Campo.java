/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

/**
 *
 * @author Felipe
 */
public class Campo {
    private int linhas;
    private int colunas;
    private int minasT;
    private Quadrado[][] quadrados;

    public Campo(int linhas, int colunas, int minasT) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minasT = minasT;
        
        criarQuadrados();
        System.out.println("passei");
        colocarMinas();
        colocarNumeros();
        
        System.out.println("passei");
    }
    
    public final void criarQuadrados() {
        quadrados  = new Quadrado[linhas][colunas];
        for(int i=0; i<linhas; i++) {
            for(int j=0; j<colunas; j++) {
                this.quadrados[i][j] = new Quadrado(i, j);
            }
        }
    }
    
    public final int colocarMinas() {
        int numM = minasT;
        double chance = (double) minasT/(linhas*colunas);
        while(numM>0) {
            for(int i=0; i<linhas; i++) {
                for(int j=0; j<colunas; j++) {
                    if(this.quadrados[i][j].isTemM()==false){
                        if(Math.random()<chance) {
                            this.quadrados[i][j].setTemM(true);
                            numM--;
                            if(numM==0)
                                return 0;
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    public final void colocarNumeros() {
        
        for(int i=0; i<linhas; i++) {
            for(int j=0; j<colunas; j++) {
                if(i!=0 && j!=0){
                    if(quadrados[i-1][j-1].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(i!=0){
                    if(quadrados[i-1][j].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(j!=0){
                    if(quadrados[i][j-1].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(i!=(linhas-1) && j!=(colunas-1)) {
                    if(quadrados[i+1][j+1].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(i!=(linhas-1)) {
                    if(quadrados[i+1][j].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(j!=(colunas-1)) {
                    if(quadrados[i][j+1].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(i!=(linhas-1) && j!=0) {
                    if(quadrados[i+1][j-1].isTemM())
                        quadrados[i][j].addNumero();
                }
                
                if(i!=0 && j!=(colunas-1)) {
                    if(quadrados[i-1][j+1].isTemM())
                        quadrados[i][j].addNumero();
                }
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getMinasT() {
        return minasT;
    }

    public void setMinasT(int minasT) {
        this.minasT = minasT;
    }

    public Quadrado[][] getQuadrados() {
        return quadrados;
    }
    
}
