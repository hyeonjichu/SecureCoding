import AsyncStorage from "@react-native-async-storage/async-storage"
import axios from "axios"
import React, { useState } from "react"
import { Alert, Image, StyleSheet, Text, TextInput, TouchableOpacity, View } from "react-native"

export default function Login({navigation}:any){

    const [id, setId] = useState("")
    const [pwd, setPwd] = useState("")

    function login(){
        if(id.trim() == ""){
            Alert.alert("id", "아이디를 입력해 주십시오.")
        }else if(pwd.trim() == ""){
            Alert.alert("pwd", "비밀번호를 입력해 주십시오.")
        }else{
            axios.post("http://192.168.45.4:3000/login", null, 
            {
                params: {
                    id: id,
                    pwd: pwd
                }
            }).then(function(res){
                if(res.data != null && res.data != ""){
                    console.log("로그인 되었습니다.")
                    console.log(res.data)

                    AsyncStorage.setItem('login', JSON.stringify(res.data))
                    navigation.navigate("bbs")
                    //loginData()

                }else{
                    Alert.alert("login", "아이디나 패스워드를 확인하세요.")
                }
            }).catch(function(e){
                console.log(e)
            })
        }
    }
/* 
    const loginData = async () => {
        try{
            let user = await AsyncStorage.getItem('login')
            console.log("login정보:"+user)
        }catch(e){}
    } */

    return(
        <View style={styles.container}>
            <Image style={styles.image} source={require("../../assets/logo2.png")}/>
            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="아이디를 입력하세요"
                    placeholderTextColor="#003f5c"
                    onChangeText={(id)=> setId(id)}/>
            </View>

            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="비밀번호를 입력하세요"
                    placeholderTextColor="#003f5c"
                    secureTextEntry={true}
                    onChangeText={(pwd)=> setPwd(pwd)}/>
            </View>

            <TouchableOpacity onPress={()=>navigation.navigate("account")}>
                <Text style={styles.forgot_button}>회원가입</Text>
            </TouchableOpacity>

            <TouchableOpacity style={styles.loginBtn} onPress={()=>login()}>
                <Text>로그인</Text>
            </TouchableOpacity>

        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        backgroundColor: "gray",
        alignItems: "center",
        justifyContent: "center"
    },
    image:{
        marginBottom: 40
    },
    inputView:{
        backgroundColor: "#ffc0cb",
        borderRadius: 30,
        width: "70%",
        height: 45,
        marginBottom: 20,
        alignItems: "center"
    },
    textInput: {
        height: 50,
        flex:1,
        padding: 10,
        marginLeft: 20,
    },
    forgot_button:{
        height: 30,
        marginBottom: 30
    },
    loginBtn:{
        width: "50%",
        borderRadius: 25,
        height: 50,
        alignItems: "center",
        justifyContent: "center",
        marginTop: 40,
        backgroundColor: "#ff1493"
    }
})