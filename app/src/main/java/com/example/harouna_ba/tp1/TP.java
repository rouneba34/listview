package com.example.harouna_ba.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;

public class TP extends AppCompatActivity implements OnClickListener {
    EditText prenom,nom,age,telephone,email,niveau;
    Button valider,annuler;
    CheckBox masculin,feminin;
    String sexe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        //Toast.makeText(getApplicationContext(),"Bienvenue M1SIR",Toast.LENGTH_LONG).show();
        prenom =    (EditText) findViewById(R.id.etprenom);
        nom =       (EditText) findViewById(R.id.etnom);
        age =       (EditText) findViewById(R.id.etage);
        masculin=   (CheckBox) findViewById(R.id.cbm);
        feminin=    (CheckBox) findViewById(R.id.cbf);
        telephone = (EditText) findViewById(R.id.tel);
        email =     (EditText) findViewById(R.id.mail);
        niveau =    (EditText) findViewById(R.id.niv);
        valider=    (Button) findViewById(R.id.btnvalider);
        annuler =   (Button) findViewById(R.id.btnannuler);
        valider.setOnClickListener(this);
        annuler.setOnClickListener(this);
        if(masculin.isChecked()==true){
            feminin.setChecked(false);
        }
        if(feminin.isChecked()==true){
            masculin.setChecked(false);
        }
    }

  /*  @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"Démarrage app",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"Résumé de l'app",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"oops appel, marquons une pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"Désolé l'application s'est arretée, merci de fermer et reouvrir",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"Application détruite, fermée",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_tp);
        Toast.makeText(getApplicationContext(),"Redémarrage de l'application",Toast.LENGTH_LONG).show();
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnvalider:
                if(masculin.isChecked()==true){
                    sexe="Masculin";
                }
                if(feminin.isChecked()==true){
                    sexe="Feminin";
                }
                Toast.makeText(getApplicationContext(),
                        "Prenom : "+prenom.getText().toString()+"\n"+"Nom : "+nom.getText().toString()+"\n"+
                                "Age : "+age.getText().toString()+"ans \n"+"Email : "+email.getText().toString()+"\n"+
                                "Telephone : "+telephone.getText().toString()+"\n"+"Niveau d'etude : "+niveau.getText().toString()+"\n"+
                                "Sexe : "+sexe,
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.btnannuler:
                prenom.setText("");
                nom.setText("");
                email.setText("");
                age.setText("");
                telephone.setText("");
                niveau.setText("");
                masculin.setChecked(false);
                feminin.setChecked(false);
                break;
        }

    }
}

