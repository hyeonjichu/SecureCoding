import React from "react"
import { SafeAreaView, Text } from "react-native"
/* 
export default class App extends React.Component{

  name:String = ''

  constructor(props:any){
    super(props)
    this.name = "홍길동"  // 불편해서 잘 안 씀 -> hook
  }

  render(){
    return (
      <SafeAreaView>
        <Text>Hello Tsx {this.name} </Text>
      </SafeAreaView>
    )
  }
}
 */

//위와 같음, 더 간단해서 많이 사용
export default function App() {
  const name:String = '홍길동'
  return (
    <SafeAreaView>
      <Text>Hello Tsx {name} </Text>
    </SafeAreaView>
  )
}