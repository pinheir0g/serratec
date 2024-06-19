import Home from "../screens/Home";
import Perfil from "../screens/Perfil";
import Feed from "../screens/Feed";
import { DrawerNavigationProp, DrawerScreenProps, createDrawerNavigator } from "@react-navigation/drawer";

type DrawerNavigation = {
  Home: undefined;
  Perfil: {id: number | string};
  Feed: {info: any};
}

export type DrawerTypes = DrawerNavigationProp<DrawerNavigation>
export type HomeProps = DrawerScreenProps<DrawerNavigation, "Home">
export type PerfilProps = DrawerScreenProps<DrawerNavigation, "Perfil">
export type FeedProps = DrawerScreenProps<DrawerNavigation, "Feed">

const {Navigator, Screen} = createDrawerNavigator<DrawerNavigation>()


const DrawerComponent = () => {
    return(
      <Navigator>
        <Screen name='Home' component={Home} options={{title: "Pagina Inicial"}}/>
        <Screen name='Perfil' component={Perfil} options={{title: "Meu Perfil"}}/>
        <Screen name='Feed' component={Feed} options={{title: "Meu Feed"}}/>
      </Navigator>
    );
}

export default DrawerComponent