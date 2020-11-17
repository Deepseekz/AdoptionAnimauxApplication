package Activities;

import android.os.Bundle;
import android.view.View;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityDetailsAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsAnimalActivity extends AppCompatActivity {
    private ActivityDetailsAnimauxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}
