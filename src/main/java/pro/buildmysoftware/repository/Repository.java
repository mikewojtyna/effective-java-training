package pro.buildmysoftware.repository;

import pro.buildmysoftware.order.PurchaseOrder;

import java.util.Optional;
import java.util.UUID;

public interface Repository {

	Optional<PurchaseOrder> findById(UUID id);

	void save(PurchaseOrder order);
}
