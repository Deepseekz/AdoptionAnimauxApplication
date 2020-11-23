package Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityDetailsAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailsAnimalActivity extends AppCompatActivity {
    private ActivityDetailsAnimauxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initializeDetails();
    }

    //collection
    private  void initializeDetails() {
        ArrayList<String> details = new ArrayList<>();
        details.add("en Attente");
        details.add("adopté");


        // mise en place du spinner
        ArrayAdapter<String> detailsArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, details);
        detailsArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerDetails.setAdapter(detailsArrayAdapter);
    }
}
