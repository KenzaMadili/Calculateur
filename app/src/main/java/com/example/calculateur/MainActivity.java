package com.example.calculateur;
public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de l'interface
    private EditText surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison XML <-> Java
        surfaceInput = findViewById(R.id.input_surface);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_piscine);
        resultView = findViewById(R.id.result);

        // Bouton calcul
        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {

        // Vérification des champs vides
        if (surfaceInput.getText().toString().isEmpty() ||
                piecesInput.getText().toString().isEmpty()) {

            Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Lecture des valeurs
            double surface = Double.parseDouble(surfaceInput.getText().toString());
            int pieces = Integer.parseInt(piecesInput.getText().toString());
            boolean piscine = piscineCheckbox.isChecked();

            // Calcul
            double impotBase = surface * 2;
            double supplement = pieces * 50 + (piscine ? 100 : 0);
            double total = impotBase + supplement;

            // Affichage formaté
            resultView.setText("Impôt total : " + String.format("%.2f", total) + " DH");

        } catch (Exception e) {
            Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_SHORT).show();
        }
    }
}