import { StyleSheet, View, Text } from 'react-native';

export default function Perfil() {
    return (
      <View style={styles.container}>
            <View style={styles.circleContainer}>
                <View style={styles.perfil}></View>
                <Text style={styles.texto}>Gustavo</Text>
            </View>
            <View style={styles.circleContainer}>
                <View style={styles.perfil}></View>
                <Text style={styles.texto}>Rapha</Text>
            </View>
            <View style={styles.circleContainer}>
                <View style={styles.perfil}></View>
                <Text style={styles.texto}>Bpstaude</Text>
            </View>
            <View style={styles.circleContainer}>
                <View style={styles.perfil}></View>
                <Text style={styles.texto}>Adicionar Novo</Text>
            </View>
      </View>
    );
  }

  const styles = StyleSheet.create({
    container: {
        flex: 0.4,
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'row',
        flexWrap: 'wrap',
    },
    circleContainer: {
        alignItems: 'center',
        margin: 20, 
    },
    perfil:{
        height: 100,
        width: 100,
        borderRadius: 50,
        borderColor: 'white',
        borderWidth: 2,
        backgroundColor: "aquamarine",
        marginBottom: 10,
    },
    texto:{
        fontSize: 15
    }
  })