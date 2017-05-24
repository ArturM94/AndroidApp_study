package artur.project1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityThree extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        TextView textView = new TextView(this);
        setContentView(textView);
        setContentView(R.layout.activity_three);
    }
}