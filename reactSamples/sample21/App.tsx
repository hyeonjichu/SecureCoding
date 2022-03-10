import React, { useEffect, useState } from "react"
import { Button, Text, View } from "react-native"

/*
  useEffect: 컴포넌트가 rendering될 때마다 특정 작업을 실행할 수 있도록 하는 hook
              = componentDidMount + compenentDidUpdate + componentWillUnmount
*/

function Welcome(props:any){

  //순서: start -> end -> useEffect
  console.log('start')

  useEffect(() => {     //$(document).ready()와 비슷한 역할
    props.setText("Job")
    console.log('useEffect')
  })

  console.log('end')

  function func(){
    props.setText("world")
  }

  return(
    <View>
      <Text>Welcome</Text>
      {/* <Button title="button" onPress={() => func()}></Button> */}
    </View>
  )
}

export default function App(){
  const [text, setText] = useState('abc')

  function btnclick(){
    setText('bcd')  
  }

  return (
    <View>
      <Text>{text}</Text>
      {/* <Button title="버튼" onPress={() => btnclick()}/> */}
      <Welcome setText={setText}/>
    </View>
  )
}