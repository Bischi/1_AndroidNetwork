package be.howest.lukas.addressbook.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.employeeRecyclerView.EmployeeRecyclerViewHolder;
import be.howest.lukas.addressbook.models.Contact;

public class EmployeeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        Intent intent = this.getIntent();
        Contact contact = (Contact)intent.getSerializableExtra(EmployeeRecyclerViewHolder.S_CONTACT);
        if(contact != null) {
            ((TextView)findViewById(R.id.contactDetail_tv_firstName)).setText(contact.getFirstName());
            ((TextView)findViewById(R.id.contactDetail_tv_lastName)).setText(contact.getLastName());
        }
    }
}
