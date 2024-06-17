import { StyleSheet, View } from "react-native";

export function Ex0(){
    return (
        <View style={styles.container}>
            <View style={styles.quad0}>
                <View style={styles.quad}/>
                <View style={[styles.quad, styles.quad2]}/>
                <View style={[styles.quad, styles.quad3]}/>

            </View>
            <View style={styles.quad0}>
                <View style={[styles.quad, styles.quad2]}/>
                <View style={[styles.quad, styles.quad0]}/>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      alignItems: 'center',
      flexDirection: 'column',
      alignSelf: 'center',
      
  
    },
    quad: {
        height: 80,
        width: 80,
        backgroundColor: '#ffcc01',
    },
    quad2:{
        backgroundColor: '#f42b26',
    },
    quad3: {
        backgroundColor: '#23b73b',
    },
    quad0: {
        justifyContent: 'space-between'
    }
})