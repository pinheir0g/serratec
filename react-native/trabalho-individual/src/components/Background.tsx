import { StyleSheet, ImageBackground } from 'react-native';

export default function Background() {
  return (
      <ImageBackground 
        source={require('../../assets/bg.png')}
        style={styles.background}>
      </ImageBackground>
  );
}


const styles = StyleSheet.create({
    background:{
      flex: 1,    
      resizeMode: 'cover',
      justifyContent: 'center',
    }
  });