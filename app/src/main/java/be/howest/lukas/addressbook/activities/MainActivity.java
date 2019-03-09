package be.howest.lukas.addressbook.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import be.howest.lukas.addressbook.R;
import be.howest.lukas.addressbook.employeeRecyclerView.EmployeeRecyclerViewAdapter;
import be.howest.lukas.addressbook.models.Employee;

public class MainActivity extends AppCompatActivity {

    private static List<Employee> _employees = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = this.findViewById(R.id.recyclerViewContacts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new EmployeeRecyclerViewAdapter(_employees));
        getEmployeesFromSRV();
    }

    private void getEmployeesFromSRV() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, "http://192.168.0.249:8080/employees", null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        ObjectMapper mapper = new ObjectMapper();
                       _employees = new ArrayList<>();

                        try {
                            JSONArray arr = response.getJSONArray("recordset");

                            for(int i = 0; i < arr.length(); i++) {
                                _employees.add(mapper.readValue(arr.get(i).toString(), Employee.class));
                            }

                            RecyclerView recyclerView = findViewById(R.id.recyclerViewContacts);
                            recyclerView.setAdapter(new EmployeeRecyclerViewAdapter(_employees));

                        } catch (JSONException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                }, error -> {
                    error.printStackTrace();
                    Log.d("onErrorResponse", error.getMessage());
                });

        queue.add(jsonObjectRequest);
    }
}
