import axios from "axios";
import React, { useState } from "react";
import { Alert, Image, StyleSheet, Text, TextInput, TouchableHighlight, View } from "react-native";

export default function Account({navigation}:any){

    const [id, setId] = useState("")
    const [msg, setMsg] = useState("msg")

    const [pwd, setPwd] = useState("")
    const [name, setName] = useState("")
    const [email, setEmail] = useState("")

    function idChk(){
        console.log("idchk")
        console.log(`${id}`)

        if(id.trim() === ""){
            Alert.alert("아이디", "아이디를 입력해 주십시오")
            setId("")
        }

        axios.post("http://192.168.45.4:3000/getId", null, {params:{id:id}})
        .then(function(res){
            console.log(res.data)

            if(res.data == "OK"){
                setMsg("사용할 수 있는 아이디 입니다.")
            }else{
                setMsg("사용중인 아이디 입니다.")
                setId("")
            }
        })
        .catch(function(e){
            console.log(e)
        })
    }

    function regi(){
        if(id.trim() === ""){
            Alert.alert("아이디", "아이디를 입력해 주십시오")
        }else if(pwd.trim() === ""){
            Alert.alert("패스워드", "패스워드를 입력해 주십시오")
        }else if(name.trim() === ""){
            Alert.alert("이름", "이름을 입력해 주십시오")
        }else{
            axios.post("http://192.168.45.4:3000/addmember", null, 
                {
                    params: {
                        id:id,
                        pwd :pwd,
                        name:name,
                        email:email
                    }
                }
            ).then(function(res){
                console.log(res.data)

                if(res.data == "YES"){
                    Alert.alert("regi", "회원가입 되었습니다.",[{
                        text: '확인',
                        onPress: () => navigation.navigate("login")
                    }])
                }else{
                    Alert.alert("regi", "가입되지 않았습니다.")
                }
            }).catch(function(e){
                console.log(e)
            })
        }
    }

    return(
        <View style={styles.container}>
            <Image style={styles.logo} source={require("../../assets/welcome.jpg")}/>

            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="아이디"
                    value={id}
                    underlineColorAndroid='transparent'
                    onChangeText={(id)=> setId(id)}/>
            </View>

            <View style={styles.idTextContainer}>
                <Text style={styles.idText}>{msg}</Text>

                <TouchableHighlight style={[styles.buttonContainer, styles.sendButton]}
                                    onPress={() => idChk()}>
                    <Text style={styles.buttonText}>id 확인</Text>
                </TouchableHighlight>
            </View>

            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="비밀번호"
                    underlineColorAndroid='transparent'
                    onChangeText={(pwd)=> setPwd(pwd)}/>
            </View>

            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="이름"
                    underlineColorAndroid='transparent'
                    onChangeText={(name)=> setName(name)}/>
            </View>

            <View style={styles.inputView}>
                <TextInput
                    style={styles.textInput}
                    placeholder="이메일"
                    underlineColorAndroid='transparent'
                    onChangeText={(email)=> setEmail(email)}/>
            </View>

            <TouchableHighlight style={[styles.buttonContainer, styles.sendButton]} onPress={() => regi()}>
                <Text style={styles.buttonText}>회원가입</Text>
            </TouchableHighlight>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "gray"
    },
    logo: {
        justifyContent: "center",
        marginBottom: 60
    },
    inputView: {
        borderBottomColor: '#f5fcff',
        backgroundColor: '#dcdcdc',
        borderRadius: 30,
        borderBottomWidth: 1,
        width: 300,
        height: 45,
        marginBottom: 20,
        flexDirection: 'row',
        alignItems: "center"
    },
    textInput: {
        height: 45, 
        marginLeft: 16,
        borderBottomColor: '#fff',
        flex:1
    },
    buttonContainer: {
        height: 45,
        flexDirection: "row",
        justifyContent: "center",
        alignItems: "center",
        marginBottom: 20,
        width: 100,
        borderRadius: 30
    },
    sendButton: {
        backgroundColor: "orange"
    },
    idTextContainer: {
        height: 45,
        flexDirection: "row",
        justifyContent: "center",
        alignItems: "center",
        width: 100,
        borderRadius: 30
    },
    idText: {
        marginLeft: 20,
        marginBottom: 20,
        width: 180
    },
    buttonText: {
        color:"white"
    }
})