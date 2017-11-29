
package com.tigo.customerinformation;

/**
 *
 * @author vperez
 * Clase para definir los errores personalizados. Aquí se pueden definir
 * los formatos requeridos para retornar cuando se encuentran errores.
 */
public class CustomErrorType {

    private String errorMessage;
 
    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }
    
}
