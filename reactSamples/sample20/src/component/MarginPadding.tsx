import React from "react"
import { StyleSheet, Text, View } from "react-native"

export const MarginPadding = () =>(
    <View style = {style.container}>
        <Text style={{color:'#000000'}}>제목입니다.</Text>
    </View>
)

const style = StyleSheet.create({
    container: {
        marginHorizontal: '10%',
        padding: 16,
        borderWidth: StyleSheet.hairlineWidth,
        borderColor: '#ccc',
        backgroundColor: '#ffff00'
    }
})