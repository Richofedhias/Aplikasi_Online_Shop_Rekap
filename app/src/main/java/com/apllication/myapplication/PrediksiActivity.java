package com.apllication.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
            int result[] = tfSimpleRegression.predict(new int[]{hari});
            textViewResult.setText("Prediksi Hari ke " + hari + "\n Rp." + result[0] + "Juta");
        });
    }
}