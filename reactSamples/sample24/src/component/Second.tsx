import React, { useContext } from "react"
import { Text, View } from "react-native"
import Third from "./Third"

export default function Second(){

    return(
        <View>
            <Text>Second Component</Text>
            <Third/>
        </View>
    )
}