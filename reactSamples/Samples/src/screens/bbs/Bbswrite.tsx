import AsyncStorage from "@react-native-async-storage/async-storage";
import axios from "axios";
import React, { useState } from "react";
import { Alert, StyleSheet, Text, View } from "react-native";
import { Button, TextInput } from "react-native-paper";

function Bbswrite(props:any){
    const [id, setId] = useState("")
    const [title, setTitle] = useState("")
    const [content, setContent] = useState("")

    const loginData = async () => {
        try{
            let user = await AsyncStorage.getItem('login')
            if(user != null){
                setId(JSON.parse(user).id)
            }
        }catch(err){ }
    }
    loginData()
    

    function bbsWriteBtn(){
        console.log(id)
        console.log(title)
        console.log(content)

        if(title.trim() == ""){
            Alert.alert("제목을 입력하세요.")
        }else if(content.trim() == ""){
            Alert.alert("내용을 입력하세요.")
        }

        axios.get("http://192.168.45.4:3000/bbsWrite",
        {
            params:{
                id:id,
                title:title,
                content: content
            }
        }).then(function(res){
            console.log(res.data)
            if(res.data == "YES"){
                props.setBbslist("bbslist")
            }
        }).catch(function(){
            Alert.alert("추가되지 않았습니다.")
        })
    }

    return(
        <View>
            <Text style={styles.text}>글 추가</Text>
            <View style={{alignItems: 'center'}}>
                <TextInput
                    style={styles.textInput}
                    mode="outlined"
                    label="작성자"
                    value={id}
                    editable={false}/>
                <TextInput
                    style={styles.textInput}
                    mode="outlined"
                    label="제목"
                    value={title}
                    onChangeText={title=>setTitle(title)}/>
                <TextInput
                    style={styles.textArea}
                    placeholder="내용"
                    multiline={true}
                    numberOfLines={20}
                    value={content}
                    onChangeText={content=>setContent(content)}/>
                <Button
                    mode="outlined"
                    style={styles.button}
                    onPress={bbsWriteBtn}>작성완료</Button>
                    
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    text: {
        marginTop: 10,
        fontSize: 30,
        textAlign: "center",
        color: "purple"
    },
    textInput: {
        marginTop: 20,
        fontSize: 16,
        width: 500,
        height: 40,
        backgroundColor: "#e3e3e3"
    },
    textArea: {
        fontSize: 16,
        borderWidth: 1,
        marginTop: 20,
        backgroundColor: "#e3e3e3",
        textAlignVertical: "top",
        width: 500
    },
    button: {
        marginTop: 20,
        marginVertical: 8
    }
})

export default Bbswrite;