import { StyleSheet, View, Text, Image } from 'react-native';

type PerfilProps = {
    profile: {
        image: any,
        title: string
    }
}

const Perfil = ({ profile }: PerfilProps) => {
    return (
        <View style={styles.container}>
            <Image source={profile.image} style={styles.perfil} />
            <Text style={styles.texto}>{profile.title}</Text>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        alignItems: 'center',
        margin: 20,
    },
    perfil: {
        height: 130,
        width: 130,
        borderRadius: 100,
        borderColor: 'white',
        borderWidth: 2,
        marginBottom: 10,
    },
    texto: {
        fontSize: 15,
        color: 'white',
    }
})

export default Perfil