package teamtreehouse.com.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class mainActivity extends Activity {

    private TextView mDigitaIdade;
    private Button mEnviarAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDigitaIdade = (TextView)findViewById(R.id.nameEditText);
        mEnviarAge = (Button)findViewById(R.id.enviarButton);


        mEnviarAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String age = mDigitaIdade.getText().toString();
                page(age);
            }
        });


    }

    private void page (String age) {

        Intent intent = new Intent(this, calcAgeActivity.class);
        intent.putExtra("age", age);
        startActivity(intent);

    }





}
