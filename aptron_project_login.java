package ridhima.mysafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class aptron_project_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptron_project_login);

        final EditText e1 = (EditText)findViewById(R.id.e1);
        final EditText e2 = (EditText)findViewById(R.id.e2);
        Button b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   if(e1.getText().toString().trim().length()==0)
                {
                    if(e1.getText().toString().trim().length()!=10)
                    e1.setError("Enter Phone Number");
                    e1.requestFocus();
                }*/
                 if (e1.getText().toString().trim().length() != 10){
                    e1.setError("Phone Number is invalid");
                    e1.requestFocus();
                }
             /*   else  if(e2.getText().toString().trim().length()==0)
                {
                    e2.setError("Password must be atleast 6 characters");
                    e2.requestFocus();
                }*/
                else if (e2.getText().toString().trim().length()<6)
                {
                    e2.setError("Password must be atleast 6 characters");
                    e2.requestFocus();
                }
                else
                {
                    Intent it = new Intent(aptron_project_login.this, aptron_project_signup.class);
                    startActivity(it);
                }
            }
        });
    }
}
