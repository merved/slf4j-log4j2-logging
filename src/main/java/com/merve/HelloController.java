package com.merve;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

//https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html

//@Slf4j
@Controller
public class HelloController {
   private static final Logger log = LoggerFactory.getLogger(HelloController.class); //log4j2 -slf4j her class içinde bu satırı yazmamak için  slf4j anatasyon kullanılabilir.
    //private static final Logger logger = LogManager.getLogger(HelloController.class); //log4j2
   // private static Logger log = LoggerFactory.getLogger(HelloController.class); //slf4j-logback
    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
    @GetMapping("/")
    public String main(Model model) {
        // pre-java 8

        if (log.isDebugEnabled()) {
            log.debug("Hello from Log4j 2 - num : {}", num);
        }
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            log.info("Deneme");
        }
        Long end = System.currentTimeMillis();
        log.info(" Geçen süre " + (end - start) + " ms.");
        // java 8 lambda, no need to check log level
        //logger.debug("Hello from Log4j 2 - num : {}", () -> num);

        model.addAttribute("tasks", num);

        return "welcome"; //view
    }
    private int getNum() {
        return 100;
    }
}
