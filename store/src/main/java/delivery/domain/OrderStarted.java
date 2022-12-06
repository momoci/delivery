package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String foodId;
    private String status;
    private String address;
    private Long orderCapacity;
    private Long orderCount;

    public OrderStarted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderStarted(){
        super();
    }
}
