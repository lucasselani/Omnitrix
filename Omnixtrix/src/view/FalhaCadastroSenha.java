package view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

public class FalhaCadastroSenha extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public FalhaCadastroSenha(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginTop = 10;
		gridLayout.marginLeft = 10;
		setLayout(gridLayout);
		
		Label lbl_1 = new Label(this, SWT.NONE);
		lbl_1.setText("Failure to register a new user!");
		
		Label lbl_2 = new Label(this, SWT.NONE);
		lbl_2.setText("Your password must contain between \n5-10 characters and at least a number");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
