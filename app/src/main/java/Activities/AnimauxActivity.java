package Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

import Adapters.RecyclerViewAdapter;
import Interfaces.RecyclerViewClickListener;
import Listeners.RecyclerTouchListener;
import Models.Animal;
import Models.Espece;
import Models.Refuge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class AnimauxActivity extends AppCompatActivity {
    private ActivityAnimauxBinding binding;
    private Refuge refuge;
    private RecyclerViewAdapter adapterAnimaux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        refuge = new Refuge("test", "issou");

        initializeAnimaux();
        initializeUI();

        binding.recyclerViewAnimaux.addOnItemTouchListener(new RecyclerTouchListener(this, binding.recyclerViewAnimaux, new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i = new Intent(getApplicationContext(), AnimauxActivity.class);
                startActivity(i);
            }
        }));

    }

    private void initializeUI() {
        binding.recyclerViewAnimaux.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false );
        binding.recyclerViewAnimaux.setLayoutManager(layoutManager);
        binding.recyclerViewAnimaux.setFocusable(false);

        adapterAnimaux = new RecyclerViewAdapter(refuge.get_animaux());
        binding.recyclerViewAnimaux.setAdapter(adapterAnimaux);
    }

    private void initializeAnimaux(){
        refuge.AjouterAnimal(new Animal("Billy", new Espece("chien"), 3, "adopter", 5));
        refuge.AjouterAnimal(new Animal("Bob", new Espece("chien"), 3, "adopter", 5));
        refuge.AjouterAnimal(new Animal("Billy", new Espece("chien"), 3, "adopter", 5));
        refuge.AjouterAnimal(new Animal("Billy", new Espece("chien"), 3, "adopter", 5));

    }

}
