import { StyleSheet, View } from "react-native";

export function Ex2(){
    return (
        <View style={styles.container}>
            <View style={styles.element}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent:'center'   
    },
    element: {
        // flex: .2,
        height: '14%',
        width: '100%',
        backgroundColor: 'aquamarine'

    }
})