package ch.rogerjaeggi.intellijtest.web;

import ch.rogerjaeggi.intellijtest.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class TestController {

    @Autowired
    private StringService stringService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public String helloWorld(@PathVariable(value = "name") String name) {
        return "Hello, " + stringService.upper(name);
    }

}