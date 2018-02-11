package cheniki.cci.univ_tours.gestioninterfacevisuelle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // faire lien avec le layout main_activity.xml déjà définit et le manipuler
        // LinearLayout layout =  (LinearLayout) findViewById(R.id.main_activity);
        //layout.setBackgroundColor(Color.RED);

        // definir un nouveau layout purement par programmation (pas d'XML)

        //LinearLayout layout = new LinearLayout(this);
        //layout.setGravity(Gravity.CENTER); // centrer les éléments graphiques
        //layout.setOrientation(LinearLayout.VERTICAL); // empiler vers le bas !

        // Ensuite, définit des composants graphique par prog. et les ajouter au layout
        // TextView texte = new TextView(this);


        // texte.setText("Programming creation of interface !");
        //layout.addView(texte);


        //ImageView image = new ImageView(this);
        //image.setImageResource(R.mipmap.ic_launcher);
        //layout.addView(image);


        //EditText edit = new EditText(this);
        //edit.setText("Name");
        //layout.addView(edit);

      //  Button b = new Button(this);

//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // récupérer le texte du TextEdit et l'afficher
//                String texte =  edit.getText().toString();
//                Toast.makeText(MainActivity.this, texte, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        layout.addView(b);
//
        // Enfin, attaché le layout à cette activité
//        setContentView(layout);

        // P.S. si vous voulez utiliser la partie en haut, il faut commenter toute la partie suivant.
        // ====================================
        // Cependant, on préfère cette approche : définit les composants dans un fichier XML
        // Ensuite, les attachés à des objets pour les manipuler

        setContentView(R.layout.activity_main);

        final EditText edit = (EditText) findViewById(R.id.editText);

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // récupérer le texte du TextEdit et l'afficher
                String texte =  edit.getText().toString();
                Toast.makeText(MainActivity.this, texte, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
