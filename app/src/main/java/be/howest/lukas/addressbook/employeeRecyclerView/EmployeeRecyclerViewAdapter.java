package be.howest.lukas.addressbook.employeeRecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.models.Contact;

public class EmployeeRecyclerViewAdapter extends RecyclerView.Adapter<EmployeeRecyclerViewHolder> {
    private List<Contact> _contacts;

    public EmployeeRecyclerViewAdapter(List<Contact> contacts) {
        _contacts = contacts;
    }

    @NonNull
    @Override
    public EmployeeRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_recycle_view_holder, viewGroup, false);
        return new EmployeeRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeRecyclerViewHolder viewHolder, int i) {
        Contact contact = _contacts.get(i);
        viewHolder.setContact(contact);
    }

    @Override
    public int getItemCount() {
        return _contacts.size();
    }

}
