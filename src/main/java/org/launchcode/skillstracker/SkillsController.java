package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@ResponseBody
public class SkillsController {

    static String submissionLog;

    @GetMapping
    public static String introPage(){
      return  "<h1>Skills Tracker</h1>" +
                "<h2>List of skill</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public static String form(){
        return "<form action=\"form\" method=\"post\">\n" +
                "    <label for=\"nameInput\">Name:</label>\n" +
                "    <input type=\"text\" name=\"name\" id=\"nameInput\">\n" +
                "    <br>\n" +
                "    <label for=\"firstOption\">My favorite language</label>\n" +
                "    <select name=\"option1\" id=\"firstOption\">\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    <label for=\"secondOption\">My second favorite language</label>\n" +
                "    <select name=\"option2\" id=\"secondOption\">\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "    <br>\n" +
                "    <label for=\"thirdOption\">My third favorite language</label>\n" +
                "    <select name=\"option3\" id=\"thirdOption\">\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "<br>" +
                "<button type='submit'>Submit here</button>" +
                "</form>";
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public static String postForm(@RequestParam(defaultValue = "asdflkajdsf") String name, @RequestParam(defaultValue = "alsfdkjhjhad") String option1, @RequestParam(defaultValue = "sdfkljasdhfakl") String option2, @RequestParam(defaultValue = "aldskfja") String option3){
       String message;

       if(!Objects.equals(name,"asdflkajdsf") && !Objects.equals(option1, "alsfdkjhjhad") && !Objects.equals(option2, "sdfkljasdhfakl") && !Objects.equals(option3, "aldskfja")){

           message = "<h1>" + name + "</h1>\n" +
                   "<ol>\n" +
                   "    <li>" + option1 + "</li>\n" +
                   "    <li>" + option2 + "</li>\n" +
                   "    <li>" + option3 + "</li>\n" +
                   "</ol>";
           submissionLog = message;
       }

       return submissionLog;
    }

}
