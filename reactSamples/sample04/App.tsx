import React from "react"
import { SafeAreaView, Text } from "react-native"

const global = "전역상수값"

//함수형 변수
const sampleFunc = () => {
  console.log("sampleFunc 호출")

  const local = "지역상수값"

  console.log(global)
  console.log(local)
}

export default function App(){

  sampleFunc()

  //let var
  if(true){
    let name = "Kelly"
    var hobby = "game"
  }
  //let은 범위 내에서만 사용 가능, 같은 범위에서 같은 변수명 사용 불가능
  //console.log(name)


  //var은 동일한 이름으로 여러 번 선언 가능
  var hobby = "reading"
  var hobby = "sleep"
  console.log(hobby)

  //리터럴
  const age = 24
  const myAge = `홍길동 ${age}`
  console.log(myAge)

  //연산자
  //const str = null
  const str = undefined
  if(str === null || str === undefined){
    console.log("null 또는 undefinded 입니다.")
  }

  if(str == null || str == undefined){
    console.log("== null or undefined")
  }

  let ex1 = null
  ex1 ?? console.log("null 입니다.")

  ex1 = undefined
  ex1 ?? console.log("undefined 입니다.")

  ex1 = "Hi Nice to meet you"
  console.log(ex1 ?? "null 입니다.")  //NVL IFNULL
/* 
  //error아님, type 지정 안해줘서 생기는 것
  function rectArea(width:any, height){
    const result = width * height
    return result
  } */
/* 
  const rectArea = function(width:any, height){
    const result = width * height
    return result
  } */

  const rectArea = (width = 7, height = 9) =>{  //arrow식
    const result = width * height
    return result
  }

  console.log(rectArea(4,6))
  console.log(rectArea())

  //가변인수
  const func = (a, b, ...rest) =>{
    console.log(rest)
  }
  func(1,2,3,4,5)

  //object
  const user = {
    name : "홍길동",
    message : "나는 성공할 것입니다."
  }

  //const samFunc = ({ message }:any) => console.log(message)
  const samFunc = (hUser:any) =>{
    console.log(hUser.name, hUser.message)
  } 

  samFunc(user)

  return(
    <SafeAreaView>
      <Text>Hello Tsx World</Text>
    </SafeAreaView>
  )
}