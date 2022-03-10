import React, { createContext, useCallback, useContext, useState } from "react"
import { Button, Text, View } from "react-native"
import { CountProvider } from "./src/component/CountProvider"
import First from "./src/component/First"
import TextProvider from "./src/component/TextProvider"

/* 
//useCallback: 함수 재사용
const MyButton = React.memo(({counterState, buttonValue}:any) => {
    console.log(`${buttonValue}가 클릭됨`)
    return <Button title={buttonValue} onPress={counterState}/>
})

export default function App(){

    const [countStateA, setCountStateA] = useState(0)
    const [countStateB, setCountStateB] = useState(0)
  
    const countIncrementA = useCallback(() => setCountStateA(countStateA + 1), [countStateA])
    const countIncrementB = useCallback(() => setCountStateB(countStateB + 1), [countStateB])

    return(
        <View>
            <Text>A button {countStateA}</Text>
            <MyButton counterState={countIncrementA} buttonValue="A button"/>
            <Text>B button {countStateB}</Text>
            <MyButton counterState={countIncrementB} buttonValue="B button"/>
        </View>
    )
} 
 */


//useContext, createContext: 값 넘기기
/* 
//////////////////#1 간단한 예
const ContextObj = createContext({})

const Welcome = () => {
    const messageText = useContext(ContextObj)
    console.log(messageText)

    return <Text>넘겨받은 값: {messageText}</Text>
}

export default function App(){

    const message = "I love react"

    return(
        <View>
            <ContextObj.Provider value={message}>
                <Welcome/>
            </ContextObj.Provider>     
        </View>
    )    
}
 */

//////////////////#2 조금 복잡한 예
export default function App(){
    // return(
    //     <View>
    //         <TextProvider>
    //             <First/>
    //         </TextProvider>
    //     </View>
    // )
    
    return(
        <View>
            <CountProvider>
                <First/>
            </CountProvider>
        </View>
    )
}