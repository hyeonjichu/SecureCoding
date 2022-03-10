import React from "react"
import { View, Text } from "react-native"

import NamedImportModule from "./src/screens/NamedImportModule"

export default function App(){

  return(
    <View>
      <Text>Hello Tsx</Text>
      <NamedImportModule></NamedImportModule>
    </View>
  )
}