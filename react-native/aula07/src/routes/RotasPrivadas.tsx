
import {createStackNavigator} from '@react-navigation/stack';

import Home from "../screens/Home";

const {Navigator, Screen} = createStackNavigator()

const RotasPrivadas = () => {
    return(
        <Navigator>
            <Screen name="Home" component={Home}/>
        </Navigator>
    )
}

export default RotasPrivadas;