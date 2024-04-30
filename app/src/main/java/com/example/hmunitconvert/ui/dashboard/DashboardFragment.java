package com.example.hmunitconvert.ui.dashboard;

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

import com.example.hmunitconvert.R;
import com.example.hmunitconvert.databinding.FragmentDashboardBinding;
import com.example.hmunitconvert.pressure_cal;
import com.example.hmunitconvert.energy_cal;
import com.example.hmunitconvert.storage_cal;
import com.example.hmunitconvert.current_cal;
import com.example.hmunitconvert.force_cal;
import com.example.hmunitconvert.resistance_cal;
import com.example.hmunitconvert.power_cal;
import com.example.hmunitconvert.torque_cal;
import com.example.hmunitconvert.MainActivity; // You may need to change this to your main activity's package.

public class DashboardFragment extends Fragment {
    private CardView cv_pressure;
    private CardView cv_energy;
    private CardView cv_storage;
    private CardView cv_current;
    private CardView cv_force;
    private CardView cv_resistance;
    private CardView cv_power;
    private CardView  cv_torque;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        cv_pressure = root.findViewById(R.id.cv_pressure);
        cv_energy = root.findViewById(R.id.cv_energy);
        cv_storage = root.findViewById(R.id.cv_storage);
        cv_current = root.findViewById(R.id.cv_current);
        cv_force = root.findViewById(R.id.cv_force);
        cv_resistance = root.findViewById(R.id.cv_resistence);
        cv_power = root.findViewById(R.id.cv_power);
        cv_torque = root.findViewById(R.id.cv_torque);

        cv_pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), pressure_cal.class));
            }
        });
        cv_energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), energy_cal.class));
            }
        });
        cv_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), storage_cal.class));
            }
        });
        cv_current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), current_cal.class));
            }
        });
        cv_force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), force_cal.class));
            }
        });
        cv_resistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), resistance_cal.class));
            }
        });
        cv_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), power_cal.class));
            }
        });
        cv_torque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), torque_cal.class));
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
