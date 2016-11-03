package view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class SucessoCadastro extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public SucessoCadastro(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginTop = 10;
		gridLayout.marginLeft = 10;
		setLayout(gridLayout);
		
		Label lbl_1 = new Label(this, SWT.NONE);
		lbl_1.setText("Successfully registered!");
		
		Label lbl_2 = new Label(this, SWT.NONE);
		lbl_2.setText("Your account was registered successfully.");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
