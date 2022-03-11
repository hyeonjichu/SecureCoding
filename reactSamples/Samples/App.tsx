import React from "react"
import { createNativeStackNavigator } from "@react-navigation/native-stack"
import { NavigationContainer } from "@react-navigation/native"
import Login from "./src/screens/member/Login"
import Account from "./src/screens/member/Account"
import Bbs from "./src/screens/bbs/Bbs"

/*
install
  npm install @react-navigation/native
  npm install @react-navigation/native-stack
  npm install react-native-safe-area-context
  npm install react-native-gesture-handler
  npm install react-native-screens
  npm install watcher

  npm install axios

  npm i @react-native-async-storage/async-storage

  npm i react-native-paper


*/

const Stack = createNativeStackNavigator()

export default function App(){
  return(
    <NavigationContainer>
      <Stack.Navigator initialRouteName="login">
        <Stack.Screen name="login" component={Login} options={{title:"로그인"}}/>
        <Stack.Screen name="account" component={Account} options={{title:"회원가입"}}/>
        <Stack.Screen name="bbs" component={Bbs} options={{title:"게시판"}}/>
      </Stack.Navigator>
    </NavigationContainer>
  )
}