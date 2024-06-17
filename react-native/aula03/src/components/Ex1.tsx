import { StyleSheet, View } from "react-native";

export function Ex1(){
    return (
        <View style={styles.container}></View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: 'aquamarine',
        width: '30%',
        alignSelf: "center"
    }
})