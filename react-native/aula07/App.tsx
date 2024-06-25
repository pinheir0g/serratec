import 'react-native-gesture-handler';
import { StatusBar } from 'expo-status-bar';
import Home from './src/screens/Home'
import { NavigationContainer } from '@react-navigation/native';
import Routes from './src/routes';
import AuthProvider from './src/contexts/UserContext';
import MeuProvider from './src/contexts/MeuContexto';

export default function App() {
  return (
    <AuthProvider>
      <MeuProvider>
        <NavigationContainer>
          <Routes />
          <StatusBar style="auto" />
        </NavigationContainer>
      </MeuProvider>
    </AuthProvider>
  );
}

