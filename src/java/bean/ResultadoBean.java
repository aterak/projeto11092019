/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author EMPRESA
 */
@Named(value = "resultadoBean")
@RequestScoped
public class ResultadoBean {

    /**
     * Creates a new instance of ResultadoBean
     */
    public ResultadoBean() {
    }
    
  private  String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}
