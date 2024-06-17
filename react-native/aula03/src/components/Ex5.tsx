import { StyleSheet, View } from "react-native";

export function Ex5(){
    return (
        <View style={styles.container}>
            <View style={styles.quad}/>
            <View style={[styles.quad, styles.quad2]}/>
            <View style={[styles.quad, styles.quad3]}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      flexDirection: 'column-reverse',
      alignItems: 'flex-end',
  
    },
    quad: {
        height: 80,
        width: 80,
        backgroundColor: 'darkorange',
    },
    quad2:{
        backgroundColor: 'red',
    },
    quad3: {
        backgroundColor: 'green',
    }
})