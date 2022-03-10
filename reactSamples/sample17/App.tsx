import React, { useState } from 'react';
import { View, StyleSheet, Text, Button } from 'react-native';
import { Checkbox } from 'react-native-paper';

/*
설치하기 
npm i react-native-
android > app > build.gradle에 맨 아래
  apply from: file("../../node_modules/react-native-vector-icons/fonts.gradle")
  추가하기
 */

export default function App(){

  const [checked, setChecked] = useState(false)

  function handleCheck(){
    console.log(checked)
  }

  return(
    <View style={styles.container}>
      <View style={styles.checkboxContainer}>
        <Checkbox status={checked ? 'checked' : 'unchecked'}
        onPress={() => {setChecked(!checked)}}/>
        <Text style={styles.text}>Is CheckBox selected: {checked ? "👍" : "👎"}</Text>
        <Text>Hi</Text>
      </View>
      <Button title="체크확인" onPress={handleCheck}/>
    </View>
  )
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    alignItems: "center",
    justifyContent: "center"
  },
  checkboxContainer:{
    flexDirection: "row"
  },
  text:{
    marginTop: 5
  }
})