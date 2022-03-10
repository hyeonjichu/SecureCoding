import React from "react"
import { StyleSheet, Text, View } from "react-native"

export default function Flexbox(){
    return (
        <View style={style.container}>
            <Text style={style.item}>아이템 1</Text>
            <Text style={style.item}>아이템 2</Text>
            <Text style={style.item}>아이템 3</Text>
            <Text style={style.item}>아이템 4</Text>
            <Text style={style.item}>아이템 5</Text>
            <Text style={style.item}>아이템 6</Text>
        </View>
    )
}

const style = StyleSheet.create({
    container: {
        flexDirection: 'row',    //가로 정렬
        flexWrap: 'wrap'         //줄 바꿈
    },
    item: {
        width: 100,
        height: 100,
        borderWidth: StyleSheet.hairlineWidth,
        borderColor: '#ccc'
    }
})