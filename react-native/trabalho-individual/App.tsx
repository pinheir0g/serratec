import { StyleSheet, ImageBackground, View, Text } from 'react-native';
import Button from './src/components/Button';
import Perfil from './src/components/Perfil';

export default function App() {
  return (
    <View style={styles.container}>
        <ImageBackground 
          source={require('./assets/bg.png')}
          style={styles.background}>
            <Text style={styles.texto}>Quem vai sair em uma aventura?</Text>
            <Perfil/>
            <Button/>
      </ImageBackground>

    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  }, 
  background:{
    flex: 1,    
    resizeMode: 'cover',
    justifyContent: 'center',
  },
  texto:{
    position: 'absolute',
    top: 50, 
    textAlign: 'center',
    color: 'white',
    fontSize: 25,
    width: '100%',
    
  }
});
