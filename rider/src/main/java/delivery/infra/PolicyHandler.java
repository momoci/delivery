package delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderFinished'")
    public void wheneverOrderFinished_Updatestatus(@Payload OrderFinished orderFinished){

        OrderFinished event = orderFinished;
        System.out.println("\n\n##### listener Updatestatus : " + orderFinished + "\n\n");


        

        // Sample Logic //
        Delivery.updatestatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccept'")
    public void wheneverOrderAccept_Updatestatus(@Payload OrderAccept orderAccept){

        OrderAccept event = orderAccept;
        System.out.println("\n\n##### listener Updatestatus : " + orderAccept + "\n\n");


        

        // Sample Logic //
        Delivery.updatestatus(event);
        

        

    }

}


