import React from "react"
import { Text, View } from "react-native"

export default function App(){

  const color = "red"

  const samObj = {color:color}
  console.log(samObj)
  console.log(samObj.color)

  const samObj1 = {color}
  console.log(samObj1)

  const user = {
    name:"kim",
    id:23,
    age:18
  }

  console.log(user.name)
  console.log(user["id"])

  const points = {
    x:100,
    y:180
  }

  points.x = 300
  console.log(points)

  points.z = 200
  console.log(points)

  delete points.y
  console.log(points)

  const pointObj = { a: 10, b: 20, c: 30 }
  
  const keys = Object.keys(pointObj)
  console.log(keys)

  const values = Object.values(pointObj)
  console.log(values)

  const posts = [
    {
      id:1,
      content:"Java",
      like:3
    },
    {
      id:2,
      content:"Android",
      like:4
    },
    {
      id:3,
      content:"React Native",
      like:5
    }
  ]

  for(let i = 0; i<posts.length; i++){
    console.log(`타이틀: ${posts[i].content} 좋아요: ${posts[i].like}`)
  }

  posts.forEach((post) => {
    return console.log(`타이틀: ${post.content} 좋아요: ${post.like}`)
  })

/*   posts.forEach((post) => {
    return(
      <Text>타이틀: ${post.content} 좋아요: ${post.like}</Text>
    )
  }) */

  const objMap = posts.map((post) => {
    return `타이틀: ${post.content} 좋아요: ${post.like}`
  })
  console.log(objMap)

  return(
    <View>
      <Text>Hello Tsx</Text>
    </View>
  )
}