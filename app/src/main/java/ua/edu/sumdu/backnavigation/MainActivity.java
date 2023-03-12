package ua.edu.sumdu.backnavigation;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.btn_donut:
                startActivity(new Intent(this, DonutActivity.class));
                break;
            case R.id.btn_froyo:
                startActivity(new Intent(this, FroyoActivity.class));
                break;
            case R.id.btn_icecream:
                startActivity(new Intent(this, IceCreamActivity.class));
                break;
        }
    }
}