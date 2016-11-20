package io.chico.task;

import org.springframework.boot.CommandLineRunner;

/**
 * @author Francisco Almeida
 */
public class TollProcessingTask implements CommandLineRunner {
    @Override
    public void run(final String... strings) throws Exception {
        //parameters > stationId, license plate, timestap

        if (strings != null) {
            System.out.println("parameter length is " + strings.length);
            String stationId = strings[0];
            String licensePlate = strings[1];
            String timestaps = strings[2];

            System.out.println("Station ID is " + stationId + ", plate is " + licensePlate + ", timestamp is " + timestaps);
        }
    }
}
