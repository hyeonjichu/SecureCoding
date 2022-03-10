import React from "react"
import { SafeAreaView, Text } from "react-native"

import ObjectImportModule from "./src/screens/ObjectImportModule"

export default function App(){
  return (
    <SafeAreaView>
      <Text>App</Text>
      <ObjectImportModule></ObjectImportModule>
    </SafeAreaView>
  )
}