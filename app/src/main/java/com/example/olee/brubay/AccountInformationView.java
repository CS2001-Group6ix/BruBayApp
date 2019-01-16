package com.example.olee.brubay;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AccountInformationView extends AppCompatActivity {

    Button contactBtn;
    Button reportBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_information_view);

//        getSupportActionBar().setTitle("New Title");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        contactBtn = (Button)findViewById(R.id.contactBtn);
        reportBtn = (Button)findViewById(R.id.reportBtn);

        createToast(contactBtn, "Contact User: load_messages_activity");
        createToast(reportBtn, "Report User: load_report_activity");
    }

    private void createToast(Button btn, String toast) {

        final String test = toast;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountInformationView.this, test, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
