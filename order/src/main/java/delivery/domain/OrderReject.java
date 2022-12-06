package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
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
}


