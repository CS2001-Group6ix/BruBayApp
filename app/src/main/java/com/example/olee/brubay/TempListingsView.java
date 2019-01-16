package com.example.olee.brubay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class TempListingsView extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_listings_view);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        // call toast method
//        setSingleEvent(mainGrid);
        // call loadActivity method
        loadActivity(mainGrid);
    }

    private void loadActivity(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView)mainGrid.getChildAt(i);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Intent intent = new Intent(this, AccountInformationView.class);

                    Intent intent = new Intent(TempListingsView.this, AccountInformationView.class);

                    startActivity(intent);
                }
            });
        }
    }

//  create a Toast message on screen OnClick
    private void setSingleEvent(GridLayout mainGrid) {

        // loop over all children of mainGrid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int x = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(TempListingsView.this, "Clicked at index " + x, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
