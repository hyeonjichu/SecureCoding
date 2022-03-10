import React, { useContext } from "react"
import { Text, View } from "react-native"
import { CountContext } from "./CountProvider"
import Second from "./Second"
import { TextContext } from "./TextProvider"

export default function First(){
    // const textData = useContext(TextContext)

    // return(
    //     <View>
    //         <Text>First Component {textData}</Text>
    //         <Second/>
    //     </View>
    // )

    return(
        <View>
            <Text>First Component</Text>
            <Second/>
        </View>
    )
}