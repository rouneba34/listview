package com.example.harouna_ba.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

import com.example.harouna_ba.tp1.bean.Etudiant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Formulaire extends AppCompatActivity {
    EditText prenom,nom,age,telephone,email,niveau,filiere;
    Button valider,afficher;
    RadioButton masculin,feminin;
    String sexe;
    List<Etudiant> etudiantList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);

        //Toast.makeText(getApplicationContext(),"Bienvenue M1SIR",Toast.LENGTH_LONG).show();
        prenom =    (EditText) findViewById(R.id.etprenom);
        nom =       (EditText) findViewById(R.id.etnom);
        age =       (EditText) findViewById(R.id.etage);
        masculin=   (RadioButton) findViewById(R.id.rbmasculin);
        feminin=    (RadioButton) findViewById(R.id.rbfeminin);
        telephone = (EditText) findViewById(R.id.tel);
        email =     (EditText) findViewById(R.id.mail);
        niveau =    (EditText) findViewById(R.id.niv);
        filiere =   (EditText) findViewById(R.id.fil);
        valider=    (Button) findViewById(R.id.btnvalider);
        afficher =   (Button) findViewById(R.id.btnafficher);
        valider.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
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

                Etudiant etudiant = new Etudiant();
                etudiant.setPrenom(prenom.getText().toString());
                etudiant.setNom(nom.getText().toString());
                etudiant.setAge(Integer.parseInt(age.getText().toString()));
                etudiant.setSexe(sexe);
                etudiant.setTelephone(telephone.getText().toString());
                etudiant.setEmail(email.getText().toString()); ;
                etudiant.setNiveau(niveau.getText().toString()); ;
                etudiant.setFiliere(filiere.getText().toString()); ;
                etudiantList.add(etudiant);
            }
        });

        afficher.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainListView.class);
                intent.putExtra("listEtudiants", (Serializable) etudiantList);
                startActivity(intent);
            }
        });

    }
}

//