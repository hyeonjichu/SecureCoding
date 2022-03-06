package com.example.sample39_googlemaps

import android.Manifest
import android.annotation.SuppressLint
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.example.sample39_googlemaps.databinding.ActivityMapsBinding
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    /*
    AndroidManifest.xml에 추가
        <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>

    build.gradle에 추가
        implementation 'com.google.android.gms:play-services-location:17.0.0'   //추가
        //implementation 'com.google.android.gms:play-services-maps:17.0.0'       //추가
    */

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    lateinit var locationPermission: ActivityResultLauncher<Array<String>>

    //위치 서비스가 GPS를 사용해서 위치를 확인
    lateinit var fusedLocationClient: FusedLocationProviderClient

    //위치 값 요청에 대한 갱신 정보를 받는 변수
    lateinit var locationCallback: LocationCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        locationPermission = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()){ results->
            if(results.all { it.value }){
                startProcess()
            }else{  //문제 발생했을 때
                Toast.makeText(this, "권한 승인 필요", Toast.LENGTH_LONG).show()
            }
        }

        //권한 요청
        locationPermission.launch(
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        )
    }

    fun startProcess(){
        //구글 맵을 준비하는 작업을 진행
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        updateLocation()
    }

    @SuppressLint("MissingPermission")
    fun updateLocation() {
        val locationRequest = LocationRequest.create()
        locationRequest.run {
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            interval = 1000     //1초
        }

        locationCallback = object : LocationCallback() {
            //1초에 한 번씩 변경된 위치정보가 onLocationResult로 전달됨
            override fun onLocationResult(locationResult: LocationResult?) {
                locationResult?.let {
                    for (location in it.locations) {
                        Log.d("위치정보 ", "- 위도:${location.latitude}, 경도:${location.longitude}")
                        println("println - 위도:${location.latitude}, 경도:${location.longitude}")
                        //setLastLocation(location)
                    }
                }
            }
        }

        //권한 처리
        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())

        setLocation(37.4923219, 126.91161889999998)
    }

    fun setLastLocation(lastLocation:Location){
        val LATLNG = LatLng(lastLocation.latitude, lastLocation.longitude)

        val makerOptions = MarkerOptions().position(LATLNG).title("I am here")
        val cameraPosition = CameraPosition.Builder().target(LATLNG).zoom(15.0f).build()

        mMap.clear()
        mMap.addMarker(makerOptions)
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
    }

    //본인이 설정한 위도, 경도로 적용하는 경우
    fun setLocation(latitude: Double, longitude:Double){
        val LATLNG = LatLng(latitude, longitude)
        val makerOptions = MarkerOptions().position(LATLNG).title("I am here")
        val cameraPosition = CameraPosition.Builder().target(LATLNG).zoom(15.0f).build()

        mMap.clear()
        mMap.addMarker(makerOptions)
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
    }
}