package braulio.ramirez.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        Number number = new Number();

        number.number =Integer.parseInt(userInput.getText().toString());

        if (number.isSquare()){

            if(number.isTriangular()){

                message="Number is square and triangular";

            }

            message="Number is square";

        }  else if(number.isTriangular()){

            message="Number is triangular";

        }else{

        message="Number is neither square nor triangular";
    }

    Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

    //Log.i("Numero ingresado", userInput.getText().toString());
    }


    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }

        }


    }





}
