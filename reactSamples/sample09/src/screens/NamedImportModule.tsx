import React from "react"
import { Text, View } from "react-native"

import {sampleVar, sampleFunc, sampleNumFunc, list} from "./NamedExportModule"

export default function NamedImportModule(){
    return (
        <View>
            <Text>NamedImportModule</Text>
            <Text>{sampleVar}</Text>
            <Text>{sampleFunc()}</Text>
            <Text>{sampleNumFunc(3,5)}</Text>
            <View>{list()}</View>
        </View>
    )
}