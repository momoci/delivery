package delivery.domain;

import delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderFinished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String foodId;
    private String status;
    private String address;
    private Long orderCapacity;
    private Long orderCount;
}
