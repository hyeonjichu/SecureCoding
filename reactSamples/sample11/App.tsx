import React, { useState } from "react"
import { Button, Text, View } from "react-native"

/* 
class App extends React.Component{
  constructor(props: any){
    super(props)

    this.state = {
      count: 0
    }
  }

  render(){
    return (
      <View>
        <Text>You clicked {this.state.count} times</Text>
        <Button title="click me" onPress={() => this.setState({count:this.state.count + 1}) }/>
      </View>
    )
  }
}

export default App 
*/

const App = () => {
  //   getter   setter              초기값
  const [count, setCount] = useState( 0 )   //hook
  //let c = count
  //setCount(12)

  return (
    <View>
      <Text>You clicked {count} times</Text>
      <Button title="click me" onPress={() => setCount(count + 1) }/>
    </View>
  )
}

//위에다 써도 됨
export default App