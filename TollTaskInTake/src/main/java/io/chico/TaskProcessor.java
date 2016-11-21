package io.chico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Francisco Almeida
 */

@Component
@EnableBinding(Source.class)
public class TaskProcessor {


    @Autowired
    private Source source;

    public void publishRequest(String payload) {

        String url = "maven://io.chico:springcloudtask:jar:0.0.1-SNAPSHOT";

        List<String> input = new ArrayList<>(asList(payload.split(",")));

        TaskLaunchRequest request = new TaskLaunchRequest(url, input, null, null);

        System.out.println("created task request");

        GenericMessage<TaskLaunchRequest> message = new GenericMessage<>(request);


        this.source
                .output()
                .send(message);
    }
}
