package be.howest.lukas.addressbook.employeeRecyclerView;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.activities.EmployeeDetailActivity;
import be.howest.lukas.addressbook.models.Contact;
import be.howest.lukas.addressbook.models.Employee;

public class EmployeeRecyclerViewHolder extends RecyclerView.ViewHolder {
    private Employee _employee;
    private TextView _textView;

    public static final String S_CONTACT = EmployeeRecyclerViewHolder.class.getCanonicalName() + ".CONTACT";

    public EmployeeRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        _textView = itemView.findViewById(R.id.textViewList);

        View.OnClickListener listener = v -> EmployeeRecyclerViewHolder.this.onClick();
        itemView.findViewById(R.id.relativeLayout).setOnClickListener(listener);
    }

    public TextView getTextView() {
        return _textView;
    }

    public void setEmployee(Employee employee) {
        _employee = employee;
        _textView.setText(_employee.getFirstname());
    }

    public void onClick() {
        Intent intent = new Intent(_textView.getContext(), EmployeeDetailActivity.class);
        intent.putExtra(S_CONTACT, _employee);
        _textView.getContext().startActivity(intent);
    }
}
