package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private Boolean cancel;

    public Paid(PaymentStatus aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
