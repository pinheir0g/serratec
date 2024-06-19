import { Text, View } from "react-native"
import { PerfilProps } from "../routes/stack";

const Perfil = ({route}: PerfilProps) => {
    const { id } = route.params;
    return (
        <View>
            <Text> Perfil</Text>
            <Text> Seu ID é: {id}</Text>
        </View>
    )
}

export default Perfil