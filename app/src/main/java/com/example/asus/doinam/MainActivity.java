package com.example.asus.doinam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDoiNam;
    TextView txtvAL, txtvDL, txtvKQ;
    EditText edtDL, edtAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvDL = (TextView) findViewById(R.id.textViewDL);
        txtvAL = (TextView) findViewById(R.id.textViewAL);
        txtvKQ = (TextView) findViewById(R.id.textViewKQ);
        edtDL = (EditText) findViewById(R.id.editTextDL);
        btnDoiNam = (Button) findViewById(R.id.buttonChuyen);
        //Sự kiện click
        btnDoiNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiDL = edtDL.getText().toString();// lấy giá trị nhập vào
                int namDL = Integer.parseInt(chuoiDL);// chuyển chuỗi vào sang kiểu int
                String can="", chi = "";
                switch (namDL%10)
                {
                    case 0: can="Canh";
                        break;
                    case 1: can="Tân";
                        break;
                    case 2: can="Nhâm";
                        break;
                    case 3: can="Quý";
                        break;
                    case 4: can="Giáp";
                        break;
                    case 5: can="Ất";
                        break;
                    case 6: can="Bính";
                    break;
                    case 7: can="Đinh";
                        break;
                    case 8: can="Mậu";
                        break;
                    case 9: can="Kỷ";
                        break;

                }
                switch (namDL%12)
                {
                    case 0: chi="Thân";
                        break;
                    case 1: chi="Dậu";
                        break;
                    case 2: chi="Tuất";
                        break;
                    case 3: chi="Hợi";
                        break;
                    case 4: chi="Tý";
                        break;
                    case 5: chi="Sửu";
                        break;
                    case 6: chi="Dần";
                        break;
                    case 7: chi="Mẹo";
                        break;
                    case 8: chi="Thìn";
                        break;
                    case 9: chi="Tỵ";
                        break;
                    case 10: chi="Ngọ";
                        break;
                    case 11: chi="Mùi";
                        break;

                }
                String KQ = can +" "+ chi;
                txtvKQ.setText(KQ);
               // txtvKQ.setText(can.concat(chi));

            }
        });
    }
}
