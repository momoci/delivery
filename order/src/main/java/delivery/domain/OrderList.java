package delivery.domain;

import delivery.domain.OrderCanceled;
import delivery.domain.OrderPlaced;
import delivery.domain.OrderChanged;
import delivery.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderList_table")
@Data

public class OrderList  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        delivery.external.CancelPaymentCommand cancelPaymentCommand = new delivery.external.CancelPaymentCommand();
        // mappings goes here
        OrderApplication.applicationContext.getBean(delivery.external.PaymentStatusService.class)
            .cancelPayment(/* get???(), */ cancelPaymentCommand);



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();



        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderChanged orderChanged = new OrderChanged(this);
        orderChanged.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderListRepository repository(){
        OrderListRepository orderListRepository = OrderApplication.applicationContext.getBean(OrderListRepository.class);
        return orderListRepository;
    }






}
