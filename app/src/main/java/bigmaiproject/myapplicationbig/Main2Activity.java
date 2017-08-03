package bigmaiproject.myapplicationbig;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView,textView4,textView6;
    String message,message2,message3;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView6 = (TextView)findViewById(R.id.textView6);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            message = bundle.getString("ss");
            message2 = bundle.getString("mm");
            message3 = bundle.getString("aa");
            textView.setText(message);
            textView4.setText(message2);
            textView6.setText(message3);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button2 = new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(button2);
                }
            });
        }
    }
}
