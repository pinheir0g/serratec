import { StyleSheet, ImageBackground, View, Text, StatusBar } from 'react-native';
import Button from './src/components/Button';
import Perfil from './src/components/Perfil';

const profiles = [
  { title: 'Gustavo', image: require('./assets/gojo.png') },
  { title: 'Mimi', image: require('./assets/anya.png') },
  { title: 'Khezas', image: require('./assets/pochita.png') },
  { title: 'Adicionar Novo', image: require('./assets/novo.png') },
];

export default function App() {
  return (
    <View style={styles.container}>
      <ImageBackground
        source={require('./assets/bg.png')}
        style={styles.background}>
        <StatusBar/>
        <Text style={styles.texto}>Quem vai sair em uma aventura?</Text>
        <View style={styles.perfis}>
          {profiles && profiles.map((profile, index) => {
            return (
              <Perfil key={index} profile={profile} />
            );
          })}
        </View>
        <Button />
        <View style={styles.blackGround} />
      </ImageBackground>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  perfis: {
    flex: 0.61,
    flexDirection: 'row',
    justifyContent: 'space-around',
    flexWrap: 'wrap',
    zIndex: 2,
  },
  background: {
    flex: 1,
    resizeMode: 'cover',
    justifyContent: 'space-between',
  },
  texto: {
    top: 50,
    textAlign: 'center',
    color: 'white',
    fontSize: 25,
    width: '100%',
    zIndex: 2
  },
  blackGround: {
    backgroundColor: 'black',
    zIndex: 1,
    width: '100%',
    height: '100%',
    opacity: 0.7,
    position: 'absolute'
  }
});
