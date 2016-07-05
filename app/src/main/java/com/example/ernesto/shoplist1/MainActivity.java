package com.example.ernesto.shoplist1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button btnScan, btnCart, btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnScan = (Button) findViewById(R.id.btnScan);
        Button btnCart = (Button) findViewById(R.id.btnCart);
        Button btnHistory = (Button) findViewById(R.id.btnHistory);

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.ernesto.shoplist1.ScanActivity.class));

            }
        });

        btnCart.setOnClickListener(new View.OnClickListener(){;

            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, com.example.ernesto.shoplist1.CartActivity.class));
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener(){;

            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, com.example.ernesto.shoplist1.HistoryActivity.class));
            }
        });
    }
}
