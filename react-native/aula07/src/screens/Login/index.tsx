import { Button, Text, TextInput, View } from "react-native"
import { styles } from "./styles";
import { useContext, useState } from "react";
import { signIn } from "../../services/auth";
import { AuthCtx } from "../../contexts/UserContext";

const Login = () => {

    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");

    const { login } = useContext(AuthCtx);

    const logar = async () => {
        await login(email, senha)
    };

    return (
        <View style={styles.container}>
            <Text>Login</Text>
            <TextInput 
            style={styles.input} 
            value={email} 
            onChangeText={setEmail} />
            <TextInput
                style={styles.input}
                value={senha}
                onChangeText={setSenha}
                secureTextEntry />
            <Button title="Entrar" onPress={logar} />
        </View>
    )
}

export default Login;