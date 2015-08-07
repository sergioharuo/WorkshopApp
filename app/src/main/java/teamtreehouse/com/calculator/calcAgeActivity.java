package teamtreehouse.com.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import teamtreehouse.com.calculator.Controler.calcAge;
import teamtreehouse.com.calculator.R;

public class calcAgeActivity extends Activity {

    private static final String TAG = calcAgeActivity.class.getSimpleName();

    private String age;
    private int stringToInt;
    private TextView mAgeToMonths;
    private TextView mAgeToDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_age);

    mAgeToMonths = (TextView)findViewById(R.id.ageToMonthsTextView);
    mAgeToDays = (TextView)findViewById(R.id.diasTextView);

    Intent intent = getIntent();
    age = intent.getStringExtra("age");
    stringToInt = Integer.parseInt(age);


    calcAge convertorAge = new calcAge();

    //Calc Age to Months
    int ageToMonthsConverted = convertorAge.calculateAge(stringToInt);
    String ageToMonthsConverted2 = ageToMonthsConverted + "";
    mAgeToMonths.setText(ageToMonthsConverted2);

    Toast.makeText(calcAgeActivity.this, ageToMonthsConverted2, Toast.LENGTH_LONG).show();

    int ageToDaysConverted = convertorAge.ageToDays(stringToInt);
    String ageToDays = ageToDaysConverted + "";
    mAgeToDays.setText(ageToDays);

    int ageToMonths2 = Log.d(TAG, age);
    }




}
