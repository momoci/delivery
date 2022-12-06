package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderReject extends AbstractEvent {

    private Long id;
    private String orderId;
    private String foodId;
    private String status;
    private String address;
    private Long orderCapacity;
    private Long orderCount;

    public OrderReject(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderReject(){
        super();
    }
}
