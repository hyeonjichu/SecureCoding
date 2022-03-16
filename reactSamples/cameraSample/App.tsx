import CameraRoll from "@react-native-community/cameraroll";
import React, { useState } from "react";
import { Image, PermissionsAndroid, StyleSheet, Text, TouchableOpacity, View } from "react-native";
import { RNCamera } from "react-native-camera";

/*
yarn --version 확인하기
    yarn없으면 설치하기

android > app > build.gradle에 133줄 defaultConfig에 추가
    missingDimensionStrategy 'react-native-camera', 'general'

android > app > src > main > AndroidManifest.xml에 추가
    <uses-permission android:name="android.permission.CAMERA" />

    <!-- Include this only if you are planning to use the camera roll -->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />

    <!-- Include this only if you are planning to use the microphone for video recording -->
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
    
    application tag내부에 추가
        android:requestLegacyExternalStorage="true"
    
install하기
  npm i @react-native-community/cameraroll
  npm install --save fbjs

*/

export default function App(){
  const cameraRef = React.useRef(null)
  const [picture, setPicture] = useState("이미지경로")

  const takePhoto = async() =>{

    //권한처리
    await PermissionsAndroid.requestMultiple([
      PermissionsAndroid.PERMISSIONS.CAMERA,
      PermissionsAndroid.PERMISSIONS.WRITE_EXTERNAL_STORAGE,
      PermissionsAndroid.PERMISSIONS.READ_EXTERNAL_STORAGE
    ]).then( (result) => {
      if (result['android.permission.CAMERA']
        && result['android.permission.WRITE_EXTERNAL_STORAGE']
        && result['android.permission.READ_EXTERNAL_STORAGE'] === 'granted') {
        console.log("모든 권한 획득");
      } else {
        console.log("권한거절");
      }
    })

    if(cameraRef){
      const data = await cameraRef.current.takePictureAsync({
        quality: 1,
        exif: true
      })
      console.log("data", data.uri)

      //사진 저장
      if(data){
        const result = CameraRoll.save(data.uri).then(out=>{
          console.log(`out=${out}`)
          setPicture(data.uri)
        }).catch(err=>{
          console.log(`err=${err}`)
        })
        console.log(`result = ${result}`)
      }
    }
  }

  return(
    <View style={style.container}>
      <RNCamera
      ref={cameraRef}
      style = {{width: 400, height: 500}}
      type={RNCamera.Constants.Type.back}
      captureAudio={false}/>
      <TouchableOpacity onPress={takePhoto}>
        <View style={style.button}>
          <Text>사진</Text>
        </View>
      </TouchableOpacity>
      <Image 
      style={style.tinyLogo}
      source={{
        uri:`${picture}`
      }}/>
    </View>
  )
}

const style = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center"
  },
  button: {
    width: 80,
    height: 80,
    borderRadius: 50,
    borderWidth: 5,
    borderColor: "white",
    borderStyle: "solid",
    backgroundColor: "pink",
    marginTop: 30,
    justifyContent: "center",
    alignItems: "center"
  },
  tinyLogo: {
    width: 100,
    height: 100,
    marginTop: 30
  }
})