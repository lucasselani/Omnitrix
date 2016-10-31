package view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TelaCadastro extends Composite {
	private Text text_name;
	private Text text_age;
	private Text text_id;
	private Text text_password;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaCadastro(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginLeft = 50;
		gridLayout.marginHeight = 50;
		gridLayout.marginRight = 50;
		setLayout(gridLayout);
		
		Label lbl_name = new Label(this, SWT.NONE);
		lbl_name.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_name.setText("Name:");
		
		text_name = new Text(this, SWT.BORDER);
		text_name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lbl_age = new Label(this, SWT.NONE);
		lbl_age.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_age.setText("Age:");
		
		text_age = new Text(this, SWT.BORDER);
		text_age.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lbl_gender = new Label(this, SWT.NONE);
		lbl_gender.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_gender.setText("Gender:");
		
		CCombo combo_gender = new CCombo(this, SWT.BORDER);
		combo_gender.setText("Choose your gender");
		combo_gender.setItems(new String[] {"Masculino", "Feminino"});
		combo_gender.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lbl_id = new Label(this, SWT.NONE);
		lbl_id.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_id.setText("ID:");
		
		text_id = new Text(this, SWT.BORDER);
		text_id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lbl_password = new Label(this, SWT.NONE);
		lbl_password.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_password.setText("Password:");
		
		text_password = new Text(this, SWT.BORDER);
		text_password.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lbl_type = new Label(this, SWT.NONE);
		lbl_type.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lbl_type.setText("Type:");
		
		CCombo combo_type = new CCombo(this, SWT.BORDER);
		combo_type.setText("Choose your type access");
		combo_type.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(this, SWT.NONE);
		
		Button btn_confirm = new Button(this, SWT.NONE);
		btn_confirm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO
			}
		});
		btn_confirm.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btn_confirm.setText("Confirm");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
