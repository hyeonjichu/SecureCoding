import React, { createContext } from "react"

export const TextContext = createContext({})

interface Props {
    children: JSX.Element
}

export default function TextProvider({children}:Props){
    const text = "이것은 전달한 값입니다."

    return (
        <TextContext.Provider value={text}>
            {children}
        </TextContext.Provider>
    )
}