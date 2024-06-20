import { useNavigation } from "@react-navigation/native"
import { Button, View } from "react-native"
import { HomeProps, StackTypes } from "../routes/stack"

const Home = ({navigation}: any) => {
    // const navigation = useNavigation<StackTypes>()

    const handlePressPerfil = () => {
        navigation.navigate("Perfil", {id: 55})
    }
    const handlePressFeed = () => {
        navigation.navigate("Feed", {info: "Hello, World!"})
    }

    const toggleDrawer = () => {
        navigation.toggleDrawer();
    }
    return (
        <View style={{flex: 1, justifyContent: "center", alignItems: "center"}}>
            <Button 
            title="navegar para perfil"
            onPress={() => handlePressPerfil()}>
            </Button>

            <Button 
            title="navegar para feed"
            onPress={() => handlePressFeed()}>
            </Button>
            
            <Button 
            title="Toggle Drawer"
            onPress={() => toggleDrawer()}>
            </Button>
        </View>
    )
}

export default Home