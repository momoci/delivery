package delivery.infra;
import delivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/paymentStatuses")
@Transactional
public class PaymentStatusController {
    @Autowired
    PaymentStatusRepository paymentStatusRepository;



    @RequestMapping(value = "paymentStatuses/{id}/cancelpayment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public PaymentStatus cancelPayment(@PathVariable(value = "id") Long id, @RequestBody CancelPaymentCommand cancelPaymentCommand, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /paymentStatus/cancelPayment  called #####");
            Optional<PaymentStatus> optionalPaymentStatus = paymentStatusRepository.findById(id);
            
            optionalPaymentStatus.orElseThrow(()-> new Exception("No Entity Found"));
            PaymentStatus paymentStatus = optionalPaymentStatus.get();
            paymentStatus.cancelPayment(cancelPaymentCommand);
            
            paymentStatusRepository.save(paymentStatus);
            return paymentStatus;
            
    }
    



}
