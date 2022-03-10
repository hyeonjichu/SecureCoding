import React from "react"
import { Text, View } from "react-native"

export default function App(){
/* 
  const shopping = ["빵", "햄", "우유"]
  console.log(shopping[0])
  console.log(shopping[4])  //error 안 남 -> undefined
  for(let i in shopping){
    console.log(shopping[i])
  }
 */

  //배열인지? 아닌지?
  const samArr = [] //array
  const samObj = {} //object
  
  console.log(Array.isArray(samArr))  //true
  console.log(Array.isArray(samObj))  //false

  const arrSam = ["red", "green", "blue"]

  console.log(arrSam)
  console.log(arrSam.indexOf("green"))
  console.log(arrSam.length)

  //정렬
  console.log(arrSam.sort())  //올림차순 정렬
  console.log(arrSam.reverse()) //내림차순 정렬

  const arrNum = [11,2,33,4]
  console.log(arrNum.sort())  //정렬안됨 -> ASCII로 정렬됨

  console.log(arrNum.sort((a,b) => a-b))  //오름
  console.log(arrNum.sort((a,b) => b-a))  //내림

  return(
    <View>
      <Text>Hello</Text>
    </View>
  )
}