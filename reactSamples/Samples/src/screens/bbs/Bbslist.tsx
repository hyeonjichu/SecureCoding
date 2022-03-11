import axios from "axios";
import React, { useEffect, useState } from "react";
import { FlatList, Image, StyleSheet, Text, TouchableOpacity, View } from "react-native";

function Item({id, title, readcount, seq, props}:any){

    function itemClick(seq:number){
        console.log("click")
        console.log(seq)

        axios.get("http://192.168.45.4:3000/bbsdetail", {params:{seq:seq}})
        .then(function(res){
            console.log(res.data)
            props.setBbs(res.data)
        }).catch(function(e){
            console.log(e)
        })
        props.setBbslist("bbsdetail")

    }

    return(
        <View style={styles.item}>
            <TouchableOpacity onPress={() => itemClick(seq)}>
                <View style={styles.idRow}>
                    <Image style={styles.image} source={require("../../assets/dog.png")}/>
                    <Text style={styles.title}>{title}</Text>
                </View>
                <View style={styles.idRow}>
                    <Text style={styles.id}>{id}</Text>
                    <Text style={styles.readcount}>{readcount}</Text>
                </View>
            </TouchableOpacity>
        </View>
    )
}


function Bbslist(props:any){
    const [data, setData] = useState([])
    
    function renderItem({item}:any){
        function strLength(str:String){
            if(str.length > 20){
                return str.substring(0, 20) + "..."
            }else{
                return str
            }
        }

        return(
            <Item id={"작성자:" + item.userid} title={strLength(item.title)} 
            readcount={"조회수: "+item.readcount} seq={item.seq} props={props}/>
        )
    }

    useEffect(() => {
        axios.get("http://192.168.45.4:3000/getBbsList", {})
        .then(function(res){
            console.log(res.data)
            setData(res.data)
        }).catch(function(err){
            console.log(err)
        })
    }, [])

    return (
        <View style={styles.scrView}>
            <FlatList data={data} renderItem={renderItem}/>
        </View>
    )
}

const styles = StyleSheet.create({

    item: {
        backgroundColor: '#d7d9f4',
        padding: 10,
        marginVertical: 2,   // 세로 영역
        marginHorizontal: 8,
        borderColor: 'purple',
        borderRadius: 15,
        borderStyle: 'solid',
        borderWidth: 2
    },
    image: {
        width: 50,
        height: 50,
        marginTop: 15
    },
    title: {
        fontFamily: "roboto-regular",
        paddingLeft: 20,
        color: "#400040",
        height: 60,
        width: 500,
        fontSize: 24,
    },
    id: {
        fontFamily: "roboto-regular",
        //backgroundColor: "#ffff00",
        color: "#121212",
        height: 30,
        width: 166,
        fontSize: 20,
        marginLeft: 80,
        marginTop: 8
    },
    readcount: {
        fontFamily: "roboto-regular",
        //backgroundColor: "#00ff00",
        color: "#121212",
        height: 30,
        width: 211,
        fontSize: 20,
        marginLeft: 51,
        marginTop: 8,
        textAlign: "center",
    },
    idRow: {
        height: 40,
        flexDirection: "row",
        marginLeft: 5,
    },
    scrView: {
        height: 760
    }

    
})

export default Bbslist;