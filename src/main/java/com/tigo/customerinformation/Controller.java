package com.tigo.customerinformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vperez
 * Clase que se encarga de controlar el servicio, en esta clase se definen los paths
 * y los parámetros que vienen en cada una de las apis.
 */
@RestController
@RequestMapping("/usage")
public class Controller {
    
    @Autowired
    CustomerService customerService;
    
    @RequestMapping(value = "/summary/{msisdn}", method = RequestMethod.GET)
    public ResponseEntity<?> getUsageSummary(@PathVariable("msisdn") String msisdn) {
        UsageInformation usageInfo = customerService.findById(msisdn);
        if (usageInfo == null) {
           
            return new ResponseEntity(new CustomErrorType("User with id " + msisdn + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usageInfo, HttpStatus.OK);
    }
}
