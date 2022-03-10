import React, { useState } from "react"
import { Button, Text, View } from "react-native"

export default function LikeButton(){
    const [liked, setLike] = useState(false)

    function likeBtn(){
        setLike(!liked)
    }

    return(
        <View>
            <Text>LikeButton</Text>
            <Button title={liked ? "클릭 on" : "클릭 off"} onPress={likeBtn}></Button>
        </View>
    )
}