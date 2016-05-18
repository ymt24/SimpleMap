package jp.ac.titech.itpro.sdl.simplemap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {
    private final static LatLng MY_LOCATION = new LatLng(35.604667, 139.682759);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap map) {
                map.addMarker(new MarkerOptions().position(MY_LOCATION).title(getString(R.string.my_location)));
                map.moveCamera(CameraUpdateFactory.newLatLng(MY_LOCATION));
            }
        });
    }
}
