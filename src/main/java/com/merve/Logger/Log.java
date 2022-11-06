package com.merve.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log {
     /*   File file = new File("C:\\Users\\merve.demirci\\Agito_deployment\\springboot-logging\\src\\main\\resources\\log4j2.xml");
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.setConfigLocation(file.toURI());
        //Logger log  = LogManager.getLogger(YourClass.class);*/

    public void info(String message){
        log.info(message);
    } // loga yazdırmak istediğim mesaj . hazır metot kullanıldı. loga info tag ile yazdırılır.

    public void warn(String message){
        log.warn(message);
    }

    public void error(String message){
        log.error(message);
    }

}
