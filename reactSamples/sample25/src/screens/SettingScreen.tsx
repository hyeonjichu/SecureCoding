import React from "react"
import { StyleSheet, Text, View } from "react-native"

export default function SettingScreen(){

    return (
        <View style={style.container}>
            <Text>Setting Screen</Text>
        </View>
    )
}

const style = StyleSheet.create({
    container:{
        backgroundColor: '#0000ff'
    }
})