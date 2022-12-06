package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderChanged extends AbstractEvent {

    private Long id;
    private String foodId;
    private String address;
    private String status;
    private String customerId;
}


