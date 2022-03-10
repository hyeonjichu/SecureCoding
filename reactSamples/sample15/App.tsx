/*
  하나씩 install하기 
    npm install react-native-picker-select
    npm install @react-native-picker/picker
    npm install watcher
 */

import React, { useState } from "react"
import { Button, View } from "react-native"

import RNPickerSelect from 'react-native-picker-select'
/* 
const values= [
  {label:'Football', value:'축구'},
  {label:'baseball', value:'야구'},
  {label:'Hockey', value:'하키'},
]

export default function App(){

  const [pickerSelect, setPickerSelect] = useState("")
  const handleClick = () =>{
    console.log(pickerSelect)
  }

  return(
    <View>
      <RNPickerSelect
      onValueChange={(value) => setPickerSelect(value)}
      items={values}/>
      <Button title="선택" onPress={handleClick}/>
    </View>
  )
} 
*/

import SelectBox from 'react-native-multi-selectbox-typescript'

const K_OPTIONS = [
  {
    item: 'Juventus',
    id: 'JUVE',
  },
  {
    item: 'Real Madrid',
    id: 'RM',
  },
  {
    item: 'Barcelona',
    id: 'BR',
  },
  {
    item: 'PSG',
    id: 'PSG',
  },
  {
    item: 'FC Bayern Munich',
    id: 'FBM',
  },
  {
    item: 'Manchester United FC',
    id: 'MUN',
  },
  {
    item: 'Manchester City FC',
    id: 'MCI',
  },
  {
    item: 'Everton FC',
    id: 'EVE',
  },
  {
    item: 'Tottenham Hotspur FC',
    id: 'TOT',
  },
  {
    item: 'Chelsea FC',
    id: 'CHE',
  },
  {
    item: 'Liverpool FC',
    id: 'LIV',
  },
  {
    item: 'Arsenal FC',
    id: 'ARS',
  },

  {
    item: 'Leicester City FC',
    id: 'LEI',
  },
]

 export default function App(){
  const [selectedTeam, setSelectedTeam] = useState({})    //object
  const [selectedTeams, setSelectedTeams] = useState([])  //array

  function onChange(){
    return (val) => setSelectedTeam(val)
  }

  function selected(){
    console.log(selectedTeam)
    console.log(selectedTeam.id)
    console.log(selectedTeam.item)
  }

  return (
    <View style={{margin:30}}>
      <SelectBox
      label="Select Single"
      options={K_OPTIONS}
      value={selectedTeam}
      onChange={onChange()}
      hideInputFilter={false}/>
      <Button title="선택" onPress={selected}/>
    </View>
  )
}

