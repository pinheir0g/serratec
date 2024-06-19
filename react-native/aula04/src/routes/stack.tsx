import { NativeStackNavigationProp, NativeStackScreenProps, createNativeStackNavigator } from "@react-navigation/native-stack";
import Home from "../screens/Home";
import Perfil from "../screens/Perfil";
import Feed from "../screens/Feed";

type StackNavigation = {
  Home: undefined;
  Perfil: {id: number | string};
  Feed: {info: any};
}

export type StackTypes = NativeStackNavigationProp<StackNavigation>
export type HomeProps = NativeStackScreenProps<StackNavigation, "Home">
export type PerfilProps = NativeStackScreenProps<StackNavigation, "Perfil">
export type FeedProps = NativeStackScreenProps<StackNavigation, "Feed">

const {Navigator, Screen} = createNativeStackNavigator<StackNavigation>()


const StackComponent = () => {
    return(
      <Navigator>
        <Screen name='Home' component={Home} options={{title: "Pagina Inicial"}}/>
        <Screen name='Perfil' component={Perfil} options={{title: "Meu Perfil"}}/>
        <Screen name='Feed' component={Feed} options={{title: "Meu Feed"}}/>
      </Navigator>
    );
}

export default StackComponent