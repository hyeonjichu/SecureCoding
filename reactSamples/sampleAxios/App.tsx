import axios from "axios"
import React, { useEffect, useState } from "react"
import { Text, View } from "react-native"

/*
install하고 시작 
  npm install axios
*/

//item
const TodoItem = ({todo}:any) => {
  return (
    <View>
      <Text>{todo.id} {todo.name} {todo.email}</Text>
    </View>
  )
}


//list
const TodoList = ({toList}:any) => {
  return (
    <View>
      {toList.map((todo:any) => (
        <TodoItem key={todo.id} todo={todo}/>
      ))}
    </View>
  )
}


export default function App(){

  const [todoList, setTodoList] = useState([])

  useEffect(() => {

    let mounted = true

    const  fetchData = async () =>{

      //const response = await axios.get("http://192.168.45.4:3000/base", {})
      //const response = await axios.get('http://192.168.45.4:3000/connParamGet', {params: {title:"제목입니다."}})
      //const response = await axios.post('http://192.168.45.4:3000/getMember', null, {params: {id:"aaa", pwd:"111"}})
      await axios.get("http://192.168.45.4:3000/dbTest", {})
                            .then(function(response){
                              console.log(response.data)
                              //console.log(response.data.email)
                              console.log(response.data[0])

                              setTodoList(response.data)
                            })
                            .catch(function(err){
                              console.log(err)
                            })
      //console.log(response.data)
    }

    fetchData()
    return () => {
      mounted = false
    } 
  }, [])

  return(
    <View>
      <TodoList toList={todoList}/>
      <Text>test</Text>
    </View>
  )

}