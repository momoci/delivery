package delivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "order", url = "${api.url.order}")
public interface PaymentStatusService {
    @RequestMapping(method= RequestMethod.PUT, path="/paymentStatuses/{id}/cancelpayment")
    public void cancelPayment(@PathVariable("id") Long id, @RequestBody CancelPaymentCommand cancelPaymentCommand );
}
