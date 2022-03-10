import { NavigationContainer } from "@react-navigation/native"
import { createNativeStackNavigator } from "@react-navigation/native-stack"
import React from "react"
import { View } from "react-native"
import DetailScreen from "./src/screens/DetailScreen"
import HomeScreen from "./src/screens/HomeScreen"


/*
install하고 시작
  npm install react-native-gesture-handler
  npm install @react-navigation/native
  npm install @react-navigation/native-stack
  npm install react-native-safe-area-context
  npm install react-native-screens
  npm install watcher

*/

const Stack = createNativeStackNavigator()

export default function App(){
  return(
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={HomeScreen}/>
        <Stack.Screen name="Detail" component={DetailScreen}/>
      </Stack.Navigator>
    </NavigationContainer>
  )
}