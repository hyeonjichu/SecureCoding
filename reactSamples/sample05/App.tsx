import React from "react"
import { Text, View } from "react-native"

export default function App(){

  const x = 10
  if(x === 10){
    console.log("x는 10입니다.")
  }

  let color = "red"
  if(color === "yellow"){
    console.log("yellow 입니다.")
  }else if(color === "red"){
    console.log("red 입니다.")
  }else{
    console.log("둘 다 아닙니다.")
  }

  const a = 5
  switch(a){
    case 1:
      console.log("a == 1")
      break
    case 5:
      console.log("a == 5")
      break
    default:
      console.log("y == ?")
  }

  for(let i =0; i<5; i++){
    console.log(`${i}번째 루프`)
  }

  let user = {
    name:"성춘향",
    age:24,
    address:"남원시"
  }

  //name, age, address가 출력됨
  for(let key in user){
    console.log(key, user[key])
  }

  //배열의 index값이 나옴
  let arrNum = [10, 20, 30]
  for(let i in arrNum){
    console.log(i, arrNum[i])
  }

  let w = 0
  while(w<5){
    console.log(`${w}번째 while`)
    w++
  }

  return(
    <View>
      <Text>Hello Tsx</Text>
    </View>
  )
}