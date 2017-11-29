package com.tigo.customerinformation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

/**
 *
 * @author vperez
 * 
 * Clase encargada de retornar el objeto modelado y donde se ejecutan los queries
 * requeridos para el response del api.
 */
@Service
public class CustomerService {

    @Autowired
    JdbcTemplate conexion;
    UsageInformation findById(String msisdn) {
        UsageInformation respuesta = null;
        try{
            SqlRowSet registro;
            registro = conexion.queryForRowSet("SELECT V.TCCGRF, V.TCCOPL, "
                    + "C.TCTICL, P.PLDEPL, P.PLCOMA FROM QSTCDAT.V1SERHED V, QSTCDAT.V1CLIENT C, "
                    + "QSTCDAT.V1TIPCLI T,QSTCDAT.V1PLAOPT P "
                    + "WHERE V.TCCCLI=C.TCCCLI AND T.TCTICL=C.TCTICL "
                    + "AND P.PLCOPL=V.TCCOPL AND V.TCNTEL='" + msisdn + "'");
            if (registro.next()){
                respuesta = new UsageInformation();
                respuesta.setMsisdn(msisdn);
                respuesta.setBillingCycle(registro.getString(1));
                respuesta.setPlanCode(registro.getString(2));
                respuesta.setClientType(registro.getString(3));
                respuesta.setPlanName(registro.getString(4));
                respuesta.setPlanType(registro.getString(5));
            }
            
        }catch(Exception ex){
            System.out.println("Error al consultar el teléfono: " + ex.toString());
        }
        return respuesta;
    }
    
}
