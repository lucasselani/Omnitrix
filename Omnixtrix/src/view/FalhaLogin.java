package view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class FalhaLogin extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public FalhaLogin(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginTop = 10;
		gridLayout.marginLeft = 10;
		setLayout(gridLayout);
		
		Label lbl_1 = new Label(this, SWT.NONE);
		lbl_1.setText("Failure to login!");
		
		Label lbl_2 = new Label(this, SWT.NONE);
		lbl_2.setText("Check your username and password.");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
