package com.developers.paras.mailandsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.creativityapps.gmailbackgroundlibrary.BackgroundMail;

public class MailSenderActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_sender);

        final Button send2 = (Button) this.findViewById(R.id.emailback);
        send2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                BackgroundMail.newBuilder(MailSenderActivity.this)
                        .withUsername("khandelwalparas8@gmail.com")
                        .withPassword("9716250889")
                        .withMailto("parasasblog@gmail.com")
                        .withType(BackgroundMail.TYPE_PLAIN)
                        .withSubject("Mail from G_MAIL_BACKGROUND")
                        .withBody("You have received this email because you have done awesome work")
                        .withOnSuccessCallback(new BackgroundMail.OnSuccessCallback() {
                            @Override
                            public void onSuccess() {
                                //do some magic
                                Toast.makeText(MailSenderActivity.this, "Your email has been sent.", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .withOnFailCallback(new BackgroundMail.OnFailCallback() {
                            @Override
                            public void onFail() {
                                //do some magic
                                Toast.makeText(MailSenderActivity.this, "Unable to send email.", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .send();





            }
        });
    }
}
