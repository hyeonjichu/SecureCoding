/* 
install 먼저 하기
  npm i react-native-flexi-radio-button --save
*/

import React, { useState } from "react"
import { Text, View } from "react-native"

import { RadioGroup, RadioButton } from 'react-native-flexi-radio-button'

export default function App(){

  const [checked, setChecked] = useState("first")

  return(
    <View>
      <RadioGroup 
      size={24} 
      thickness={2} 
      color='#9575b2' 
      highlightColor='#ccc8b9' 
      selectedIndex={1}
      onSelect={
        (index:any, value:any) => console.log(index, value)
      }>
        <RadioButton value="first" 
        status={checked === 'first' ? 'checked' : 'unchecked'}
        onPress={() => setChecked('first')}>
          <Text>Apple</Text>
          </RadioButton>
        <RadioButton value="second" 
        status={checked === 'second' ? 'checked' : 'unchecked'}
        onPress={() => setChecked('second')}>
          <Text>Banana</Text>
        </RadioButton>
      </RadioGroup>
    </View>
  )
}