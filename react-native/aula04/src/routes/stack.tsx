import { createNativeStackNavigator } from "@react-navigation/native-stack";
import Home from "../screens/Home";
import Perfil from "../screens/Perfil";

const {Navigator, Screen} = createNativeStackNavigator()


const StackComponent = () => {
    return(
      <Navigator>
        <Screen name='Home' component={Home} options={{title: "Pagina Inicial"}}/>
        <Screen name='Perfil' component={Perfil} options={{title: "Meu Perfil"}}/>
      </Navigator>  
      
    );
}

export default StackComponent