package artur.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
/*import android.view.View.OnClickListener;*/


public class MainActivity extends AppCompatActivity {

    /** Переход между активностями для нескольких кнопок **/

    public Button button1;
    public Button button2;
    public Button button3;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityOne.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityThree.class);
                startActivity(intent);
            }
        });
    }

    /** Переход между активностями для одной кнопки **/

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setContentView(View view) {
        super.setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        Button button1 = (Button) findViewById(R.id.button1);
        Intent intent = new Intent(this, ActivityOne.class);
        startActivity(intent);
    }*/

}