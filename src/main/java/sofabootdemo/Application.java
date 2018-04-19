package sofabootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello boot " + new Random().nextDouble();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
