import React from "react"

const sampleCallbackFunc = () => {
    console.log("123")

    setTimeout(() => console.log("456"), 1000)

    console.log("789")
}

class User{
    name:String
    age:number

    constructor(name:String, age:number){
        this.name = name
        this.age = age
    }

    userAge(){
        return `${this.name} 님은 ${this.age} 살 입니다.`
    }
}

export {sampleCallbackFunc, User}