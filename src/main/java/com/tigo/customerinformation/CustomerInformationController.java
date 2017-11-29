
package com.tigo.customerinformation;

/**
 *
 * @author vperez
 * Clase principal que se encarga de levantar el Spring Boot con todas
 * las configuraciones requeridas. 
 */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;


@SpringBootApplication(scanBasePackages={"com.tigo.customerinformation"})
public class CustomerInformationController {
        public static void main(String[] args) throws Exception {
        SpringApplication.run(CustomerInformationController.class, args);
    }
}
