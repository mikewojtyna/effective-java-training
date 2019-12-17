package pro.buildmysoftware.segregation;

import pro.buildmysoftware.order.PurchaseOrder;

import java.awt.event.MouseListener;
import java.nio.file.Path;

public interface MultipleOperationsInterface extends MouseListener {

	void saveFile(Path file, Path target);

	void calculateCost(PurchaseOrder order);
}
