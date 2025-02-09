package itstep.learning.androidapp213;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.text_view1);
        findViewById(R.id.button_increment).setOnClickListener(this::onIncrementButtonClicked);
        findViewById(R.id.button_decrement).setOnClickListener(this::onDecrementButtonClicked);
    }

    public void onIncrementButtonClicked(View view) {
        int currentValue = Integer.parseInt(tv1.getText().toString());
        tv1.setText(String.valueOf(currentValue + 1));
    }

    public void onDecrementButtonClicked(View view) {
        int currentValue = Integer.parseInt(tv1.getText().toString());
        tv1.setText(String.valueOf(currentValue - 1));
    }
}
