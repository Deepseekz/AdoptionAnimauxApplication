package Activities;

import android.os.Bundle;
import android.view.View;

import com.example.adoptionanimauxapplication.R;
import com.example.adoptionanimauxapplication.databinding.ActivityCreateAnimauxBinding;
import com.example.adoptionanimauxapplication.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAnimauxActivity extends AppCompatActivity {
    private ActivityCreateAnimauxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateAnimauxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
}

}
