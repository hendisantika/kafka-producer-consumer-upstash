package id.my.hendisantika.kafkaproducerconsumerupstash;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.String.format;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-producer-consumer-upstash
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/23/24
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RandomNumberProducer {

    private static final int MIN = 10;
    private static final int MAX = 100_000;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedRate = 1000)
    public void produce() throws UnknownHostException {
        int random = ThreadLocalRandom.current().nextInt(MIN, MAX);
        this.kafkaTemplate.sendDefault(String.valueOf(random));
        //just for logging
        String hostName = InetAddress.getLocalHost().getHostName();
        log.info(format("%s produced %d", hostName, random));
    }
}
