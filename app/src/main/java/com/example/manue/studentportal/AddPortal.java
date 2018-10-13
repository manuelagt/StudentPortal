package com.example.manue.studentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPortal extends AppCompatActivity {

    String urlText;
    String titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText editUrlText = findViewById(R.id.editUrlText);
        final EditText editTitleText = findViewById(R.id.editTitleText);

        Button button = findViewById(R.id.addButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                urlText = editUrlText.getText().toString();
                titleText = editTitleText.getText().toString();

                editUrlText.setText("http://");
                editTitleText.setText("");

                if(!TextUtils.isEmpty(titleText)) {
                    Intent intent = new Intent(AddPortal.this, MainActivity.class);
                    intent.putExtra("textUrl", urlText);
                    intent.putExtra("textTitle", titleText);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Please, enter a title", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
