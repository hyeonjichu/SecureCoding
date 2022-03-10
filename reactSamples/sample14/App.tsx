import React, { useState } from "react"
import { Button, Text, TextInput, View } from "react-native"

function MyFunc(props:any){
  console.log(props.name)

  props.setText('Money')

  return <Text>{props.name}</Text>
}

export default function App(){

  const [inputTextValue, setInputTextValue] = useState("")
  const [text, setText] = useState("")

  const handleChange = (event:any) =>{
    const {eventCount, target, text} = event.nativeEvent  //기본 이벤트 -> 기본적으로 3가지가 넘어옴
    setInputTextValue(text)
    console.log(eventCount)
    console.log(target)
  }

  function handelClick(){
    console.log(inputTextValue)
    console.log(text)
  }

  return (
    <View>
      <Text>I love {text}</Text>
      {/* <MyFunc name="abc" setText={setText}></MyFunc> */}
      <TextInput value={inputTextValue} onChange={handleChange} placeholder="onChange"></TextInput>
      <TextInput onChangeText={text => setText(text)} placeholder="onChangeText"/>
      <Button title="button" onPress={handelClick}></Button>
    </View>
  )
}