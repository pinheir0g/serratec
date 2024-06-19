import { StyleSheet, TouchableOpacity, View, Text } from 'react-native';

export default function Button() {
    return (
      <View style={styles.container}>
           <TouchableOpacity>
            <Text style={styles.texto}>Gerenciar Perfis</Text>
           </TouchableOpacity>
      </View>
    );
  }

  const styles = StyleSheet.create({
    container:{
      height: 45,
      alignItems: 'center',
      zIndex: 2,
    },
    texto: {
      color: 'white',
      fontWeight: 'bold',
    }
  })