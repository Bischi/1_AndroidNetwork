package be.howest.lukas.addressbook.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.employeeRecyclerView.EmployeeRecyclerViewHolder;
import be.howest.lukas.addressbook.models.Contact;
import be.howest.lukas.addressbook.models.Employee;

public class EmployeeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        Intent intent = this.getIntent();
        Employee employee = (Employee) intent.getSerializableExtra(EmployeeRecyclerViewHolder.S_CONTACT);
        if(employee != null) {
            ((TextView)findViewById(R.id.contactDetail_tv_firstName)).setText(employee.getFirstname());
            ((TextView)findViewById(R.id.contactDetail_tv_lastName)).setText(employee.getLastname());
        }
    }
}
