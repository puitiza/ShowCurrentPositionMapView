package com.anthony.puitiza.showcurrentpositionmapview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    MapView mvMap;
    private GoogleMap googleMap;
    public MapFragment() {
        // Required empty public constructor
    }
    public static MapFragment newInstance() {
        return new MapFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        mvMap = view.findViewById(R.id.mvMap);
        mvMap.onCreate(savedInstanceState);
        mvMap.getMapAsync(MapFragment.this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mvMap.onResume();
    }

    @Override

    public void onPause() {
        super.onPause();
        mvMap.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mvMap.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mvMap.onLowMemory();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        this.googleMap.getUiSettings().setMapToolbarEnabled(false);

    }
}
