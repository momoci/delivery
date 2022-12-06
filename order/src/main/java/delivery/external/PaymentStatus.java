package delivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class PaymentStatus {

    private Long id;
    private Long orderId;
    private Boolean cancel;
}


