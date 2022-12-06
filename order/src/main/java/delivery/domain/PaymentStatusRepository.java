package delivery.domain;

import delivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="paymentStatuses", path="paymentStatuses")
public interface PaymentStatusRepository extends PagingAndSortingRepository<PaymentStatus, Long>{

}
