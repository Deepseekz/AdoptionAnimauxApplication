package Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

import Models.Animal;
import Models.Refuge;
import androidx.appcompat.app.AppCompatActivity;

public class AnimauxActivity extends AppCompatActivity {
    private ActivityAnimauxBinding binding;
    private Refuge refuge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //initializeAnimaux();



    }
/*
    private void initializeAnimaux(){
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new Animal());
        animaux.add(new Animal());
        animaux.add(new Animal());
        animaux.add(new Animal());
        animaux.add(new Animal());

        ArrayAdapter<Animal> drinkArrayAdapter = new ArrayAdapter<Animal>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, animaux);
        drinkArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }*/

}
