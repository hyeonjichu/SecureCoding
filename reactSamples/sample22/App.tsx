import React, { useEffect, useState } from "react"
import { StyleSheet, Text, View } from "react-native"

export default function App(){

  console.log('App')

  return(
    <View style={styles.container}>
      <Clock/>
    </View>
  )
}

const Clock = () =>{
  const [date, setDate] = useState(() => new Date())

  useEffect(() => {

    //let mounted = true

    const timeId = setInterval(() => tick(), 1000)
    //console.log("setInterval")

    return() =>{
      clearInterval(timeId)
      //console.log("clearInterval")
      //mounted = false
    }
  })

  const tick = () =>{
    setDate(new Date())
  }

  return(
    <View style={styles.container}>
      <Text style={styles.timeText}>현재시간</Text>
      <Text style={styles.timeText}>{date.toLocaleTimeString()}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: "center",
    justifyContent: "center"
  },
  timeText: {
    fontSize: 30,
    fontWeight: "bold",
    color: '#000000'
  }
})