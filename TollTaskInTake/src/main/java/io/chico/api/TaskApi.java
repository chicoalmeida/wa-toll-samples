package io.chico.api;

import io.chico.TaskProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Francisco Almeida
 */
@RestController
public class TaskApi {

    @Autowired
    private TaskProcessor taskProcessor;

    @RequestMapping(path = "/tasks", method = POST)
    public String launchTask(@RequestBody String s){
        taskProcessor.publishRequest(s);
        System.out.println("request made");
        return "success";
    }
}
