package com.example.aviaapplication.ui.flightInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aviaapplication.R;
import com.example.aviaapplication.additions.recyclerView.PassengerListRecyclerViewAdapter;
import com.example.aviaapplication.api.models.Passenger;
import com.example.aviaapplication.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassengerListFragment extends Fragment {

    private RecyclerView recyclerView;
    private PassengerListRecyclerViewAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_flight_passengers, container, false);
        initViews(root);
        setUpListeners();
        return root;
    }

    private void initViews(View root) {
        adapter = new PassengerListRecyclerViewAdapter();
        recyclerView = root.findViewById(R.id.flight_passengers_rv);
        recyclerView.setAdapter(adapter);
        updateList(new ArrayList<>());
    }

    private void setUpListeners() {
        requireActivity().getOnBackPressedDispatcher()
                .addCallback(CommonUtils.getOnBackPressedCallback(getParentFragmentManager()));
    }

    public void updateList(List<Passenger> passengerList) {
        passengerList.addAll(Arrays.asList(new Passenger(), new Passenger(), new Passenger(), new Passenger()));
        adapter.submitList(passengerList);
    }


}
