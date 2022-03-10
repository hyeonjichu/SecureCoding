import React from "react"
import { StyleSheet, Text, View } from "react-native"

export default function BaseScreen(){

    return (
      <View style={style.container}>
          <Text>Base Screen</Text>
      </View>
    )
}

const style = StyleSheet.create({
    container:{
        backgroundColor: 'darkgreen'
    }
})