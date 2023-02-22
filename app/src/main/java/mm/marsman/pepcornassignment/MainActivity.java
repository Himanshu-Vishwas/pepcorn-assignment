package mm.marsman.pepcornassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Item> items = new ArrayList<Item>();

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url1 ="https://devapi.pepcorns.com/api/test/getAllUsers";
        String url = "https://devapi.pepcorns.com/api/test/getAllPayments";
        String url3 = "https://jsonblob.com/api/1077997141624111104";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this, "Fetching...", Toast.LENGTH_SHORT).show();
                        // Parse the JSON response.

                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            JSONArray jsonArray = jsonObject.getJSONArray("response");
                            // Extract the required data from the JSON object and display it in your app's user interface.
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject object = jsonArray.getJSONObject(i);
                                String user_id = object.getString("user_id");
                                String name = object.getString("name");
                                String pay_id = object.getString("pay_id");
                                int status = object.getInt("status");
                                String stat;
                                if(status==1){
                                    stat="active";
                                }else{
                                    stat="failed";
                                }
                                items.add(new Item(user_id,name,stat,pay_id));




                                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                                recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


                                // Display the data in your app's user interface.

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Handle errors here.
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);



    }
}