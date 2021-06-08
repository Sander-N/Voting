package voting.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${messaging.exchange}")
    private String exchange;

    @Value("${messaging.routingKey}")
    private String routingKey;

    public void send(String vote) {
        rabbitTemplate.convertAndSend(exchange, routingKey, vote);
    }

}
