package pro.buildmysoftware.repository;

import pro.buildmysoftware.order.PurchaseOrder;

import java.util.Optional;
import java.util.UUID;

public interface OrderDao {

	void insert(PurchaseOrder order);

	Optional<PurchaseOrder> select(String whereSql,
				       Mapper<PurchaseOrder> mapper);

	Optional<String> selectNameColumn(UUID id);

	Optional<User> findUserOfOrder(UUID orderId, Mapper<User> mapper);
}
