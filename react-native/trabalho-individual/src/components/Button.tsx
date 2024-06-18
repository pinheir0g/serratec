import { StyleSheet, Text, View } from 'react-native';

export default function Button() {
    return (
      <View style={styles.container}>
            <Button></Button>
      </View>
    );
  }

  const styles = StyleSheet.create({
    container:{
      marginTop: 20,
      alignItems: 'center',
    },
  })