import React, { useState } from "react"
import { Alert, Button, SafeAreaView, Text, ToastAndroid } from "react-native"
import LikeButton from "./src/component/LikeButton"

// #1
function btnClick(){
  console.log("btnClick 클릭")
}

// #2
const onPressFunc = () => {
  //Alert.alert("home", "home클릭됨")
  ToastAndroid.show("home button click", ToastAndroid.SHORT)
}

export default function App(){

  // #3
  const [liked, setLike] = useState(false)
  const toggleLiked = () => setLike(!liked)

  return (
    <SafeAreaView>
      <Text>Hello Tsx</Text>
      <Button title="버튼" onPress={() => btnClick()}></Button>
      <Button title="home" onPress={onPressFunc}></Button>
      <Button title={liked ? "click on" : "click off"} onPress={toggleLiked}></Button>
      <LikeButton></LikeButton>
    </SafeAreaView>
  )
}