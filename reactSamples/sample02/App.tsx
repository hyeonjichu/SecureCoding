import React from "react"
import { SafeAreaView, Text } from "react-native"

/* 
export default function App(){

  //let str = 'Hello World'
  //const = 상수 -> 변경될 수 없음
  const str:String = 'Hello World'


  return (
    // 루트 tag 필요함
    <SafeAreaView>  
      <Text>Hello TSX World</Text>
      <Text>{ str }</Text>
    </SafeAreaView>
  )
} */

// css == style

/*
  tag     attribute       property    ==> 속성
    <div id="root" style="background:black">
      <p>hello</p>  =>  자식 요소
    </div>
*/

export default function App(){
  const isLoading = true

  /* 
  //return 내부에 조건절 쓸 수 없음
  if(isLoading){
    return(
      <SafeAreaView>
        <Text>Loading...</Text>
      </SafeAreaView>
    )
  }else{
    return(
      <SafeAreaView>
        <Text>Hello tsx World</Text>
      </SafeAreaView>
    )
  } */

  /* 
  //위와 결과 동일함
  return(
    <SafeAreaView>
      {isLoading && <Text>Loading...</Text>}
      {!isLoading && <Text>Hello tsx World</Text>}
    </SafeAreaView>
  ) */

  /* 
  const child = isLoading ? (<Text>Loading...</Text>) : (<Text>Hello tsx World</Text>)
  return <SafeAreaView>{child}</SafeAreaView>
 */

  /* 
  const child = [
    <Text>Hello tsx1 World</Text>,
    <Text>Hello tsx2 World</Text>,
    <Text>Hello tsx3 World</Text>
  ]
 */

  const child = ["hello", "my", "world"].map(i => <Text>Hello tsx {i} World</Text>)
  return <SafeAreaView>{child}</SafeAreaView>
}