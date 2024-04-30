package com.example.hmunitconvert.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hmunitconvert.R; // Assuming R is your resource file for IDs
import com.example.hmunitconvert.databinding.FragmentHomeBinding;
import com.example.hmunitconvert.temp_cal;
import com.example.hmunitconvert.weight_cal;
import com.example.hmunitconvert.length_cal;
import com.example.hmunitconvert.speed_cal;
import com.example.hmunitconvert.volume_cal;
import com.example.hmunitconvert.time_cal;
import com.example.hmunitconvert.area_cal;
import com.example.hmunitconvert.fuel_cal;

public class HomeFragment extends Fragment {
    private CardView cv_tmp;
    private CardView cv_weight;
    private CardView cv_length;
    private CardView cv_speed;
    private CardView cv_volume;
    private CardView cv_time;
    private CardView cv_area;
    private CardView cv_fuel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        cv_tmp = root.findViewById(R.id.cv_tmp);
        cv_weight = root.findViewById(R.id.cv_weight);
        cv_length = root.findViewById(R.id.cv_length);
        cv_speed = root.findViewById(R.id.cv_speed);
        cv_volume = root.findViewById(R.id.cv_Volume); // This should be lowercase 'v'
        cv_time = root.findViewById(R.id.cv_time);
        cv_area = root.findViewById(R.id.cv_area);
        cv_fuel = root.findViewById(R.id.cv_fuel);

        cv_tmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), temp_cal.class));
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), weight_cal.class));
            }
        });
        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), length_cal.class));
            }
        });
        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), speed_cal.class));
            }
        });
        cv_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), volume_cal.class));
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), time_cal.class));
            }
        });
        cv_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), area_cal.class));
            }
        });
        cv_fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), fuel_cal.class));
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
