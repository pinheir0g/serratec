import 'react-native-gesture-handler';
import { StatusBar } from 'expo-status-bar';
import Home from  './src/screens/Home'
import { NavigationContainer } from '@react-navigation/native';
import Routes from './src/routes';

export default function App() {
  return (
    <NavigationContainer>
      <Routes/>
      <StatusBar style="auto"/>
    </NavigationContainer>
  );
}

