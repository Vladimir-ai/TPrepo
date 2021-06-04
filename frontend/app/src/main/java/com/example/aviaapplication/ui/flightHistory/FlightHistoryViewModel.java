package com.example.aviaapplication.ui.flightHistory;

import android.app.Application;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.aviaapplication.api.models.RecentCity;

import java.util.List;

public class FlightHistoryViewModel extends AndroidViewModel {

    private FlightHistoryRepository flightHistoryRepository;
    //private UserRepository userRepository;
    private MutableLiveData<List<RecentCity>> flightList;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public FlightHistoryViewModel(@NonNull Application application) {
        super(application);
      //  userRepository = UserRepository.getInstance();
        flightHistoryRepository = FlightHistoryRepository.getInstance();
        flightList = new MutableLiveData<>(flightHistoryRepository.getFlights());
    }

    public MutableLiveData<List<RecentCity>> getFlights(){
        return flightList;
    }
}
