import React, { useState } from "react";
import { Button, StyleSheet, Text, View } from "react-native";
import Bbsdetail from "./Bbsdetail";
import Bbslist from "./Bbslist";
import Bbswrite from "./Bbswrite";

function Bbs(){

    const [bbslist, setBbslist] = useState("bbslist")
    const [bbs, setBbs] = useState({})

    let child:any
    if(bbslist == "bbslist"){
        //child = (<Text>Bbslist View</Text>)
        child = (<Bbslist setBbslist={setBbslist} setBbs={setBbs}/>)
    }else if(bbslist == "bbswrite"){
        //child = (<Text>bbswrite View</Text>)
        child = (<Bbswrite setBbslist={setBbslist}/>)
    }else if(bbslist == "bbsdetail"){
        //child = (<Text style={{color:'black'}}>bbsdetail View {JSON.stringify(bbs)}</Text>)
        child = (<Bbsdetail bbs={bbs}/>)
    }

    return(
        <View>
            <View style={styles.menu}>
                <View style={styles.button}>
                    <Button title="글 목록" onPress={bbslist=>setBbslist("bbslist")}/>
                </View>
                <View style={styles.button}>
                    <Button title="글 추가" onPress={bbslist=>setBbslist("bbswrite")}/>
                </View>
            </View>
            <View>{child}</View>
        </View>
    )
}

const styles = StyleSheet.create({
    menu: {
        flexDirection: "row",
        flexWrap: "wrap"
    },
    button: {
        flex: 1,
        height: 50, 
        margin: 1
    },
    childView: {
        height: 760
    }
})

export default Bbs;