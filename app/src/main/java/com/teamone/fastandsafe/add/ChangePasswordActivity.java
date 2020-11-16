package com.teamone.fastandsafe.add;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.teamone.fastandsafe.R;
import com.teamone.fastandsafe.database.SQLiteDAO;

public class ChangePasswordActivity extends AppCompatActivity {
    EditText edPass,edRepass;
    SQLiteDAO sqLiteDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        edPass = findViewById(R.id.edPassword);
        edRepass = findViewById(R.id.edRePassword);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_change_pass,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ok:

        }
        return super.onOptionsItemSelected(item);
    }

    public int validate(){
        int check = 1;
        if (edPass.getText().length() == 0
                || edRepass.getText().length() == 0 ){
            Toast.makeText(getApplicationContext(),"Bạn phải nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
            check= -1;
        }else {
            String pass = edPass.getText().toString();
            String rePass = edRepass.getText().toString();
            if (!pass.equals(rePass)){
                Toast.makeText(getApplicationContext(),"Mật khẩu không trùng khớp",Toast.LENGTH_SHORT).show();
                check = -1;
            }
        }
        return check;
    }
//    public void chanegePass(View view){
//        SharedPreferences sharedPreferences = getSharedPreferences("USER_FILE",MODE_PRIVATE);
//        String id = sharedPreferences.getString("ID","");
//        ContentValues values = new ContentValues();
//        values.put();
//        sqLiteDAO = new SQLiteDAO(this);
//        try {
//            if (validate()>0){
//                if (sqLiteDAO.updateById("employees_table",edPass.getText().toString(),id));
//            }
//        }
//    }
}