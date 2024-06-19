import "react-native-gesture-handler"
import { NavigationContainer } from '@react-navigation/native';
import StackComponent from './src/routes/stack';
import DrawerComponent from "./src/routes/drawer";
export default function App() {

  return (
   <NavigationContainer>
      <DrawerComponent/>
   </NavigationContainer>
  );
}


