package com.example.mdpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.mdpproject.sql.SQLHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class register extends AppCompatActivity {
    EditText edemail,edpass,edusername;
    Button btnregis,btntologin;
    SQLHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edemail = findViewById(R.id.edemail_register);
        edpass = findViewById(R.id.edpassword_register);
        edusername = findViewById(R.id.edusername_register);
        btnregis = findViewById(R.id.btnregister);
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = edemail.getText().toString();
                String pass = edpass.getText().toString();
                String username = edusername.getText().toString();
                if(!mail.isEmpty() && !pass.isEmpty() && !username.isEmpty()){
                    registerUser(mail,pass,username);
                }else{
                    Toast.makeText(register.this, "pastikan semua field terisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btntologin = findViewById(R.id.btntologin);
        btntologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(register.this,MainActivity.class);
                startActivity(t);
            }
        });
        db = new SQLHandler(getApplicationContext());
    }
    private void registerUser(final String mail, final String pass, final String username){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://192.168.43.137/mdpproject/mdpproject.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject job = new JSONObject((response));
                    String msg= job.getString("Message");
                    Toast.makeText(register.this, msg, Toast.LENGTH_SHORT).show();
//                    if(!error){
//                        String uid = job.getString("uid");
//                        JSONObject user = job.getJSONObject("user");
//                        String email = user.getString("email");
//                        String pass = user.getString("password");
//                        String username = user.getString("username");
//                        db.adduser(email,pass,username,1);
//                    }
//                    else{
//                        Toast.makeText(register.this, "ERROR", Toast.LENGTH_SHORT).show();
//                    }

                }
                catch(JSONException ex)
                {
                    ex.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    Toast.makeText(register.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String,String>();
                params.put("function","c");
                params.put("email",mail);
                params.put("username",username);
                params.put("password",pass);

                return params;
            }
        };
        Volley.newRequestQueue(getApplicationContext()).add(stringRequest);
    }
}
