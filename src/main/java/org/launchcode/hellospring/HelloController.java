package org.launchcode.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
//                "<input type = 'text' name = 'name' >" +
//                "<input type = 'submit' value = 'Greet Me!' >" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    @GetMapping("form")
    public String languageMenu(){
        return "<html>" +
                "<body>" +
                "<form action= '/hello' method= 'post'>" +
                "<input type= 'text' name= 'name' >" +
                "<input type= 'submit' value= 'Greet me'>" +
                "</form>" +
                "<label for='lang-select'>Choose a language:</label>" +
                "<select name='language' id='lang-select'>" +
                "<option value=''>Please choose a language</option>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='arabic'>Arabic</option>" +
                "<option value='swedish'>Swedish</option>" +
                "</select>" +
                "</body>" +
                "</html>";
    }

    public static String createMessage(String name, String language) {
        if (language == "english") {
            return "Hello, " + name + "!";
        } else if (language == "spanish") {
            return "Hola, " + name + "!";
        } else if (language == "french") {
            return "Bonjour, " + name + "!";
        } else if (language == "arabic") {
            return "Hi, " + name + "!";
        } else if (language == "swedish") {
            return "Hi, " + name + "!";
        } else {
            return "Hi, " + name + "!";
        }
    }


}
