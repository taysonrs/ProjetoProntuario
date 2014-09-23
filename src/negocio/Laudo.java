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
public class Laudo {
    
    private String medico;
    private Date dataLaudo;
    private String mamaDir;
    private String mamaEsq;

    public Laudo() {
    }

    public String getMedico() {
        return medico;
    }

    public Date getDataLaudo() {
        return dataLaudo;
    }

    public String getMamaDir() {
        return mamaDir;
    }

    public String getMamaEsq() {
        return mamaEsq;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setDataLaudo(Date dataLaudo) {
        this.dataLaudo = dataLaudo;
    }

    public void setMamaDir(String mamaDir) {
        this.mamaDir = mamaDir;
    }

    public void setMamaEsq(String mamaEsq) {
        this.mamaEsq = mamaEsq;
    }
    
    
    
}
