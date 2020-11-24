package Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityCreateAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Models.Animal;
import Models.Espece;

public class CreateAnimauxActivity extends AppCompatActivity {
    private ActivityCreateAnimauxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initializeSpinner();
}

    private void initializeSpinner()
    {
        ArrayList<Espece> especes = new ArrayList<>();

        especes.add(new Espece("Chien"));
        especes.add(new Espece("Chat"));

        ArrayAdapter<Espece> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, especes);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        binding.spEspeces.setAdapter(adapter);
    }

}
