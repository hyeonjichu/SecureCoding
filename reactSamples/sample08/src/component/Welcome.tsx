import React from "react"
import { Platform, StyleSheet, Text, View } from "react-native"

export default function Welcome(props:any){
  return (
    <View>
      <Text style={styles.text}>
        Hello Welcome {props.name}
      </Text>
      <Text style={styles.text}>나이: {props.age}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  text:{
    fontFamily:Platform.select({
      android:"serif"
    }),
    fontSize: 30
  }
})