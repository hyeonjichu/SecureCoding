import React from "react"
import { Image, SafeAreaView, StyleSheet, Text, View } from "react-native"

const colorList = [
  { color: '#00974A', val: '00974A' },
  { color: '#2e6067', val: '2e6067' },
  { color: '#a92127', val: 'a92127' },
  { color: '#030364', val: '030364' },
  { color: '#0d6729', val: '0d6729' },
  { color: '#ff290b', val: 'ff290b' },
];

export default function App(){
  return(
    // <View style={style.container}>
    //   <Text style={style.hello}>Hello</Text>
    //   <Text>World</Text>
    // </View>

// <View style={{flexDirection: 'row', backgroundColor: '#ff0000'}}>

    // <View style={{flexDirection: 'column'}}>
    //   <Text style={{backgroundColor: '#ffff00', textAlign:"center", color:"#000000"}}>Hello</Text>
    //   <Text style={{textAlign:"right"}}>World</Text>
    // </View>

  // <View>
  //   <Text style={{letterSpacing: 2, fontSize: 16}}>
  //     오는 9일 진행되는 20대 대선 본투표에서 코로나19 확진자와 격리자들은 일반 유권자와 같은 방법으로 직접 투표함에 용지를 넣는 방식으로 투표를 하게 된다.
  //   </Text>
  // </View>

  // <View>
  //   <Image source={{uri:'https://facebook.github.io/react-native/docs/assets/favicon.png'}}
  //   style={{width:100, height:100, resizeMode:"contain", opacity:0.5}}
  //   />
  //   <Image source={require("./src/assets/ship.jpg")}
  //   style={{width: 300, height: 300}}/>
  // </View>

  // <View style={style.world}>
  //   <Text>Hello</Text>
  //   <Text>World</Text>
  // </View>

  <SafeAreaView>
    <View style={{padding: 16}}>
      {colorList.map(it => (
        <View key={it.color} style={[style.card, {backgroundColor: it.color}]}>
          <Text>{it.val}</Text>
        </View>
      ))}
    </View>
  </SafeAreaView>

  )
}

const style = StyleSheet.create({
  /* container:{
    flex: 1,
    backgroundColor: "#00ff00",
    alignItems: "center",
    justifyContent: "center"
    // marginLeft: "auto",
    // marginRight: "auto",
    // marginTop: "auto",
    // marginBottom: "auto" 
    // margin: "auto"
  },
  hello: {
    backgroundColor: "#ff0000"
  },
  world: {
    borderWidth: 1,
    borderColor: 'gray',
    borderBottomLeftRadius: 5,
    borderTopRightRadius: 10
  } */

  container: {
    flex: 1
  },
  card: {
    marginVertical: 8,
    height: 96,
    borderColor: 'lightgray',
    borderWidth: 1,
    borderRadius: 8,
    transform:[ //move, rotation, scale = 변환
      {rotateX: '45deg'},
      {rotateZ: '0.785398rad'}
    ]
  }
})