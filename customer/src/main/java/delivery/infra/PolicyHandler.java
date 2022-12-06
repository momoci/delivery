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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccept'")
    public void wheneverOrderAccept_Notify(@Payload OrderAccept orderAccept){

        OrderAccept event = orderAccept;
        System.out.println("\n\n##### listener Notify : " + orderAccept + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderFinished'")
    public void wheneverOrderFinished_Notify(@Payload OrderFinished orderFinished){

        OrderFinished event = orderFinished;
        System.out.println("\n\n##### listener Notify : " + orderFinished + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderStarted'")
    public void wheneverOrderStarted_Notify(@Payload OrderStarted orderStarted){

        OrderStarted event = orderStarted;
        System.out.println("\n\n##### listener Notify : " + orderStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderReject'")
    public void wheneverOrderReject_Notify(@Payload OrderReject orderReject){

        OrderReject event = orderReject;
        System.out.println("\n\n##### listener Notify : " + orderReject + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_Notify(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener Notify : " + picked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_Notify(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener Notify : " + delivered + "\n\n");


        

        // Sample Logic //

        

    }

}


