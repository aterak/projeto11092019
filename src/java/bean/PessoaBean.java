/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author EMPRESA
 */
@Named(value = "pessoaBean")
@RequestScoped
public class PessoaBean {

    /**
     * Creates a new instance of PessoaBean
     */
    public PessoaBean() {
    }
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void transferir(){
    
        FacesContext context = FacesContext.getCurrentInstance();
        ResultadoBean rb = context.getApplication().evaluateExpressionGet(context,"#{resultadoBean}" , ResultadoBean.class);
        
        rb.setResultado(this.nome);
    
    }
    
    public void recado(){
    
    String joje = "";
    }
}
