package delivery.infra;
import delivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PaymentStatusHateoasProcessor implements RepresentationModelProcessor<EntityModel<PaymentStatus>>  {

    @Override
    public EntityModel<PaymentStatus> process(EntityModel<PaymentStatus> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/cancelpayment").withRel("cancelpayment"));

        
        return model;
    }
    
}
