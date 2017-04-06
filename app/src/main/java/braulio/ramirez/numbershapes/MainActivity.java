package braulio.ramirez.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

    }

    public void testNumber (View view){

        EditText userInput = (EditText)findViewById(R.id.UserInput);

        String message= "";

       // userInput.getText().toString();

        Log.i("Numero ingresado", userInput.getText().toString());
    }

}
