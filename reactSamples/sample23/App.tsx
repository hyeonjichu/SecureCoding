import React, { useMemo, useState } from "react"
import { Button, Text, View } from "react-native"

/*
  useMemo: 연산된 값을 rendering시에 재사용 할 때 사용된다
  useMemo( func, 검사할 배열 )
*/

function square(params:any){
  const testData = [Array(10).keys]
  testData.forEach(() => {
    console.log(`계산중...루프처리 ${testData.length}회 실행중`)
  })

  return params * params
}

export default function App(){

  const [countStateA, setCountStateA] = useState(0)
  const [countStateB, setCountStateB] = useState(0)

  function countResultA(){
    setCountStateA((prevCount) => prevCount + 1)
    console.log("A + 1 버튼이 클릭됨")
  }

  function countResultB(){
    setCountStateB((prevCount) => prevCount + 1)
    console.log("B + 1 버튼이 클릭됨")
  }

  //const squareArea =  square(countStateB)   //A버튼을 눌러도 호출됨
  const squareArea = useMemo(() => square(countStateB), [countStateB])    //B버튼을 누르는 경우에만 호출됨

  return(
    <View>
      <Text>계산결과 A</Text>
      <Button title="계산: A + 1" onPress={countResultA}/>

      <Text>계산결과 B</Text>
      <Button title="계산: B + 1" onPress={countResultB}/>

      <Text>정사각형 면적</Text>
      <Text>계산 결과 x 계산 결과 = {squareArea}</Text>
    </View>
  )
}