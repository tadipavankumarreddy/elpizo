package com.elpizotechnologies.elpizo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;


public class HomeActivity extends AppCompatActivity {

    private EditText username, password;
    private RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = findViewById(R.id.username);
        password = findViewById(R.id.userpassword);
    }

    public void signInUser(View view) {
        String uname = username.getText().toString();
        String upass = password.getText().toString();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://103.44.12.218:8080/elpizo/auth/login",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.isEmpty()){
                            Toast.makeText(HomeActivity.this, "Response Didnot arrive!, unable to login", Toast.LENGTH_SHORT).show();
                        }else{
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                boolean successful = jsonObject.getBoolean("successful");
                                if(successful){
                                    Toast.makeText(HomeActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(HomeActivity.this, LoginSuccessActivity.class));
                                }else{
                                    Toast.makeText(HomeActivity.this, "Login Unsuccessful!", Toast.LENGTH_SHORT).show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(HomeActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }){


            @Override
            public byte[] getBody() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("username",uname);
                jsonObject.addProperty("password",upass);
                return jsonObject.toString().getBytes();
            }

            @Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }
        };

        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}