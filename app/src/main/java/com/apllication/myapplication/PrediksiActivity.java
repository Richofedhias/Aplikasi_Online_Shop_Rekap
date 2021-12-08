package com.apllication.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrediksiActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private TextView textViewResult;
    private Button buttonPredict;

    private TFSimpleRegression tfSimpleRegression;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediksi);

        editTextNumber = findViewById(R.id.editTextNumber);
        textViewResult = findViewById(R.id.textView);
        buttonPredict = findViewById(R.id.buttonPredict);

        tfSimpleRegression = new TFSimpleRegression(getApplicationContext());

        setButtonPredictListener();
    }

    private void setButtonPredictListener(){
        buttonPredict.setOnClickListener(e -> {
            float number = Float.parseFloat(editTextNumber.getText().toString());
            int hari = Integer.parseInt(editTextNumber.getText().toString());
            float result[] = tfSimpleRegression.predict(new float[]{hari});
            int a = (int) result[0];
            textViewResult.setText("Prediksi Hari ke " + hari + "\n Rp." + a + " Juta");
        });
    }
}