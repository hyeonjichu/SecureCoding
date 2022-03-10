import React from "react"
import { StyleSheet, View, Text } from "react-native"

//flex: 크기비율로 설정하는 것
export default function App(){
  return (
    <View style={style.container}>
      <View style={style.caseOne}></View>
      <View style={style.caseTwo}>
        <Text>두번째 화면</Text>
      </View>
      <View style={style.caseThree}></View>
    </View>
  )
}

const style = StyleSheet.create({
  container: {
    flex: 1,
    //backgroundColor: 'red',
    //flexDirection: 'row',
    width: 300
  },
  caseOne:{
    flex: 1,
    backgroundColor: 'yellow'
  },
  caseTwo: {
    flex: 1,
    backgroundColor:'blue'
  },
  caseThree: {
    flex: 6,
    backgroundColor: 'green',
    //width: 200,
    height:200
  }
})