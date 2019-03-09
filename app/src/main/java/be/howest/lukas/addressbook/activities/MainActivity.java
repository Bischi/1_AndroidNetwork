package be.howest.lukas.addressbook.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.employeeRecyclerView.EmployeeRecyclerViewAdapter;
import be.howest.lukas.addressbook.models.Contact;

public class MainActivity extends AppCompatActivity {

    private static List<Contact> _contacts = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = this.findViewById(R.id.recyclerViewContacts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new EmployeeRecyclerViewAdapter(_contacts));

    }

}
