/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.util.Date;

/**
 *
 * @author cpl.5614124135
 */
public class Ficha {
    
    private Date data;
    private String queixas;
    private String sintomas;
    private String habitosAlimentares;
    private String mamografia;
    private String informacoes;
    private boolean cancerFamilia;
    private boolean protese;
    private boolean alteracaoMamilo;

    public Ficha() {
    }

    public Date getData() {
        return data;
    }

    public String getQueixas() {
        return queixas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getHabitosAlimentares() {
        return habitosAlimentares;
    }

    public String getMamografia() {
        return mamografia;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public boolean isCancerFamilia() {
        return cancerFamilia;
    }

    public boolean isProtese() {
        return protese;
    }

    public boolean isAlteracaoMamilo() {
        return alteracaoMamilo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setQueixas(String queixas) {
        this.queixas = queixas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setHabitosAlimentares(String habitosAlimentares) {
        this.habitosAlimentares = habitosAlimentares;
    }

    public void setMamografia(String mamografia) {
        this.mamografia = mamografia;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public void setCancerFamilia(boolean cancerFamilia) {
        this.cancerFamilia = cancerFamilia;
    }

    public void setProtese(boolean protese) {
        this.protese = protese;
    }

    public void setAlteracaoMamilo(boolean alteracaoMamilo) {
        this.alteracaoMamilo = alteracaoMamilo;
    }
    
    
    
}
