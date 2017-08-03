package bigmaiproject.myapplicationbig;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText2,editText3;
    Button button;
    String message,message2,message3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = editText.getText().toString();
                message2 = editText2.getText().toString();
                message3 = editText3.getText().toString();
                if(!message.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("ss",message);
                    intent.putExtra("mm",message2);
                    intent.putExtra("aa",message3);
                    startActivity(intent);
                }
            }
        });

    }
}
