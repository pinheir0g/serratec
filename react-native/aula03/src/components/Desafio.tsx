import { StyleSheet, View } from "react-native";

export function Desafio(){
    return (
        <View style={styles.container}>
             <View style={styles.statusbar}></View>
             <View style={styles.perfil}>
                <View style={styles.quad}></View>
                <View style={styles.detail}></View>
             </View>
             <View style={styles.conteudoCentral}>
                <View style={styles.part1}/>
                <View style={styles.part2}/>
             </View>
             <View style={styles.feed}>
                <View style={styles.feedItem}></View>
                <View style={styles.feedItem}></View>
                <View style={styles.feedItem}></View>
                <View style={styles.feedItem}></View>
                <View style={styles.feedItem}></View>
                <View style={styles.feedItem}></View>
             </View>
             <View style={styles.footer}/>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex:1
    },
    statusbar: {
        height: 30,
        backgroundColor: 'aquamarine'
    },
    perfil: {
        flex:5,
        alignItems: "center",
        justifyContent: "space-evenly"
    },
    quad:{
        width: 100,
        height: 100,
        backgroundColor: "orange"

    },
    detail: {
        width: "35%",
        height: 40,
        backgroundColor: "orange"
    },
    conteudoCentral: {
        flex: 1.5,
        backgroundColor: 'aquamarine',
        flexDirection: "row"
    },
    part1:{
        backgroundColor: 'purple',
        height: "90%",
        width: "50%"
    },
    part2: {
        backgroundColor: 'steelblue',
        height: "90%",
        width: "50%"
    },
    feed: {
        flex: 5,
        flexDirection: "row",
        flexWrap: "wrap",
        justifyContent: "space-around",
        alignContent: "space-around"
    },
    feedItem: {
        height: 100,
        width: 100,
        backgroundColor: 'orange',
        
    },
    footer: {
        flex: 1,
        backgroundColor: 'steelblue',
    }, 
})