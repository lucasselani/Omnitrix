package view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TelaLogin extends Composite {
	private Text text_id;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaLogin(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginLeft = 50;
		gridLayout.marginRight = 50;
		setLayout(gridLayout);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		text_id = new Text(this, SWT.BORDER);
		text_id.setText("ID");
		text_id.setToolTipText("");
		text_id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Text text_passwd = new Text(this, SWT.BORDER);
		text_passwd.setText("Password");
		text_passwd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btn_enter = new Button(this, SWT.NONE);
		btn_enter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO
			}
		});
		btn_enter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btn_enter.setText("Enter");
		
		Button btn_register = new Button(this, SWT.CENTER);
		btn_register.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO
			}
		});
		btn_register.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btn_register.setText("Register");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
