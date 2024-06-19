import { StyleSheet, Text, View } from "react-native"
import { FeedProps } from "../routes/stack";

const Feed = ({route}: FeedProps) => {
    const { info } = route.params;
    return (
        <View>
            <Text style={styles.texto}> {info}</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    texto:{
        textAlign: 'center',
        fontSize: 80
    }
})
export default Feed