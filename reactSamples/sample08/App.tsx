import React from "react"
import { Platform, StyleSheet, Text, View } from "react-native"

//외부 모듈 가져온 경우 첫번째 글자 대문자
import Welcome from "./src/component/Welcome"

//module: 조각, 처리자 -> component
/* function Welcome(props:any){
  return (
    <View>
      <Text style={styles.text}>
        Hello Welcome {props.name}
      </Text>
      <Text style={styles.text}>나이: {props.age}</Text>
    </View>
  )
} */

export default function App(){

  return(
    <View style={styles.container}>
      <Welcome name="홍길동" age="24"></Welcome>
      <Welcome name="성춘향" age="19"></Welcome>
      <Welcome name="일지매" age="22"></Welcome>
    </View>
  )
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    backgroundColor:"#f0f",
    alignItems: "center",
    justifyContent: "center"
  },
  text:{
    fontFamily:Platform.select({
      android:"serif"
    }),
    fontSize: 30
  }
})