import { useNavigation } from "@react-navigation/native"
import React from "react"
import { Button, StyleSheet, Text, View } from "react-native"

export default function HomeScreen(){
    const navigation = useNavigation()

    return(
        <View style={styles.container}>
            <Text>home screen</Text>
            <Button title="go Detail" onPress={() => navigation.navigate('Detail')}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center"
    }
})