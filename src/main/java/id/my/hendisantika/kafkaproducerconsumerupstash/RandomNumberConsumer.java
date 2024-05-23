package id.my.hendisantika.kafkaproducerconsumerupstash;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static java.lang.String.format;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-producer-consumer-upstash
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/23/24
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RandomNumberConsumer {

    @KafkaListener(topics = "random-number")
    public void consume(String message) throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        log.info(format("%s consumed %s", hostName, message));
    }
}
