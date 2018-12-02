package com.example.harouna_ba.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harouna_ba.tp1.bean.Etudiant;

import java.util.List;

public class MainListView extends AppCompatActivity {
    EditText pren,name,age,email,tel,niv,fil,sexe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);
        afficherListEtudiant();
    }

    private void afficherListEtudiant() {
        Intent intent = getIntent();
        List<Etudiant> etudiants= (List<Etudiant>) intent.getSerializableExtra("listEtudiants");
        Toast.makeText(getApplicationContext(),etudiants.get(0).getPrenom(),Toast.LENGTH_LONG).show();
    }

        /*
        Intent intent = getIntent();
        pren=(EditText)findViewById(R.id.firstname);
        name=(EditText)findViewById(R.id.secondname);
        age = (EditText)findViewById(R.id.age1);
        email = (EditText)findViewById(R.id.emal1);
        tel = (EditText)findViewById(R.id.tel1);
        niv = (EditText)findViewById(R.id.niv1);
        fil = (EditText)findViewById(R.id.fil1);
        sexe = (EditText)findViewById(R.id.sexe1);
        //masc = (EditText)findViewById(R.id.m);
        //fem = (EditText)findViewById(R.id.f);

       String prenom= intent.getStringExtra("prenom");
        pren.setText("Prenom : "+prenom);
       String nom= intent.getStringExtra("nom");
        name.setText("Nom : "+nom);
        int a = intent.getIntExtra("age",0);
        age.setText(String.valueOf("Age: "+a+ " ans"));
        String mail= intent.getStringExtra("e-mail");

        email.setText("Email : "+mail);
        String phone= intent.getStringExtra("telephone");
        tel.setText("Telephone : "+phone);
        String nive= intent.getStringExtra("Niveau");
        niv.setText("Niveau : "+nive);
        String fili= intent.getStringExtra("Filiere");
        fil.setText("Filiere : "+fili);
        String sex= intent.getStringExtra("Sexe");
        sexe.setText("Sexe : "+sex);
        if(sex.equalsIgnoreCase("masculin")==true){
            sexe.setText("Sexe: "+sex);
        }
        if(sex.equalsIgnoreCase("feminin")==true){
            sexe.setText("Sexe: "+sex);
        }
    */
}
