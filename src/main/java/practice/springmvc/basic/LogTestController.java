package practice.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String Logtest() {
        String name = "Spring";

        System.out.println("name = " + name);

        //옛날 스타일
        if(log.isDebugEnabled()){
            log.debug(" debug log={}", name);
        }

        log.trace(" info log={}", name);
        log.debug(" debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);
        return "ok";
    }
}
