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
class Quadrado {
    private String id;
    private int posL;
    private int posC;
    private boolean revelado;
    private boolean temM;
    private int numero;
    private boolean bandeira;

    public Quadrado(int posL, int posC) {
        this.id = posL+"_"+posC;
        this.posL = posL;
        this.posC = posC;
        this.revelado = false;
        this.temM = false;
        this.numero = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBandeira() {
        return bandeira;
    }

    public void setBandeira(boolean bandeira) {
        this.bandeira = bandeira;
    }
    
    
    public int getPosL() {
        return posL;
    }

    public void setPosL(int posL) {
        this.posL = posL;
    }

    public int getPosC() {
        return posC;
    }

    public void setPosC(int posC) {
        this.posC = posC;
    }

    public boolean isRevelado() {
        return revelado;
    }

    public void setRevelado(boolean revelado) {
        this.revelado = revelado;
    }

    public boolean isTemM() {
        return temM;
    }

    public void setTemM(boolean temM) {
        this.temM = temM;
    }

    public int getNumero() {
        return numero;
    }

    public void addNumero() {
        this.numero++;
    }
    
    
    
    
    
}
