package ir.topcoders.customfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load font from assets
        Typeface myFont = Typeface.createFromAsset(getAssets(), "BNazanin.ttf");

        //find myTextView from layout
        TextView myTextView = (TextView) findViewById(R.id.myTextView);

        //set font on myTextView
        myTextView.setTypeface(myFont);
    }
}
