import React, { useState } from "react"
import { Alert, FlatList, Image, ScrollView, SectionList, StyleSheet, Text, TextInput, ToastAndroid, View } from "react-native"

/* 
//Text
export default function App(){
  return(
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center"}}>
      <Text>Hello TSX</Text>
    </View>
  )
} */

/* 
//ScrollView, Image, TextInput(EditText)
export default function App(){
  return(
    <ScrollView>
      <Text>Hello</Text>
      <View>
        <Text>World</Text>
        <Image source={{ uri:"https://reactnative.dev/docs/assets/p_cat2.png"}} style={{width: 200, height: 200}}/>
      </View>
      <TextInput style={{height: 40, borderColor:'gray', borderWidth:1}} defaultValue="여기에 입력"/>
    </ScrollView>
  )
} */

/* 
//module
const Cat = (props:any) =>{
  return (
    <View>
      <Text>Hello I am {props.name}</Text>
    </View>
  )
}

export default function App(){
  return(
    <View>
      <Cat name="Tom"/>
      <Cat name="234"/>
      <Cat nmae="Jelly"/>
    </View>
  )
} */

/*  
export default function App(){
  const [text, setText] = useState("")
  
  return(
    <View style={{padding: 10}}>
      <TextInput
        style={{height: 40}}
        placeholder="여기에 입력하세요"
        onChangeText={txt => setText(txt)}
        defaultValue={text}
        />
        <Text style={{padding:10, fontSize: 40}}>
          {text.split(' ').map((word) => word && '🍕').join(' ')}
        </Text>
    </View>
  )
} */

/* 
const logo = {
  uri: 'https://reactnative.dev/img/tiny_logo.png',
  width: 64,
  height: 64
}

export default function App(){
  return(
    <ScrollView>
      <Text style={{fontSize: 50}}>Scroll me plz</Text>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>

      <Text style={{fontSize: 50}}>If you like</Text>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>

      <Text style={{fontSize: 50}}>Scroll page down</Text>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
      <Image source={logo}></Image>
    </ScrollView>
  )
} */


const textClick = (props:any) => {
  Alert.alert(props)
}

//FlatList key값 중복 안됨
//Flatlist == recyclerView
export default function App(){
  return(
    <View style={styles.container}>
      <FlatList data={[
        {key:'Devin'},
        {key:'Dan'},
        {key:'Tom'},
        {key:'Jackson'},
        {key:'James'},
        {key:'Kelly'},
        {key:'Chu'},
        {key:'John'},
        {key:'Jillian'},
        {key:'Jimmy'},
        {key:'Julie'}
      ]}
      renderItem={({item}) => <View><Text style={styles.item} onPress={() => textClick(item.key)}>{item.key}</Text></View>}
      />
    </View>
  )
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    paddingTop: 22
  },
  item:{
    padding: 10,
    fontSize: 18,
    height: 44,
    borderWidth: 2,
    borderColor: "#ededed"
  }
})

/* 
const click = (item:any) =>{
  ToastAndroid.show(item, ToastAndroid.SHORT)
}

export default function App(){
  return(
    <View style={styles.container}>
      <SectionList
        sections={[
          {title:'A', data:['Devin', 'Dan', 'Dominic']},
          {title: 'B', data:['Jack', 'James', 'Julia', 'Jimmy']}
        ]}
        renderItem={({item}) => <Text style={styles.item} onPress={() => click(item)}>{item}</Text>}
        renderSectionHeader = {({section}) => <Text style={styles.sectionHeader}>{section.title}</Text>}
        />
    </View>
  )
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    paddingTop: 22
  },
  sectionHeader:{
    paddingTop: 2,
    paddingLeft: 10,
    paddingRight: 10,
    paddingBottom: 2,
    fontSize: 14,
    fontWeight: 'bold',
    backgroundColor: 'rgba(247, 247, 247, 1.0)'
  },
  item:{
   padding: 10,
   fontSize: 18,
    height: 44 
  }
}) */