package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private String address;
    private String status;
    private String customerId;

    public OrderPlaced(OrderList aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
