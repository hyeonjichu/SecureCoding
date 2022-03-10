import React from "react"
import { StyleSheet, View } from "react-native"
import Flexbox from "./src/component/Flexbox"
import { MarginPadding } from "./src/component/MarginPadding"
import WidthHeight from "./src/component/WidthHeight"

export default function App(){
  return (
    <View style={style.container}>
      <WidthHeight/>
      <MarginPadding/>
      <Flexbox/>
      <View style={style.box}/>
    </View>
  )
}

const style = StyleSheet.create({
  container:{
    flex: 1
  },
  box:{
    width: 150,
    height: 100,
    backgroundColor:'darkgreen',
    position: 'absolute',  //오른쪽 하단
    right: 16,
    bottom: 16
  }
})