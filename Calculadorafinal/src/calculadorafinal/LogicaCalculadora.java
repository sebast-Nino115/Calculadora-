/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafinal;

/**
 *
 * @author Acer
 */
public class LogicaCalculadora {
   


    public LogicaCalculadora(){}
     public String valor1, valor2, signo;
     public Double resultadocalc= 0.0;
    // metodo de operaciones
    public String operaciones(String valor1, String valor2, String signo){
        String respuesta;
        
        if(signo.equals("+")){
            resultadocalc=Double.parseDouble(valor1)+Double.parseDouble(valor2);
        }else if (signo.equals("/")){
            resultadocalc=Double.parseDouble(valor1)/Double.parseDouble(valor2);
        }else if (signo.equals("-")){
            resultadocalc=Double.parseDouble(valor1)-Double.parseDouble(valor2);
        }else if(signo.equals("*")){
            resultadocalc=Double.parseDouble(valor1)*Double.parseDouble(valor2);
        }else if(signo.equals("x^y")){
            resultadocalc = Math.pow(Double.parseDouble(valor1),Double.parseDouble(valor2));
        }
        
       
        respuesta=resultadocalc.toString();
        return respuesta;
        
    } 
    // metodo de Porcentaje
    
    // metodo de Raiz
    
    // metodo de Exponente
    
    // metodo de Sen
    
    // metodo de Cos
    
    // metodo de Tan


}
