package delivery.domain;

import delivery.domain.Paid;
import delivery.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="PaymentStatus_table")
@Data

public class PaymentStatus  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Boolean cancel;

    @PostPersist
    public void onPostPersist(){


        Paid paid = new Paid(this);
        paid.publishAfterCommit();

    }

    public static PaymentStatusRepository repository(){
        PaymentStatusRepository paymentStatusRepository = OrderApplication.applicationContext.getBean(PaymentStatusRepository.class);
        return paymentStatusRepository;
    }



    public void cancelPayment(CancelPaymentCommand cancelPaymentCommand){
    }

    public static void pay(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        PaymentStatus paymentStatus = new PaymentStatus();
        repository().save(paymentStatus);

        Paid paid = new Paid(paymentStatus);
        paid.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(paymentStatus->{
            
            paymentStatus // do something
            repository().save(paymentStatus);

            Paid paid = new Paid(paymentStatus);
            paid.publishAfterCommit();

         });
        */

        
    }
    public static void rejectPayment(OrderReject orderReject){

        /** Example 1:  new item 
        PaymentStatus paymentStatus = new PaymentStatus();
        repository().save(paymentStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderReject.get???()).ifPresent(paymentStatus->{
            
            paymentStatus // do something
            repository().save(paymentStatus);


         });
        */

        
    }


}
