package com.example.elsabaa;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Elsabhaa extends AppCompatActivity {
    // Tracks the  for textView
    int textView = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elsabhaa);


    }
        /**
         * Increase the for textView by 1 point.
         */
        public void addOne (View v){
            textView = textView + 1;
            displayForTextView(textView);
        }
/**
 * Resets the  for  back to 0.
 */

        public void reset(View v){
            textView = 0;
            displayForTextView(textView);


        }

        /**
         * Displays the given  for textView
         */

        private void displayForTextView(int textView){
            TextView View = (TextView) findViewById(R.id.textView);
            View.setText(String.valueOf(textView));
        }


    }


