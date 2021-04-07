package com.example.opvarmningsoevelse;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.opvarmningsoevelse.businessLogic.Nyhedsindslag;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    Nyhedsindslag nyhedsindslag1 = new Nyhedsindslag();
    Nyhedsindslag nyhedsindslag2 = new Nyhedsindslag("Mand skal i fængsel for at skubbe til 18-årig fodbolddommer","Overgrebet på den unge fodbolddommer blev meget omtalt og har blandt andet ført til øget fokus på fodbolddommeres sikkerhed.","https://free-cdn.tv2i.dk/users/editorial/images/1b35376a-af9d-40a6-9339-ef0b28af8970.jpg?t%5B%5D=crop%3Ax%3D0%2Cy%3D2%2Cwidth%3D1064%2Cheight%3D599&t%5B%5D=maxSize%3Aheight%3D349%2Cwidth%3D620&t%5B%5D=compress%3Alevel%3D82&publicKey=cms-ro&accessToken=40fe18826cd99a8747d529dcadce7cb98e1d097ec9b738996ace9a428c97ba8f");


    Button knap1;
    Button knap2;
    TextView overskrift;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        knap1 = findViewById(R.id.knap1);
        knap2 = findViewById(R.id.knap2);
        overskrift = findViewById(R.id.overskriftTextView);

        nyhedsindslag1.setOverskrift("\"Har du drukket guldøl til morgenmad?\" – alle lo, men hun synes ikke, at joken er sjov");
        nyhedsindslag1.setTeasertekst("Flere undersøgelser viser, at mange grønlændere oplever racisme og fordomme.");
        nyhedsindslag1.setStilbilledeLink("");
        try {
            nyhedsindslag1.setUdgivelsesdato( new SimpleDateFormat("dd/MM/yyyy").parse("7/4/2021")  );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        nyhedsindslag1.setVideoLink("https://tv2-dk-videos.secure.footprint.net/TV2flash/flex/ec1cc79f-b085-493f-806d-4663a0a25d6e.mp4");
        nyhedsindslag1.setUdgivet(true);


//        Log.d("debug", nyhedsindslag1.getOverskrift());
//        Log.d("debug", nyhedsindslag1.getTeasertekst());
//        Log.d("debug", nyhedsindslag1.getStilbilledeLink());
//        Log.d("debug", nyhedsindslag1.getUdgivelsesdato().toString());
//        Log.d("debug", nyhedsindslag1.getVideoLink());
//        Log.d("debug", Boolean.toString(nyhedsindslag1.isUdgivet()) );
//
//        Log.d("debug", nyhedsindslag2.getOverskrift());
//        Log.d("debug", nyhedsindslag2.getTeasertekst());
//        Log.d("debug", nyhedsindslag2.getStilbilledeLink());
//        Log.d("debug", nyhedsindslag2.getUdgivelsesdato().toString());
//        Log.d("debug", nyhedsindslag2.getVideoLink());
//        Log.d("debug", Boolean.toString(nyhedsindslag2.isUdgivet()) );

    }

    public void visoverskrift1(View view) {

        overskrift.setText(nyhedsindslag1.getOverskrift());

    }

    public void visoverskrift2(View view) {

        overskrift.setText(nyhedsindslag2.getOverskrift());

    }
}