package pro.buildmysoftware.segregation;

import pro.buildmysoftware.order.PurchaseOrder;

import java.awt.event.MouseEvent;
import java.nio.file.Path;

// We have to implement all the methods, even if we handle only click event,
// so this example violates Interface Segregation Principle
public class ClickMouseEventListener implements MultipleOperationsInterface {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Handle click event: " + e);
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void saveFile(Path file, Path target) {

	}

	@Override
	public void calculateCost(PurchaseOrder order) {

	}
}
