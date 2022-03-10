import React from "react"
import { Text, View } from "react-native"

import { sampleCallbackFunc, User } from "./ObjectExportModule" 

const newUser = new User("성춘향", 23)

export default function ObjectImportModule(){

    sampleCallbackFunc()

    return (
        <View>
            <Text>ObjectImportModule</Text>
            <Text>name:{newUser.name}, age:{newUser.age}</Text>
        </View>
    )
}